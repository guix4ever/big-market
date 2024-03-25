package org.guix.domain.strategy.service.rule.chain;

import org.guix.domain.strategy.service.rule.chain.factory.DefaultChainFactory;

/**
 * @author: Guix
 * @description: 责任链接口
 * @date: 2024/3/18 22:25
 * @version: 1.0
 */
public interface ILogicChain extends ILogicChainArmory{

    /**
     * 责任链接口(不同过滤规则实现不同逻辑)
     * @param userId 用户ID
     * @param strategyId 策略ID
     * @return 奖品ID
     */
    DefaultChainFactory.StrategyAwardVO logic(String userId, Long strategyId);
}
