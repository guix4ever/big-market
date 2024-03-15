package org.guix.domain.strategy.service.annotation;

import org.guix.domain.strategy.service.rule.factory.DefaultLogicFactory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: Guix
 * @description: 策略自定义注解
 * @date: 2024/3/15 20:17
 * @version: 1.0
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface LogicStrategy {

    DefaultLogicFactory.LogicModel logicMode();

}