package org.guix.domain.activity.service.rule.impl;

import lombok.extern.slf4j.Slf4j;
import org.guix.domain.activity.model.entity.ActivityCountEntity;
import org.guix.domain.activity.model.entity.ActivityEntity;
import org.guix.domain.activity.model.entity.ActivitySkuEntity;
import org.guix.domain.activity.service.rule.AbstractActionChain;
import org.springframework.stereotype.Component;

/**
 * @author: Guix
 * @description: 商品库存规则节点
 * @date: 2024/4/8 15:19
 * @version: 1.0
 */
@Slf4j
@Component("activity_sku_stock_action")
public class ActivitySkuStockActionChain extends AbstractActionChain {

    @Override
    public boolean action(ActivitySkuEntity activitySkuEntity, ActivityEntity activityEntity, ActivityCountEntity activityCountEntity) {
        log.info("活动责任链-商品库存处理【校验&扣减】开始。");

        return true;
    }

}