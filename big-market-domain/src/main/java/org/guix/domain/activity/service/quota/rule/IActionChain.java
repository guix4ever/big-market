package org.guix.domain.activity.service.quota.rule;

import org.guix.domain.activity.model.entity.ActivityCountEntity;
import org.guix.domain.activity.model.entity.ActivityEntity;
import org.guix.domain.activity.model.entity.ActivitySkuEntity;

/**
 * @author: Guix
 * @description: 下单规则过滤接口
 * @date: 2024/4/8 15:15
 * @version: 1.0
 */
public interface IActionChain extends IActionChainArmory {

    boolean action(ActivitySkuEntity activitySkuEntity, ActivityEntity activityEntity, ActivityCountEntity activityCountEntity);

}
