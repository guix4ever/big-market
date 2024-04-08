package org.guix.infrastructure.persistent.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouter;
import cn.bugstack.middleware.db.router.annotation.DBRouterStrategy;
import org.apache.ibatis.annotations.Mapper;
import org.guix.infrastructure.persistent.po.RaffleActivityOrder;

import java.util.List;

/**
 * @author: Guix
 * @description: 抽奖活动单Dao
 * @date: 2024/4/7 20:25
 * @version: 1.0
 */
@Mapper
@DBRouterStrategy(splitTable = true)
public interface IRaffleActivityOrderDao {

    @DBRouter(key = "userId")
    void insert(RaffleActivityOrder raffleActivityOrder);

    @DBRouter
    List<RaffleActivityOrder> queryRaffleActivityOrderByUserId(String userId);

}