package org.guix.domain.strategy.service.rule.tree.factory.engine;

import org.guix.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

/**
 * @author: Guix
 * @description: 规则树组合接口
 * @date: 2024/3/21 17:20
 * @version: 1.0
 */
public interface IDecisionTreeEngine {

    DefaultTreeFactory.StrategyAwardVO process(String userId, Long strategyId, Integer awardId);

}
