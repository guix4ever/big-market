package org.guix.domain.strategy.service.rule;

import org.guix.domain.strategy.model.entity.RuleActionEntity;
import org.guix.domain.strategy.model.entity.RuleMatterEntity;

/**
 * @author: Guix
 * @description: 抽奖规则过滤接口
 * @date: 2024/3/15 19:36
 * @version: 1.0
 */
public interface ILogicFilter<T extends RuleActionEntity.RaffleEntity> {

    RuleActionEntity<T> filter(RuleMatterEntity ruleMatterEntity);

}