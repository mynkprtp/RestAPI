package com.rest.book.bookrestapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        Book updatedBook = this.bookService.addBook(book);
        return updatedBook;
    }

    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId){
        this.bookService.deleteBook(bookId);
    }

    @PutMapping("/books/{bookId}")
    public Book updateBook(@RequestBody Book book,@PathVariable("bookId") int bookId){
        this.bookService.updateBook(book,bookId);
        return book;
    }
}

// Jackson dependency converts objects to JSON and vice versa