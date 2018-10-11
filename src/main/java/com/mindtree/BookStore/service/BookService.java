package com.mindtree.BookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.BookStore.model.Book;
import com.mindtree.BookStore.repository.BookRepository;
@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
    public Book addBook(Book book) {
		
		return bookRepository.save(book);
	}
public List showAll() {
		
		return bookRepository.findAll();
	}

}
