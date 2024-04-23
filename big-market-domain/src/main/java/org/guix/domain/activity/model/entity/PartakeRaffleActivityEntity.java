package org.guix.domain.activity.model.entity;

import lombok.Data;

/**
 * @author: Guix
 * @description: 参与抽奖活动实体对象
 * @date: 2024/4/22 20:05
 * @version: 1.0
 */
@Data
public class PartakeRaffleActivityEntity {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 活动ID
     */
    private Long activityId;

}
