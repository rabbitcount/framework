package com.ocelot.proxy.plainproxy;

import com.ocelot.proxy.jdkdynamicproxy.PerformanceUtil;

public class OfferProxy implements IOffer{

    private IOffer delegate;

    public OfferProxy(IOffer delegate){
        this.delegate = delegate;
    }

    public void postOffer() {
        PerformanceUtil.startPerformance();
        delegate.postOffer();
        PerformanceUtil.endPerformance();
    }

    public void modifyOffer() {
        PerformanceUtil.startPerformance();
        delegate.modifyOffer();
        PerformanceUtil.endPerformance();
    }

    public void setOffer(IOffer delegate){
        this.delegate = delegate;
    }
}
