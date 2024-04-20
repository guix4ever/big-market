package org.guix.domain.activity.service.rule;

/**
 * @author: Guix
 * @description: 活动规则过滤责任链装配
 * @date: 2024/4/8 15:14
 * @version: 1.0
 */
public interface IActionChainArmory {

    IActionChain next();

    IActionChain appendNext(IActionChain next);

}