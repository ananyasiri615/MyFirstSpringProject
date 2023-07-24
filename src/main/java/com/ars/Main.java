package com.ars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Drink drink1 = (Drink) context.getBean("drink1");
        Drink drink2 = (Drink) context.getBean("drink2");
        System.out.println("Drink 1 : " + drink1);
        System.out.println("Drink 2 : " + drink2);

        ((ClassPathXmlApplicationContext) context).close();

    }
}

