package org.guix.domain.strategy.service.armory;

/**
 * @author: Guix
 * @description: 策略装配库，负责初始化策略计算
 * @date: 2024/3/11 15:05
 * @version: 1.0
 */
public interface IStrategyArmory {

    /**
     * 装配抽奖策略配置「触发的时机可以为活动审核通过后进行调用」
     *
     * @param strategyId 策略ID
     * @return 装配结果
     */
    boolean assembleLotteryStrategy(Long strategyId);

    /**
     * 装配抽奖策略配置「触发的时机可以为活动审核通过后进行调用」
     *
     * @param activityId 活动ID
     * @return 装配结果
     */
    boolean assembleLotteryStrategyByActivityId(Long activityId);
}
