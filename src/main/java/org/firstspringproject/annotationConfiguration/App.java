package org.firstspringproject.annotationConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        "org.firstspringproject.annotationConfiguration");
        System.out.println("Создали контекст ...");
        Cat cat = context.getBean(Cat.class);

        Dog dog = (Dog) context.getBean("myDog");

        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

        System.out.println("===============");

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());

        System.out.println("===== Список всех бинов =======");

        String[] beanNames = context.getBeanDefinitionNames();

        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

        // воспользуемся AnimalService

        // вместо того чтобы самим создавать экземпляр класса AnimalService
        // AnimalService service = new AnimalService((Dog) context.getBean("myDog"));
        // если мы в него добавим аннотацию @Component

        AnimalService service = (AnimalService) context.getBean("animalService");

        service.printDogData();
    }
}
