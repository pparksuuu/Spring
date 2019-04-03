package com.example.demo2;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
