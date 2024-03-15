package org.guix.domain.strategy.service.rule.impl;

import lombok.extern.slf4j.Slf4j;
import org.guix.domain.strategy.model.entity.RuleActionEntity;
import org.guix.domain.strategy.model.entity.RuleMatterEntity;
import org.guix.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import org.guix.domain.strategy.repository.IStrategyRepository;
import org.guix.domain.strategy.service.annotation.LogicStrategy;
import org.guix.domain.strategy.service.rule.ILogicFilter;
import org.guix.domain.strategy.service.rule.factory.DefaultLogicFactory;
import org.guix.types.common.Constants;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author: Guix
 * @description: TODO
 * @date: 2024/3/15 20:41
 * @version: 1.0
 */
@Slf4j
@Component
@LogicStrategy(logicMode = DefaultLogicFactory.LogicModel.RULE_BLACKLIST)
public class RuleBackListLogicFilter implements ILogicFilter {

    @Resource
    private IStrategyRepository repository;
    @Override
    public RuleActionEntity filter(RuleMatterEntity ruleMatterEntity) {
        log.info("规则过滤-黑名单 userId:{} strategyId:{} ruleModel:{}", ruleMatterEntity.getUserId(), ruleMatterEntity.getStrategyId(), ruleMatterEntity.getRuleModel());
        String userId = ruleMatterEntity.getUserId();

        //从仓储里查询规则值配置

        String ruleValue = repository.queryStrategyRuleValue(ruleMatterEntity.getStrategyId(), ruleMatterEntity.getAwardId(), ruleMatterEntity.getRuleModel());
        //分割出数据库里的user001 user002这些字段
        String[] splitRuleValue = ruleValue.split(Constants.COLON);
        Integer awardId = Integer.parseInt(splitRuleValue[0]);
        // 过滤其他规则
        String[] userBlackIds = splitRuleValue[1].split(Constants.SPLIT);
        for (String userBlackId : userBlackIds) {
            if (userId.equals(userBlackId)) {//发现是黑名单，需要接管
                return RuleActionEntity.<RuleActionEntity.RaffleBeforeEntity>builder()
                        .ruleModel(DefaultLogicFactory.LogicModel.RULE_BLACKLIST.getCode())
                        .data(RuleActionEntity.RaffleBeforeEntity.builder()
                                .strategyId(ruleMatterEntity.getStrategyId())
                                .awardId(awardId)
                                .build())
                        .code(RuleLogicCheckTypeVO.TAKE_OVER.getCode())
                        .info(RuleLogicCheckTypeVO.TAKE_OVER.getInfo())
                        .build();
            }
        }

        return RuleActionEntity.<RuleActionEntity.RaffleBeforeEntity>builder()//不是黑名单，放行
                .code(RuleLogicCheckTypeVO.ALLOW.getCode())
                .info(RuleLogicCheckTypeVO.ALLOW.getInfo())
                .build();
    }
}
