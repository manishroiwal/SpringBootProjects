package com.customFinder;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.customFinder.Studententity.copy.Student;
import com.customFinder.userRepository.studentRepository;

@SpringBootApplication
public class CustomFinderMethodsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CustomFinderMethodsApplication.class, args);
		studentRepository repository = context.getBean(studentRepository.class);
		
//		Student st = new Student();
//		st.setStudent_Name("manish Kumawat");
//		st.setSchool("Karm Deep Public school");
//		st.setCity("Dewas");
//		
//		Student st1 = new Student();
//		st1.setStudent_Name("Payal Kumawat");
//		st1.setSchool("Jupitor Academy");
//		st1.setCity("SIA");
//
//		Student st2 = new Student();
//		st2.setStudent_Name("Karan");
//		st2.setCity("Bhorasa");
//		st2.setSchool("Saraswati CBSE");
//		
//		List<Student> student = List.of(st, st1, st2);
//		
//		Iterable<Student> saved_student = repository.saveAll(student);
//		
//		for (Student student2 : saved_student) {
//			
//			System.out.println(student2);
//		}
//		
//		System.out.println(student);
//		
	//	List<Student> stDetails = repository.findByCity("Bhorasa");
		
	//	stDetails.forEach(e-> System.out.println(e));
	//	List<Student> stDetails = repository.findByCityAndSchool("Dewas", "pioneer");
		
//		List<Student> stDetails = repository.findByCityStartingWith("de");
//		//System.out.println("Students details "+stDetails);
//		for (Student student : stDetails) {
//			System.out.println(student);
//		}
//-------------------------------------------------jpQL----------------------	

//		List<Student> allStudents = repository.getAllStudents();
//		for (Student student : allStudents) {
//			System.out.println(student);
//		}
//		
		List<Student> stDetails = repository.getStudentByName("karan");
		
		for (Student student : stDetails) {
			System.out.println(student);
		}
		
	
	}

}
