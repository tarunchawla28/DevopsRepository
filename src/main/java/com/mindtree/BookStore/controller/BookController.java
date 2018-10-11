package com.mindtree.BookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.BookStore.model.Book;
import com.mindtree.BookStore.service.BookService;

@RestController
@RequestMapping("/home")
public class BookController {
@Autowired
private BookService bookService;

@PostMapping("/add")
public Book addBook(@RequestBody Book book)
{
	return bookService.addBook(book);
}
@GetMapping("/showAll")
public List showAll()
{
	return bookService.showAll();
}


}
