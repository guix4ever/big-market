package org.guix.domain.task.service;

import org.guix.domain.task.model.entity.TaskEntity;

import java.util.List;

/**
 * @author: Guix
 * @description: TODO
 * @date: 2024/4/23 16:58
 * @version: 1.0
 */
public interface ITaskService {

    /**
     * 查询发送MQ失败和超时1分钟未发送的MQ
     *
     * @return 未发送的任务消息列表10条
     */
    List<TaskEntity> queryNoSendMessageTaskList();

    void sendMessage(TaskEntity taskEntity);

    void updateTaskSendMessageCompleted(String userId, String messageId);

    void updateTaskSendMessageFail(String userId, String messageId);

}
