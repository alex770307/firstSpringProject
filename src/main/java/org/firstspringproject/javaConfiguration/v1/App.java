package org.firstspringproject.javaConfiguration.v1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Создали контекст ...");
        // получить ссылку на экземпляр класса по наименованию класса
        Cat cat = context.getBean(Cat.class);
        Cat cat2 = context.getBean(Cat.class);

        System.out.println(cat == cat2);

        Dog dog = (Dog) context.getBean("dog");

        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

        System.out.println("===============");

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());

        System.out.println("===== Список всех бинов =======");

        String[] beanNames = context.getBeanDefinitionNames();

        for (String beanName : beanNames){
            System.out.println(beanName);
        }

    }
}
