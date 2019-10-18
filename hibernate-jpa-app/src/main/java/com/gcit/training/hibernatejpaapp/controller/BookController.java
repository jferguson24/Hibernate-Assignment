package com.gcit.training.hibernatejpaapp.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcit.training.hibernatejpaapp.entity.Book;
import com.gcit.training.hibernatejpaapp.dao.*;

@RestController
@RequestMapping("/lms")
public class BookController{

	@Autowired
	private BookDao bookDao;
	
	// Create a new Note
	@PostMapping("/books")
	public Book createNote(@Valid @RequestBody Book book) {
	    return bookDao.save(book);
	}
	
	@GetMapping("/books/{bookId}")
	public Optional<Book> readBookById(@PathVariable Integer bookId) {
		return bookDao.findById(bookId);
	}

	@PutMapping("/books/{bookId}")
	public Book updateNote(@Valid @RequestBody Book book, @PathVariable Integer bookId) {
		book.setBookId(bookId);
		return bookDao.save(book);
	}
	
	@DeleteMapping("/books/{bookId}")
	public void deleteNote(@PathVariable Integer bookId) {
		bookDao.deleteById(bookId);
	}

}
