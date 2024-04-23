package org.guix.infrastructure.persistent.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouter;
import org.apache.ibatis.annotations.Mapper;
import org.guix.infrastructure.persistent.po.RaffleActivityAccountDay;

/**
 * @author: Guix
 * @description: 抽奖活动账户表-日次数
 * @date: 2024/4/22 20:19
 * @version: 1.0
 */
@Mapper
public interface IRaffleActivityAccountDayDao {

    @DBRouter
    RaffleActivityAccountDay queryActivityAccountDayByUserId(RaffleActivityAccountDay raffleActivityAccountDayReq);

    int updateActivityAccountDaySubtractionQuota(RaffleActivityAccountDay raffleActivityAccountDay);

    void insertActivityAccountDay(RaffleActivityAccountDay raffleActivityAccountDay);

}
