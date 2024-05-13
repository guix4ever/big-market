package org.guix.domain.strategy.service;

import java.util.Map;

/**
 * @author: Guix
 * @description: 抽奖规则接口；提供对规则的业务功能查询
 * @date: 2024/4/26 13:59
 * @version: 1.0
 */
public interface IRaffleRule {

    /**
     * 根据规则树ID集合查询奖品中加锁数量的配置「部分奖品需要抽奖N次解锁」
     *
     * @param treeIds 规则树ID值
     * @return key 规则树，value rule_lock 加锁值
     */
    Map<String, Integer> queryAwardRuleLockCount(String[] treeIds);

}
