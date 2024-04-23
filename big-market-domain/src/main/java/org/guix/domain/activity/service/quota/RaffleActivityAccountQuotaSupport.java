package org.guix.domain.activity.service.quota;

import org.guix.domain.activity.model.entity.ActivityCountEntity;
import org.guix.domain.activity.model.entity.ActivityEntity;
import org.guix.domain.activity.model.entity.ActivitySkuEntity;
import org.guix.domain.activity.repository.IActivityRepository;
import org.guix.domain.activity.service.quota.rule.factory.DefaultActivityChainFactory;

/**
 * @author: Guix
 * @description: 抽奖活动的支撑类
 * @date: 2024/4/8 15:12
 * @version: 1.0
 */
public class RaffleActivityAccountQuotaSupport {


    protected DefaultActivityChainFactory defaultActivityChainFactory;

    protected IActivityRepository activityRepository;

    public RaffleActivityAccountQuotaSupport(IActivityRepository activityRepository, DefaultActivityChainFactory defaultActivityChainFactory) {
        this.activityRepository = activityRepository;
        this.defaultActivityChainFactory = defaultActivityChainFactory;
    }

    public ActivitySkuEntity queryActivitySku(Long sku) {
        return activityRepository.queryActivitySku(sku);
    }

    public ActivityEntity queryRaffleActivityByActivityId(Long activityId) {
        return activityRepository.queryRaffleActivityByActivityId(activityId);
    }

    public ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId) {
        return activityRepository.queryRaffleActivityCountByActivityCountId(activityCountId);
    }
}
