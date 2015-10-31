package com.ocelot.basic.pattern.decorator;

public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    protected void decorate() {
        System.out.println("append by decorator_A");
    }
}
