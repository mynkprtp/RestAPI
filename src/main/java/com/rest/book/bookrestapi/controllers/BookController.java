package com.rest.book.bookrestapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.book.bookrestapi.Entities.Book;

// @Controller
@RestController
public class BookController {
    
    @GetMapping("/books")
    public Book getBooks(){
        Book book = new Book();
        book.setId(1);
        book.setTitle("Java Crash Course");
        book.setAuthor("Mayank");
        return book;
    }
}

// Jackson dependency converts objects to JSON and vice versa