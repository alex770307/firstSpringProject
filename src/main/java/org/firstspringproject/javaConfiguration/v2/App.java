package org.firstspringproject.javaConfiguration.v2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        WeekDay weekDay = (WeekDay) context.getBean(WeekDay.class);
        System.out.println("Сегодня: " + weekDay.getWeekDay());
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames){
            System.out.println(beanName);
        }

    }
}
