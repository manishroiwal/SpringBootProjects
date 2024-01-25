package com.restAPI.book.bookEntities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Writer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int writer_ID;
	@Column(name = "Writer_Name")
	private String writer_name;
	@Column(name = "Address")
	private String city;
	
	@OneToOne(mappedBy = "writer")
	@JsonBackReference
	private Book book;

	public Writer(int writer_ID, String writer_name, String city) {
		super();
		this.writer_ID = writer_ID;
		this.writer_name = writer_name;
		this.city = city;
	}
	
	
	
	public Writer() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getWriter_ID() {
		return writer_ID;
	}
	public void setWriter_ID(int writer_ID) {
		this.writer_ID = writer_ID;
	}
	public String getWriter_name() {
		return writer_name;
	}
	public void setWriter_name(String writer_name) {
		this.writer_name = writer_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Writer [writer_ID=" + writer_ID + ", writer_name=" + writer_name + ", city=" + city + "]";
	
	}
}
