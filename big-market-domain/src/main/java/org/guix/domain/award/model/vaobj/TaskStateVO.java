package org.guix.domain.award.model.vaobj;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: Guix
 * @description: 任务状态值对象
 * @date: 2024/4/23 17:30
 * @version: 1.0
 */
@Getter
@AllArgsConstructor
public enum TaskStateVO {

    create("create", "创建"),
    complete("complete", "发送完成"),
    fail("fail", "发送失败"),
    ;

    private final String code;
    private final String desc;

}
