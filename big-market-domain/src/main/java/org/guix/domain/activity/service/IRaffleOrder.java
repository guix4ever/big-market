package org.guix.domain.activity.service;

import org.guix.domain.activity.model.entity.ActivityOrderEntity;
import org.guix.domain.activity.model.entity.ActivityShopCartEntity;

/**
 * @author: Guix
 * @description: 抽奖活动订单接口
 * @date: 2024/4/8 10:26
 * @version: 1.0
 */
public interface IRaffleOrder {

    /**
     * 以sku创建抽奖活动订单，获得参与抽奖资格（可消耗的次数）
     *
     * @param activityShopCartEntity 活动sku实体，通过sku领取活动。
     * @return 活动参与记录实体
     */
    ActivityOrderEntity createRaffleActivityOrder(ActivityShopCartEntity activityShopCartEntity);

}