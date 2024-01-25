package com.restAPI.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.restAPI.book.fileUplodhelper.FileUploadhelper;

@RestController
public class fileUploadController {

	// file upload handler
	@Autowired
	private FileUploadhelper helper;
	
	@PostMapping("/uploadfile")
	public ResponseEntity<String> fileUpload(@RequestParam("file") MultipartFile file){
		
		
//		System.out.println(file.getOriginalFilename());
//		System.out.println(file.getContentType());
//		System.out.println(file.getSize());
		try {
		System.out.println(file.getContentType());
		if(file.isEmpty()) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("operation should content some file");
		}
		
		if(!file.getContentType().equals("application/pdf")) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("please select file of pdf type");
		}
		
		 boolean b = helper.uploaded(file);
		
		//return ResponseEntity.ok("file uploaded successfully");
		 return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/").path(file.getOriginalFilename()).toUriString());
		 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("something went wrong");
	}
}
