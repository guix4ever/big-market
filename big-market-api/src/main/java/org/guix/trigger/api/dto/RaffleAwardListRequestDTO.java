package org.guix.trigger.api.dto;

import lombok.Data;

/**
 * @author: Guix
 * @description: 抽奖奖品列表，请求对象
 * @date: 2024/3/31 8:46
 * @version: 1.0
 */
@Data
public class RaffleAwardListRequestDTO {

    // 抽奖策略ID
    private Long strategyId;

}