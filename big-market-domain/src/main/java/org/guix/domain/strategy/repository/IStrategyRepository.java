package org.guix.domain.strategy.repository;

import org.guix.domain.strategy.model.entity.StrategyAwardEntity;
import org.guix.domain.strategy.model.entity.StrategyEntity;
import org.guix.domain.strategy.model.entity.StrategyRuleEntity;
import org.guix.domain.strategy.model.valobj.StrategyAwardRuleModelVO;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author: Guix
 * @description: 策略服务仓储接口
 * @date: 2024/3/11 15:11
 * @version: 1.0
 */
public interface IStrategyRepository {
    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(String key, Integer rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);

    Integer getStrategyAwardAssemble(String key, Integer rateKey);

    int getRateRange(Long strategyId);

    int getRateRange(String key);


    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleWeight);

    String queryStrategyRuleValue(Long strategyId, Integer awardId, String ruleModel);

    StrategyAwardRuleModelVO queryStrategyAwardRuleModelVO(Long strategyId, Integer awardId);
}
