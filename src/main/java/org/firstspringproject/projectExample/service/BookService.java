package org.firstspringproject.projectExample.service;

import org.firstspringproject.projectExample.entity.Book;
import org.firstspringproject.projectExample.repository.BookRepository;
import org.springframework.stereotype.Component;

@Component
public class BookService {

    private BookRepository repository;

    //@Autowired
    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public void addNewBook(String title, String author){
        if (!title.isBlank() && !author.isBlank()){
            Book book = new Book(title, author);
            repository.add(book);
            System.out.println("Книга добавлена успешно");
        } else {
            System.out.println("Книгу добавить не удалось");
        }
    }

    public void printBookData(){
        repository.printBooks();
    }
}
