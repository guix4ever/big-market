package org.guix.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

/**
 * @author: Guix
 * @description: 任务表，发送MQ
 * @date: 2024/4/22 15:58
 * @version: 1.0
 */
@Data
public class Task {

    /** 自增ID */
    private String id;
    /** 消息主题 */
    private String topic;
    /** 消息主体 */
    private String message;
    /** 任务状态；create-创建、completed-完成、fail-失败 */
    private String state;
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;

}
