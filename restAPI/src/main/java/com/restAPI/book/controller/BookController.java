package com.restAPI.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restAPI.book.bookEntities.Book;
import com.restAPI.book.service.bookservice;

@RestController
public class BookController {

	@Autowired
	private bookservice bookservice;
	
	//@RequestMapping(path="/books", method = RequestMethod.GET)
	@GetMapping("/books")
	public ResponseEntity<List<Book>>  getBooks() {
		
		List<Book> list = bookservice.getAllBook();
		
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
				
		return ResponseEntity.of(Optional.of(list));
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getSingleBook(@PathVariable("id") int id) {	
		
		Book book = bookservice.getBookByID(id);
		{
			if(book== null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
		}
		
		return ResponseEntity.of(Optional.of(book));
	}
	
	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@RequestBody Book b) {
	
		Book book = null;
		try {
			
			book = bookservice.addBook(b);
			System.out.println(b);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	
	}
	
	// delete book handler
	
	@DeleteMapping("/books/{bookid}")
	public ResponseEntity<Book>  deleteBook(@PathVariable("bookid") int bookid) {
	
		try {
			bookservice.deleteBook(bookid);
			 return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
	}
	
	// updatebook handler
	
	@PutMapping("/books/{bookID}")
	public  ResponseEntity<Book>  updateBook(@RequestBody Book book, @PathVariable("bookID") int bookid) {
		
		Book b = null;
		try {
		  b = 	bookservice.updateBook(book,bookid);
			//return ResponseEntity.of(Optional.of(b));
		  		return ResponseEntity.ok().body(b);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
