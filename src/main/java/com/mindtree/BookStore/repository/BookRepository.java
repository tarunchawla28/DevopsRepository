package com.mindtree.BookStore.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.mindtree.BookStore.model.Book;


public interface BookRepository extends Repository<Book,Long> {

	Book save(Book book);
	List findAll();
}
