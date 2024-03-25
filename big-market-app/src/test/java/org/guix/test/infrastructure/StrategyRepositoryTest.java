package org.guix.test.infrastructure;

import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.guix.domain.strategy.model.valobj.RuleTreeVO;
import org.guix.domain.strategy.repository.IStrategyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author: Guix
 * @description: TODO
 * @date: 2024/3/24 21:05
 * @version: 1.0
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyRepositoryTest {

    @Resource
    private IStrategyRepository strategyRepository;

    @Test
    public void queryRuleTreeVOByTreeId() {
        RuleTreeVO ruleTreeVO = strategyRepository.queryRuleTreeVOByTreeId("tree_lock");
        log.info("测试结果：{}", JSON.toJSONString(ruleTreeVO));
    }

}
