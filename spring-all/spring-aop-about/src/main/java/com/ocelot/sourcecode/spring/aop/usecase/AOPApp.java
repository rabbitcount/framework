package com.ocelot.sourcecode.spring.aop.usecase;

import com.ocelot.sourcecode.spring.aop.plain.services.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPApp {

    public static void main(String[] args){
        beforeAndAfter();
        around();
        throwException();
    }

    /**
     * *************************
     * HijackBeforeMethod : Before method hijacked!
     * Customer name : Yong Mook Kim
     * HijackAfterMethod : After method hijacked!
     * *************************
     * HijackBeforeMethod : Before method hijacked!
     * Customer website : http://www.mkyong.com
     * HijackAfterMethod : After method hijacked!
     * *************************
     */
    public static void beforeAndAfter(){
        ApplicationContext appContext = new ClassPathXmlApplicationContext(
                new String[] { "Spring-Customer.xml" });

        CustomerService cust =
                (CustomerService) appContext.getBean("customerBeforeAndAfterServiceProxy");

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

    /**
     * *************************
     * Method name : printURL
     * Method arguments : []
     * HijackAroundMethod : Before method hijacked!
     * Customer website : http://www.mkyong.com
     * HijackAroundMethod : Before after hijacked!
     * *************************
     * Method name : printThrowException
     * Method arguments : []
     * HijackAroundMethod : Before method hijacked!
     * HijackAroundMethod : Throw exception hijacked!
     */
    public static void around(){
        ApplicationContext appContext = new ClassPathXmlApplicationContext(
                new String[] { "Spring-Customer.xml" });

        CustomerService cust =
                (CustomerService) appContext.getBean("customerAroundServiceProxy");

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

    /**
     * *************************
     * Customer name : Yong Mook Kim
     * *************************
     * Customer website : http://www.mkyong.com
     * *************************
     * HijackThrowException : Throw exception hijacked!
     *
     */
    public static void throwException(){
        ApplicationContext appContext = new ClassPathXmlApplicationContext(
                new String[] { "Spring-Customer.xml" });

        CustomerService cust =
                (CustomerService) appContext.getBean("customerServiceThrowExceptionProxy");

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
