package com.ocelot.sourcecode.spring.aop.plain;

import com.ocelot.sourcecode.spring.aop.plain.services.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * *************************
 * Customer name : Yong Mook Kim
 * *************************
 * Customer website : http://www.mkyong.com
 * *************************
 */
public class PlainApp {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(
                new String[] { "Spring-Customer.xml" });

        CustomerService cust =
                (CustomerService) appContext.getBean("customerService");

        System.out.println("*************************");
        cust.printName();
        System.out.println("*************************");
        cust.printURL();
        System.out.println("*************************");
        try {
            cust.printThrowException();
        } catch (Exception e) {

        }

    }
}
