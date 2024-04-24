package org.guix.domain.task.repository;

import org.guix.domain.task.model.entity.TaskEntity;

import java.util.List;

/**
 * @author: Guix
 * @description: 任务服务仓储接口
 * @date: 2024/4/23 16:59
 * @version: 1.0
 */
public interface ITaskRepository {

    List<TaskEntity> queryNoSendMessageTaskList();

    void sendMessage(TaskEntity taskEntity);

    void updateTaskSendMessageCompleted(String userId, String messageId);

    void updateTaskSendMessageFail(String userId, String messageId);

}
