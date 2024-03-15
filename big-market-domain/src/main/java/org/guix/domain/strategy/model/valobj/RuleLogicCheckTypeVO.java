package org.guix.domain.strategy.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: Guix
 * @description: TODO
 * @date: 2024/3/15 19:49
 * @version: 1.0
 */
@Getter
@AllArgsConstructor
public enum RuleLogicCheckTypeVO {

    ALLOW("0000", "放行；执行后续的流程，不受规则引擎影响"),
    TAKE_OVER("0001","接管；后续的流程，受规则引擎执行结果影响"),
    ;

    private final String code;
    private final String info;

}
