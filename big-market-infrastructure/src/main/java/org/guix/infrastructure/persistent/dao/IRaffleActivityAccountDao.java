package org.guix.infrastructure.persistent.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouter;
import org.apache.ibatis.annotations.Mapper;
import org.guix.infrastructure.persistent.po.RaffleActivityAccount;

/**
 * @author: Guix
 * @description: 抽奖活动账户表
 * @date: 2024/4/7 20:23
 * @version: 1.0
 */
@Mapper
public interface IRaffleActivityAccountDao {
    //没有账户就插入
    void insert(RaffleActivityAccount raffleActivityAccount);
   //有就更新
    int updateAccountQuota(RaffleActivityAccount raffleActivityAccount);

    @DBRouter
    RaffleActivityAccount queryActivityAccountByUserId(RaffleActivityAccount raffleActivityAccountReq);

    int updateActivityAccountSubtractionQuota(RaffleActivityAccount raffleActivityAccount);

    void updateActivityAccountMonthSurplusImageQuota(RaffleActivityAccount raffleActivityAccount);

    void updateActivityAccountDaySurplusImageQuota(RaffleActivityAccount raffleActivityAccount);
}