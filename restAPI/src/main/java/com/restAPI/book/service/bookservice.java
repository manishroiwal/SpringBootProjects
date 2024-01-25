package com.restAPI.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.restAPI.book.bookEntities.Book;
import com.restAPI.book.dao.BookRepository;

@Component
public class bookservice {
	
	@Autowired
	private BookRepository  bookRepository;

//	public static List<Book> list = new ArrayList<>();
//	public static List<Book> list1 = new ArrayList<>();
//
//	static {
//		list.add(new Book(101, "Kalidas", "meghdoot"));
//		list.add(new Book(102, "3 Mistakes", "chetan Bhagat"));
//		list.add(new Book(103, "Sita", "Amish"));
//	}

	
	// get ALL BOOKS METHOD 
	public List<Book> getAllBook() {

		List<Book> list = (List<Book>) this.bookRepository.findAll();
		return list;
	}

	// GET SINGLE BOOK 
	public Book getBookByID(int id) {
		
//		for (Book book : list) {
//		 if(book.getId() == id) {
//			 return book;
//		 }
//		}
		Book book = this.bookRepository.findById(id);
		return book;
	}
	
	// CREAT NEW BOOK
	
		public Book addBook(Book book){
			
		   Book b = bookRepository.save(book);
		
			return b;
			}

		public void deleteBook(int bookid) {
			
			bookRepository.deleteById(bookid);
			
//			for (Book book : list) {
//				if(book.getId()== bookid) {
//					list.remove(book);
//				}
//			}
			
//	
//			list = list.stream().filter(book ->book.getId()!=bookid).collect(Collectors.toList());
//			System.out.println("deleted "+bookid+list);
		}

		public Book updateBook(Book book, int bookid) {
			
//			for (Book b2 : list) {
//				if(b2.getId()==bookid) {
//					b2.setId(book.getId());
//					b2.setTitle(book.getTitle());
//					b2.setWriter(book.getWriter());
//				}
//		
//				return b2;
//			}
			book.setId(bookid);
			bookRepository.save(book);
			return book;
			
	
			
		}
	
	

}
