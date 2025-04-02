package org.firstspringproject.xmlConfiguration.v1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeansV1.xml");

        // ========= далее мы можем не создавать самостоятельно экземпляры класса,
        // а использовать те, которые spring уже создал
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");


        objA.setMessage("New message");

        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.setMessage("Another message");

        System.out.println(objA.getMessage());
        System.out.println(objB.getMessage());
    }
}
