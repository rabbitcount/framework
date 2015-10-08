package com.ocelot.proxy.plainproxy;

public class OfferImpl implements IOffer{

    public void postOffer() {
        System.out.println("modify offer");
    }

    public void modifyOffer() {
        System.out.println("post offer");
    }
}
