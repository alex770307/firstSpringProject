package org.firstspringproject.javaConfiguration.v1;

public class Cat {
    private String name = "Barsik";

    public Cat() {
        System.out.println("Cat constructor ...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
