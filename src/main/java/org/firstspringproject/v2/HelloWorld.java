package org.firstspringproject.v2;

public class HelloWorld {
    public void methodInit(){
        System.out.println("Я - метод для инициализации объекта " + this.getClass().getSimpleName());
    }


    public void methodWorking(){
        System.out.println("Я - обычный метод");
    }


    public void methodDestroy(){
        System.out.println("Я - метод для уничтожения объекта " + this.getClass().getSimpleName());
    }
}
