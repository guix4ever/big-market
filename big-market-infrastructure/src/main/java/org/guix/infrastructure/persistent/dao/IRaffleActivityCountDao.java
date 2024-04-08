package org.guix.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.guix.infrastructure.persistent.po.RaffleActivityCount;

/**
 * @author: Guix
 * @description: 抽奖活动次数配置表Dao
 * @date: 2024/4/7 20:24
 * @version: 1.0
 */
@Mapper
public interface IRaffleActivityCountDao {
    RaffleActivityCount queryRaffleActivityCountByActivityCountId(Long activityCountId);

}