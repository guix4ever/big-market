package org.guix.domain.strategy.service.armory;

import lombok.extern.slf4j.Slf4j;
import org.guix.domain.strategy.model.entity.StrategyAwardEntity;
import org.guix.domain.strategy.repository.IStrategyRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.util.*;

/**
 * @author: Guix
 * @description: 策略装配库，负责初始化策略计算
 * @date: 2024/3/11 15:09
 * @version: 1.0
 */

@Service
@Slf4j
public class StrategyArmory implements IStrategyArmory{

    @Resource
    private IStrategyRepository repository;
    /**
     * 装配抽奖策略配置「触发的时机可以为活动审核通过后进行调用」
     * @param strategyId 策略ID
     * @return 装配结果
     */
    @Override
    public boolean assembleLotteryStrategy(Long strategyId) {
        // 1. 查询策略配置
        List<StrategyAwardEntity> strategyAwardEntities = repository.queryStrategyAwardList(strategyId);

        //2.获取最小概率值
        BigDecimal minAwardRate = strategyAwardEntities.stream()
                .map(StrategyAwardEntity::getAwardRate)
                .min(BigDecimal::compareTo)
                .orElse(BigDecimal.ZERO);
        //3.获取概率值总和
        BigDecimal totalAwardRate = strategyAwardEntities.stream()
                .map(StrategyAwardEntity::getAwardRate)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        //4.用 1 % 0.0001获取概率范围
        BigDecimal rateRange = totalAwardRate.divide(minAwardRate, 0, RoundingMode.CEILING);


        //5.生成策略奖品概率查找表「这里指需要在list集合中，存放上对应的奖品占位即可，占位越多等于概率越高」
        List<Integer> strategyAwardSearchRateTables = new ArrayList<>(rateRange.intValue());
        for (StrategyAwardEntity strategyAward : strategyAwardEntities) {
            Integer awardId = strategyAward.getAwardId();
            BigDecimal awardRate = strategyAward.getAwardRate();
            // 计算出每个概率值需要存放到查找表的数量，循环填充
            for (int i = 0; i < rateRange.multiply(awardRate).setScale(0, RoundingMode.CEILING).intValue(); i++) {
                strategyAwardSearchRateTables.add(awardId);
            }
        }


        //6.对存储的奖品进行乱序操作
        Collections.shuffle(strategyAwardSearchRateTables);


        //7.生成出Map集合，key值，对应的就是后续的概率值。通过概率来获得对应的奖品ID
        Map<Integer, Integer> shuffleStrategyAwardSearchRateTable = new LinkedHashMap<>();
        for (int i = 0; i < strategyAwardSearchRateTables.size(); i++) {
            shuffleStrategyAwardSearchRateTable.put(i, strategyAwardSearchRateTables.get(i));
        }


        //8.存储到Redis
        repository.storeStrategyAwardSearchRateTable(strategyId, shuffleStrategyAwardSearchRateTable.size(), shuffleStrategyAwardSearchRateTable);

        return true;


    }

    @Override
    public Integer getRandomAwardId(Long strategyId) {
        // 分布式部署下，不一定为当前应用做的策略装配。也就是值不一定会保存到本应用，而是分布式应用，所以需要从 Redis 中获取。
        int rateRange = repository.getRateRange(strategyId);
        // 通过生成的随机值，获取概率值奖品查找表的结果
        return repository.getStrategyAwardAssemble(strategyId, new SecureRandom().nextInt(rateRange));
    }


}
