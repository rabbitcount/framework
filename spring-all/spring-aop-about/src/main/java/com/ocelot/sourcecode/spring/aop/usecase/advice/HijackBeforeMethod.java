package com.ocelot.sourcecode.spring.aop.usecase.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class HijackBeforeMethod implements MethodBeforeAdvice
{

    public void before(Method method, Object[] args, Object target)
            throws Throwable {
        System.out.println("HijackBeforeMethod : Before method hijacked!");
    }
}
