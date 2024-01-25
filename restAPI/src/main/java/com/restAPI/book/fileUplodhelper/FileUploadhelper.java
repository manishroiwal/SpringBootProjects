package com.restAPI.book.fileUplodhelper;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadhelper {

//	public final String uplaod_dir="C:\\Users\\HP\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\restAPI\\src\\main\\resources\\static\\image";
	public final String uplaod_dir= new ClassPathResource("static/image/").getFile().getAbsolutePath();

	
	public FileUploadhelper() throws IOException   {
		super();
		// TODO Auto-generated constructor stub
	}


	public boolean uploaded(MultipartFile f) {
		
		try {
			// f is the object of multipart (raeding the data)
			InputStream data = f.getInputStream();
			byte []dataArray= new byte[data.available()];
			data.read();
			
			// write data
			FileOutputStream fos = new FileOutputStream(uplaod_dir+"\\"+f.getOriginalFilename());
			fos.write(dataArray);
			fos.flush();
			fos.close();
			
			return true;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
}
