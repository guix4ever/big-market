package org.guix.domain.activity.service.rule;

/**
 * @author: Guix
 * @description: 下单规则责任链抽象类
 * @date: 2024/4/8 15:18
 * @version: 1.0
 */
public abstract class AbstractActionChain implements IActionChain {

    private IActionChain next;

    @Override
    public IActionChain next() {
        return next;
    }

    @Override
    public IActionChain appendNext(IActionChain next) {
        this.next = next;
        return next;
    }

}