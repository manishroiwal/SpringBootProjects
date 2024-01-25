package com.restAPI.book.bookEntities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "BookDetails")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BookId")
	private int  id;
	private String title;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Writer writer;
	
	
	public Book(int id, String title, Writer writer) {
		super();
		this.id = id;
		this.title = title;
		this.writer = writer;
	}


	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Writer getWriter() {
		return writer;
	}


	public void setWriter(Writer writer) {
		this.writer = writer;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", writer=" + writer + "]";
	}
	
	

}
