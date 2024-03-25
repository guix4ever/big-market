package org.guix.domain.strategy.service.rule.chain;

/**
 * @author: Guix
 * @description: 责任链装配
 * @date: 2024/3/18 22:32
 * @version: 1.0
 */
public interface ILogicChainArmory {
    ILogicChain next();

    ILogicChain appendNext(ILogicChain next);
}
