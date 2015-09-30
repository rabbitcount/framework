package com.ocelot.sourcecode.spring.aop.usecase.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class HijackAfterMethod implements AfterReturningAdvice
{
    public void afterReturning(Object returnValue, Method method,
                               Object[] args, Object target) throws Throwable {
        System.out.println("HijackAfterMethod : After method hijacked!");
    }
}
