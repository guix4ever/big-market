package org.guix.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Guix
 * @description: 策略条件实体
 * @date: 2024/3/18 17:17
 * @version: 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyConditionEntity {

    /** 用户ID */
    private String userId;
    /** 策略ID */
    private Integer strategyId;

}