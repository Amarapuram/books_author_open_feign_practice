package com.BookService.controller;

import com.BookService.domain.Book;
import com.BookService.repository.BookRepository;
import com.BookService.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookController {
@Autowired
    private BookService bookService;
    @GetMapping("/books")
    public List<Book> findAllBooks(){
        return bookService.getAllBooks();
    }
    @GetMapping("/books/{id}")
    public Optional<Book> findBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }
}
