package org.guix.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.guix.infrastructure.persistent.po.StrategyRule;

import java.util.List;

@Mapper

public interface IStrategyRuleDao {
    List<StrategyRule> queryStrategyRuleList();

    StrategyRule queryStrategyRule(StrategyRule strategyRuleReq);

    String queryStrategyRuleValue(StrategyRule strategyRule);
}
