package com.BookService.client;

import com.AuthorService.domain.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class AuthorClient {
    private final String authorServiceUrl = "http://localhost:8081/authors";
    @Autowired
    private RestTemplate restTemplate;

    public List<Author>getAllAuthors() {
        return restTemplate.getForObject(authorServiceUrl, List.class);
    }

    public Author getAuthorById(Long id) {
        return restTemplate.getForObject(authorServiceUrl + "/" + id, Author.class);
    }
}
