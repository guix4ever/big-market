package org.guix.domain.strategy.service.rule.tree;

import org.guix.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

/**
 * @author: Guix
 * @description: 规则树接口
 * @date: 2024/3/21 17:16
 * @version: 1.0
 */
public interface ILogicTreeNode {

    DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId, String ruleValue);

}