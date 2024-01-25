package com.jpaboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.jpaboot.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	
	
}
