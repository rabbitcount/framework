package com.ocelot.basic.pattern.decorator;

/**
 * 装饰实现类;
 * 可以使抽象类或最终的实现类
 */
public abstract class Decorator implements  Component{

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    /**
     * 新增的行为
     */
    @Override
    public final void operation() {
        component.operation();
        decorate();
    }

    protected abstract void decorate();
}
