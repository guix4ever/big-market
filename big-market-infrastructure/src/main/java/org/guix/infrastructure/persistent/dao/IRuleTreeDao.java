package org.guix.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.guix.infrastructure.persistent.po.RuleTree;

/**
 * @author: Guix
 * @description: 规则树表DAO
 * @date: 2024/3/24 20:56
 * @version: 1.0
 */
@Mapper
public interface IRuleTreeDao {

    RuleTree queryRuleTreeByTreeId(String treeId);

}