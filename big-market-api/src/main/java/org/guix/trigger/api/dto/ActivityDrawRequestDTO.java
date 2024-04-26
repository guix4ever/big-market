package org.guix.trigger.api.dto;

import lombok.Data;

/**
 * @author: Guix
 * @description: 活动抽奖请求对象
 * @date: 2024/4/25 14:41
 * @version: 1.0
 */
@Data
public class ActivityDrawRequestDTO {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 活动ID
     */
    private Long activityId;

}
