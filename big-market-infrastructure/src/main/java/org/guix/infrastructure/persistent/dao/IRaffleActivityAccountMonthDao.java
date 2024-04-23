package org.guix.infrastructure.persistent.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouter;
import org.apache.ibatis.annotations.Mapper;
import org.guix.infrastructure.persistent.po.RaffleActivityAccountMonth;

/**
 * @author: Guix
 * @description: 抽奖活动账户表-月次数
 * @date: 2024/4/22 20:20
 * @version: 1.0
 */
@Mapper
public interface IRaffleActivityAccountMonthDao {

    @DBRouter
    RaffleActivityAccountMonth queryActivityAccountMonthByUserId(RaffleActivityAccountMonth raffleActivityAccountMonthReq);

    int updateActivityAccountMonthSubtractionQuota(RaffleActivityAccountMonth raffleActivityAccountMonth);

    void insertActivityAccountMonth(RaffleActivityAccountMonth raffleActivityAccountMonth);

}
