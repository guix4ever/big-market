package org.guix.domain.activity.repository;

import org.guix.domain.activity.model.entity.ActivityCountEntity;
import org.guix.domain.activity.model.entity.ActivityEntity;
import org.guix.domain.activity.model.entity.ActivitySkuEntity;

/**
 * @author: Guix
 * @description: 活动仓储接口
 * @date: 2024/4/8 10:26
 * @version: 1.0
 */
public interface IActivityRepository {

    ActivitySkuEntity queryActivitySku(Long sku);

    ActivityEntity queryRaffleActivityByActivityId(Long activityId);

    ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId);

}
