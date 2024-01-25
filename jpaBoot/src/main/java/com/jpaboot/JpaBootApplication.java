package com.jpaboot;

import java.util.List;
import java.util.Optional;

import org.hibernate.sql.model.internal.OptionalTableUpdate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpaboot.entities.User;
import com.jpaboot.repository.UserRepository;

@SpringBootApplication
public class JpaBootApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(JpaBootApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

//		User u1 = new User();
//		u1.setUserName("Manish Roiwal");
//		u1.setCity("Dewas");
//		u1.setEmailID("manish@gmail.com");
//		
//		//saving single user 
//		//userRepository.save(u1);
//		//System.out.println(u1);
//		
//		User u2 = new User();
//		u2.setUserName("Payal");
//		u2.setCity("ujjain");
//		u2.setEmailID("payal@gmail.com");
//		
//		//saving single user
//		userRepository.save(u2);
		
//		//List.of() is a function that creates the list of entities in such form
//		
//		List<User> users = List.of(u1,u2); 
//		
//		//saving list of users
//		Iterable<User> user = userRepository.saveAll(users);
//		
//		for (User user2 : user) {
//			System.out.println(user2);
//		}
		//System.out.println(users);
//
//		Optional<User> optional = userRepository.findById(202);
//		User user = optional.get();
//		user.setUserName("kumawat Manish");
//	
//		userRepository.save(user);
//		System.out.println(user);
		
		
//		Iterable<User> iterable = userRepository.findAll();
//		
//		iterable.forEach(user->System.out.println(user));
		
		
		// Delete by id
		
//		userRepository.deleteById(202);
//		System.out.println("deleted 202 ");
	
	}

}
