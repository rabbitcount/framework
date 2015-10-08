package com.ocelot.proxy;

import com.ocelot.proxy.cglibproxy.CglibProxyFactory;
import com.ocelot.proxy.cglibproxy.DefaultOffer;
import com.ocelot.proxy.jdkdynamicproxy.ProxyFactory;
import com.ocelot.proxy.plainproxy.IOffer;
import com.ocelot.proxy.plainproxy.OfferImpl;
import com.ocelot.proxy.plainproxy.OfferProxy;

public class ProxyTest {

    /**
     * plain方法,使用代理模式
     * 实现简单,但当有大量类需要代理时,需要逐个手工添加;
     */
    public void plainTest(){
        IOffer offer = new OfferProxy(new OfferImpl());
        offer.postOffer();
        offer.modifyOffer();
    }

    /**
     * 基于JDK动态代理
     * 基于JDK的反射(reflect)机制; 参考InvocationHandler
     *
     * InvocationHandler is the interface implemented by the invocation handler of a proxy instance.
     *
     * Each proxy instance has an associated invocation handler. When a method is invoked on a proxy instance,
     * the method invocation is encoded and dispatched to the invoke method of its invocation handler.
     */
    public void jdkDynamicProxyTest(){
        IOffer offer = (IOffer)(new ProxyFactory().bind(new OfferImpl()));
        offer.postOffer();
        offer.modifyOffer();
    }

    /**
     * CGLIB代理
     * 如果目标对象没有实现任何接口时,可以通过CGLIB实现代理
     */
    public void cglibProxyTest(){
        DefaultOffer offer = (DefaultOffer)new CglibProxyFactory().bind(new DefaultOffer());
        offer.postOffer();
        offer.modifyOffer();
    }

}
