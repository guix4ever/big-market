package org.guix.domain.activity.model.aggregate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.guix.domain.activity.model.entity.ActivityAccountEntity;
import org.guix.domain.activity.model.entity.ActivityOrderEntity;

/**
 * @author: Guix
 * @description: 下单聚合对象
 * @date: 2024/4/8 10:23
 * @version: 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderAggregate {

    /**
     * 活动账户实体
     */
    private ActivityAccountEntity activityAccountEntity;
    /**
     * 活动订单实体
     */
    private ActivityOrderEntity activityOrderEntity;

}