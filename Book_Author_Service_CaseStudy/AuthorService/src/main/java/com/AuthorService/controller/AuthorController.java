package com.AuthorService.controller;

import com.AuthorService.domain.Author;
import com.AuthorService.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/authors")
    public List<Author> getAllAuthors(){
        return authorService.getAllAuthors();
    }
    @GetMapping("/authors/{id}")
    public Optional<Author> getAuthorById(@PathVariable Long id){
        return authorService.getAuthorById(id);
    }
}
