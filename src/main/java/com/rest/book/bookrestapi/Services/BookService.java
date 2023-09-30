package com.rest.book.bookrestapi.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rest.book.bookrestapi.Entities.Book;

@Component
public class BookService {
    private static List<Book> list =new ArrayList<>();
    
    static{
        list.add(new Book(1,"Psychology of Money","Mayank"));
        list.add(new Book(2,"New Perspectives","Abhay"));
        list.add(new Book(3,"Music is Life","Priyanka"));
    }

    // get all books
    public List<Book> getAllBooks(){
        return list;
    }

    // get single book by ID
    public Book getBookById(int id){
        Book book=null;
        book=list.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }
}
