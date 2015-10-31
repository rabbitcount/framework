package com.ocelot.basic.pattern.decorator;

/**
 * 原始接口的默认实现,待扩展的类
 */
public class ConcreteComponent implements Component{

    @Override
    public void operation() {
        System.out.println("concrete component");
    }
}
