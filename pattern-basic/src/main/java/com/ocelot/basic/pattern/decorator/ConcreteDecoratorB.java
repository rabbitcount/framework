package com.ocelot.basic.pattern.decorator;

public class ConcreteDecoratorB extends  Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    protected void decorate() {
        System.out.println("append by decorator_B");
    }

}
