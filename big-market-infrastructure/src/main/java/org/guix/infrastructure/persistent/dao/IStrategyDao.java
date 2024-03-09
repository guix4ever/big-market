package org.guix.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.guix.infrastructure.persistent.po.Strategy;

import java.util.List;

@Mapper
public interface IStrategyDao {
    List<Strategy> queryStrategyList();

    Strategy queryStrategyByStrategyId(Long strategyId);
}
