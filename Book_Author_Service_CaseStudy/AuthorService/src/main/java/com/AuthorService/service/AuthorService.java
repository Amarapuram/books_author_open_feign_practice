package com.AuthorService.service;

import com.AuthorService.domain.Author;
import com.AuthorService.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;
    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository=authorRepository;
    }

    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

    public Optional<Author> getAuthorById(Long id){
        return authorRepository.findById(id);
    }

}
