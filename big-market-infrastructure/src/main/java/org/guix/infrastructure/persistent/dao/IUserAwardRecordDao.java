package org.guix.infrastructure.persistent.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouterStrategy;
import org.apache.ibatis.annotations.Mapper;
import org.guix.infrastructure.persistent.po.UserAwardRecord;

/**
 * @author: Guix
 * @description: 用户中奖记录表
 * @date: 2024/4/22 20:21
 * @version: 1.0
 */
@Mapper
@DBRouterStrategy(splitTable = true)
public interface IUserAwardRecordDao {

    void insert(UserAwardRecord userAwardRecord);

}