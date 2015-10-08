package com.ocelot.proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory implements InvocationHandler{

    private Object delegate; // 被代理的对象

    public Object bind(Object delegate){
        this.delegate = delegate;
        return Proxy.newProxyInstance(delegate.getClass().getClassLoader(),
                delegate.getClass().getInterfaces(),
                this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceUtil.startPerformance();
        Object result = null;
        try{
            result = method.invoke(delegate, args);
        } catch(Exception e){
        }
        PerformanceUtil.endPerformance();
        return result;
    }
}
