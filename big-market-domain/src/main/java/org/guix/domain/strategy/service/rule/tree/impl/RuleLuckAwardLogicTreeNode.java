package org.guix.domain.strategy.service.rule.tree.impl;

import lombok.extern.slf4j.Slf4j;
import org.guix.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import org.guix.domain.strategy.service.rule.tree.ILogicTreeNode;
import org.guix.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;
import org.springframework.stereotype.Component;

/**
 * @author: Guix
 * @description: 兜底奖励节点
 * @date: 2024/3/21 17:17
 * @version: 1.0
 */
@Slf4j
@Component("rule_luck_award")
public class RuleLuckAwardLogicTreeNode implements ILogicTreeNode {

    @Override
    public DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId) {
        return DefaultTreeFactory.TreeActionEntity.builder()
                .ruleLogicCheckType(RuleLogicCheckTypeVO.TAKE_OVER)
                .strategyAwardVO(DefaultTreeFactory.StrategyAwardVO.builder()
                        .awardId(101)
                        .awardRuleValue("1,100")
                        .build())
                .build();
    }

}