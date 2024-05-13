package org.guix.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.guix.infrastructure.persistent.po.RuleTreeNode;

import java.util.List;

/**
 * @author: Guix
 * @description: 规则树节点表DAO
 * @date: 2024/3/24 20:58
 * @version: 1.0
 */
@Mapper
public interface IRuleTreeNodeDao {

    List<RuleTreeNode> queryRuleTreeNodeListByTreeId(String treeId);

    List<RuleTreeNode> queryRuleLocks(String[] treeIds);
}