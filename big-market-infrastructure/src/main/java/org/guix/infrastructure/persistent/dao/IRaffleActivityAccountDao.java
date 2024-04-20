package org.guix.infrastructure.persistent.dao;

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
}