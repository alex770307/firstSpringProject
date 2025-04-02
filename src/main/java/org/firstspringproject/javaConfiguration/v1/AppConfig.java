package org.firstspringproject.javaConfiguration.v1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean("parrot-kesha")
    public Parrot getParrot() {
        return new Parrot();
    }
//
//    @Bean("parrot-jack")
//    public Parrot getParrotJack() {
//        Parrot parrotJack = new Parrot();
//        parrotJack.setName("Jack");
//        return parrotJack;
//    }

    @Bean("dog")
    public Dog getDog() {
        return new Dog();
    }

    @Bean
    @Scope("prototype")
    //public Cat getCat(@Qualifier("parrot-jack") Parrot parrot){
    public Cat getCat(Parrot parrot){
        Cat cat = new Cat();
        cat.setName(parrot.getName() + " - killer");
        return cat;
    }


}
