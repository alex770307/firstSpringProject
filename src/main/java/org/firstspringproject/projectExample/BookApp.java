package org.firstspringproject.projectExample;

import org.firstspringproject.projectExample.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookApp {
    public static void main(String[] args) {
        // old school
//        BookRepository repository = new BookRepository();
//        BookService service = new BookService(repository);
//

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.firstspringproject.projectExample");

        BookService service = (BookService) context.getBean("bookService");


        service.addNewBook("20 000 лье под водой","Жуль Верн");
        service.addNewBook("Три мушкетера","Дюма");
        service.addNewBook(" ","Жуль Верн");
        service.addNewBook("Три товарища","Ремарк");
        service.addNewBook("Три поросенка","сказка");

        service.printBookData();

    }
}
