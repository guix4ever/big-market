package org.guix.trigger.api.dto;

import lombok.Data;

/**
 * @author: Guix
 * @description: 抽奖请求参数
 * @date: 2024/3/31 8:47
 * @version: 1.0
 */
@Data
public class RaffleStrategyRequestDTO {

    // 抽奖策略ID
    private Long strategyId;

}