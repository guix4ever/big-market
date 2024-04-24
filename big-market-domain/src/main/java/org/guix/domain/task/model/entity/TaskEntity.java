package org.guix.domain.task.model.entity;

import lombok.Data;

/**
 * @author: Guix
 * @description: 任务实体对象
 * @date: 2024/4/23 16:58
 * @version: 1.0
 */
@Data
public class TaskEntity {

    /** 活动ID */
    private String userId;
    /** 消息主题 */
    private String topic;
    /** 消息编号 */
    private String messageId;
    /** 消息主体 */
    private String message;

}