package org.firstspringproject.annotationConfiguration;

import org.springframework.stereotype.Component;

@Component
public class AnimalService {

    private Dog dog;

    public AnimalService(Dog dog) {
        this.dog = dog;
    }

    public void printDogData(){
        System.out.println("Dog's name: " + dog.getName());
    }
}
