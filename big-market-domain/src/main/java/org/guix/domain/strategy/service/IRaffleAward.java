package org.guix.domain.strategy.service;

import org.guix.domain.strategy.model.entity.StrategyAwardEntity;

import java.util.List;

/**
 * @author: Guix
 * @description: 策略奖品接口
 * @date: 2024/3/31 8:45
 * @version: 1.0
 */
public interface IRaffleAward {
    /**
     * 根据策略ID查询抽奖奖品列表配置
     *
     * @param strategyId 策略ID
     * @return 奖品列表
     */
    List<StrategyAwardEntity> queryRaffleStrategyAwardList(Long strategyId);
}
