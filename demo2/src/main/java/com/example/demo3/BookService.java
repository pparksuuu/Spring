package com.example.demo3;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookRepository myBookRepository;
	
	@PostConstruct
	public void setup() {
		System.out.println(myBookRepository.getClass());
	}
}
