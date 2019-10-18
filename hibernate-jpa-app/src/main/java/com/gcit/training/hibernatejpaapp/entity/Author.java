package com.gcit.training.hibernatejpaapp.entity;


import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity 
@Table(name = "tbl_author")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "authid", unique = true, nullable = false)
	private Integer authId;
	
	@Column(name = "authorName")
	private String authorName;

	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
	private Collection<Book> authorsBooks = new ArrayList<Book>();
	
	public Integer getAuthorId()
	{
		return authId;
	}

	public void setAuthorId(Integer authId)
	{
		this.authId = authId;
	}

	public String getAuthorName()
	{
		return authorName;
	}

	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}

}
