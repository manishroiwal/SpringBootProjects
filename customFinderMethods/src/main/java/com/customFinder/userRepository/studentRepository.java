package com.customFinder.userRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.customFinder.Studententity.copy.Student;

public interface studentRepository extends CrudRepository<Student, Integer> {

// we have another option custom finder method fetch the data 	
//public List<Student> findByStudent_Name(String student_Name);

	public List<Student> findByCity(String city);

	public List<Student> findByCityAndSchool(String city, String school);

	public List<Student> findByCityStartingWith(String prefix);

// another way to fetch data by JPQL
	@Query("select students from Student students")
	public List<Student> getAllStudents();
	
// fetch data by where condition
	@Query("select st from Student st where st.student_Name=:n")
	public List<Student> getStudentByName(@Param("n")String student_Name);

}
