package org.guix.domain.strategy.service.rule.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: Guix
 * @description: 抽奖策略责任链，判断走那种抽奖策略。如；默认抽象、权重抽奖、黑名单抽奖,内部封装装配操作
 * @date: 2024/3/18 22:32
 * @version: 1.0
 */
@Slf4j
public abstract class AbstractLogicChain implements ILogicChain {

    private ILogicChain next;

    @Override
    public ILogicChain next() {
        return next;
    }

    @Override
    public ILogicChain appendNext(ILogicChain next) {
        this.next = next;
        return next;
    }

    protected abstract String ruleModel();//自己定义过滤规则模型

}