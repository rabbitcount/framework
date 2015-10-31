package com.ocelot.basic.pattern.decorator;

public class DecoratorClient {

    public static final void BuildDecorator(){

        // 方法一:
//        Component originalComponent = new ConcreteComponent();
//        Component decorator_1 = new ConcreteDecoratorA(originalComponent);
//        Component decorator_2 = new ConcreteDecoratorB(decorator_1);
//        Component finalComponent = decorator_2;
        // 方法2:
        Component finalComponent = new ConcreteDecoratorB(new ConcreteDecoratorA(new ConcreteComponent()));

        // 执行装饰模式
        finalComponent.operation();
    }
}
