package org.firstspringproject.xmlConfiguration.v2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BeansV2.xml");

        System.out.println("Создан контекст ...");

        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.methodWorking();
        context.close();
    }
}
