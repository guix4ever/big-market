package org.guix.infrastructure.persistent.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouter;
import org.apache.ibatis.annotations.Mapper;
import org.guix.infrastructure.persistent.po.Task;

import java.util.List;

/**
 * @author: Guix
 * @description: 任务表，发送MQ
 * @date: 2024/4/22 20:20
 * @version: 1.0
 */
@Mapper
public interface ITaskDao {

    void insert(Task task);

    @DBRouter
    void updateTaskSendMessageCompleted(Task task);

    @DBRouter
    void updateTaskSendMessageFail(Task task);

    List<Task> queryNoSendMessageTaskList();

}
