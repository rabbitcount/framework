package com.ocelot.proxy.cglibproxy;

import com.ocelot.proxy.jdkdynamicproxy.PerformanceUtil;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor{

    private Object delegate;

    public Object bind(Object delegate){
        this.delegate = delegate;

        Enhancer hancer = new Enhancer();
        // 设置父类
        hancer.setSuperclass(delegate.getClass());
        // 回调
        hancer.setCallback(this);
        return hancer.create();
    }

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        PerformanceUtil.startPerformance();
        Object o = methodProxy.invoke(this.delegate, args);
        PerformanceUtil.endPerformance();
        return o;
    }
}
