package com.rest.book.bookrestapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rest.book.bookrestapi.Entities.Book;
import com.rest.book.bookrestapi.Services.BookService;

// @Controller
@RestController
public class BookController {
    
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks(){
        return this.bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable("id") int id){
        return this.bookService.getBookById(id);
    }
}

// Jackson dependency converts objects to JSON and vice versa