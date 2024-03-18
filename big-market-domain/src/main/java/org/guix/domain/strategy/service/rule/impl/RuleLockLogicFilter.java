package org.guix.domain.strategy.service.rule.impl;

import lombok.extern.slf4j.Slf4j;
import org.guix.domain.strategy.model.entity.RuleActionEntity;
import org.guix.domain.strategy.model.entity.RuleMatterEntity;
import org.guix.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import org.guix.domain.strategy.repository.IStrategyRepository;
import org.guix.domain.strategy.service.annotation.LogicStrategy;
import org.guix.domain.strategy.service.rule.ILogicFilter;
import org.guix.domain.strategy.service.rule.factory.DefaultLogicFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author: Guix
 * @description: 用户抽奖n次后，对应奖品可解锁抽奖（次数校验规则）
 * @date: 2024/3/18 16:53
 * @version: 1.0
 */
@Slf4j
@Component
@LogicStrategy(logicMode = DefaultLogicFactory.LogicModel.RULE_LOCK)
public class RuleLockLogicFilter implements ILogicFilter<RuleActionEntity.RaffleCenterEntity> {

    @Resource
    private IStrategyRepository repository;

    // 用户抽奖次数，后续完成这部分流程开发的时候，从数据库/Redis中读取
    private Long userRaffleCount = 0L;

    @Override
    public RuleActionEntity<RuleActionEntity.RaffleCenterEntity> filter(RuleMatterEntity ruleMatterEntity) {
        log.info("规则过滤-次数锁 userId:{} strategyId:{} ruleModel:{}", ruleMatterEntity.getUserId(), ruleMatterEntity.getStrategyId(), ruleMatterEntity.getRuleModel());

        // 查询规则值配置；当前奖品ID，抽奖中规则对应的校验值。如；1、2、6
        String ruleValue = repository.queryStrategyRuleValue(ruleMatterEntity.getStrategyId(), ruleMatterEntity.getAwardId(), ruleMatterEntity.getRuleModel());
        long raffleCount = Long.parseLong(ruleValue);

        // 用户抽奖次数大于规则限定值，规则放行
        if (userRaffleCount>= raffleCount) {
            return RuleActionEntity.<RuleActionEntity.RaffleCenterEntity>builder()
                    .code(RuleLogicCheckTypeVO.ALLOW.getCode())
                    .info(RuleLogicCheckTypeVO.ALLOW.getInfo())
                    .build();
        }

        // 用户抽奖次数小于规则限定值，规则拦截
        return RuleActionEntity.<RuleActionEntity.RaffleCenterEntity>builder()
                .code(RuleLogicCheckTypeVO.TAKE_OVER.getCode())
                .info(RuleLogicCheckTypeVO.TAKE_OVER.getInfo())
                .build();
    }

}
