package com.gcit.training.hibernatejpaapp.controller;

import java.util.List;

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

import com.gcit.training.hibernatejpaapp.dao.AuthorDao;
import com.gcit.training.hibernatejpaapp.entity.Author;

@RestController
@RequestMapping("/lms")
public class AuthorController {
	
	@Autowired
	private AuthorDao authorDao;
	
	@PostMapping("/authors")
	public Author createNote(@Valid @RequestBody Author author) {
		return authorDao.save(author);
	}
	
	@GetMapping("/authors")
	public List<Author>readAllAuthor(){
		return authorDao.findAll();
	}
	
	@PutMapping("/authors/{authorId}")
	public Author updateNote(@Valid @RequestBody Author author, @PathVariable Integer authorId) {
		author.setAuthorId(authorId);
		return authorDao.save(author);
	}
	
	@DeleteMapping("/authors/{authorId}")
	public void deleteNote(@PathVariable Integer authorId) {
		authorDao.deleteById(authorId);
	}

}
