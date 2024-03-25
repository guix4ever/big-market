package org.guix.domain.strategy.service.rule.chain.impl;

import lombok.extern.slf4j.Slf4j;
import org.guix.domain.strategy.service.armory.IStrategyDispatch;
import org.guix.domain.strategy.service.rule.chain.AbstractLogicChain;
import org.guix.domain.strategy.service.rule.chain.factory.DefaultChainFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author: Guix
 * @description: 默认的责任链「作为最后一个链」
 * @date: 2024/3/18 22:48
 * @version: 1.0
 */
@Slf4j
@Component("default")
public class DefaultLogicChain extends AbstractLogicChain {

    @Resource
    protected IStrategyDispatch strategyDispatch;

    @Override
    public DefaultChainFactory.StrategyAwardVO logic(String userId, Long strategyId) {
        Integer awardId = strategyDispatch.getRandomAwardId(strategyId);
        log.info("抽奖责任链-默认处理 userId: {} strategyId: {} ruleModel: {} awardId: {}", userId, strategyId, ruleModel(), awardId);
        return DefaultChainFactory.StrategyAwardVO.builder()
                .awardId(awardId)
                .logicModel(ruleModel())
                .build();
    }

    @Override
    protected String ruleModel() {
        return DefaultChainFactory.LogicModel.RULE_DEFAULT.getCode();
    }

}