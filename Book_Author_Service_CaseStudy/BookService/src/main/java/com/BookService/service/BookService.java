package com.BookService.service;

import com.BookService.domain.Book;
import com.BookService.repository.BookRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
@Service
public class BookService {
private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @PostConstruct // This method will be called after the service is created
    public void init() {
        // Sample data
        List<Book> books = Arrays.asList(
                new Book(1L, "1984", 1L),
                new Book(2L, "Harry Potter", 2L),
                new Book(3L, "To Kill a Mockingbird", 3L),
                new Book(4L, "The Lord of the Rings", 4L),
                new Book(5L, "Pride and Prejudice", 5L)
        );

        // Save each book to the repository
        bookRepository.saveAll(books);
    }

    public List<Book> getAllBooks(){
    return bookRepository.findAll();

 }

 public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
 }
}
