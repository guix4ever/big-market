package org.guix.domain.activity.service.rule.impl;

import lombok.extern.slf4j.Slf4j;
import org.guix.domain.activity.model.entity.ActivityCountEntity;
import org.guix.domain.activity.model.entity.ActivityEntity;
import org.guix.domain.activity.model.entity.ActivitySkuEntity;
import org.guix.domain.activity.service.rule.AbstractActionChain;
import org.springframework.stereotype.Component;

/**
 * @author: Guix
 * @description: 活动基本规则过滤【日期、状态】节点
 * @date: 2024/4/8 15:17
 * @version: 1.0
 */
@Slf4j
@Component("activity_base_action")
public class ActivityBaseActionChain extends AbstractActionChain {

    @Override
    public boolean action(ActivitySkuEntity activitySkuEntity, ActivityEntity activityEntity, ActivityCountEntity activityCountEntity) {

        log.info("活动责任链-基础信息【有效期、状态】校验开始。");

        return next().action(activitySkuEntity, activityEntity, activityCountEntity);
    }

}
