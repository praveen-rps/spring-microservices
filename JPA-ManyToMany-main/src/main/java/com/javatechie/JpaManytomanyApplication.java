package com.javatechie;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javatechie.entity.Course;
import com.javatechie.entity.Student;
import com.javatechie.respository.StudentRepository;

@SpringBootApplication
public class JpaManytomanyApplication implements CommandLineRunner{
	
	@Autowired
	StudentRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(JpaManytomanyApplication.class, args);
	}

	
	public void addData() {
		Course c1 = new Course();
		c1.setId(7090L);
		c1.setTitle("microservices");
		c1.setModules(15);
		c1.setAbbreviation("MS");
		c1.setFee(15500);
		
		Course c2 = new Course();
		c2.setId(7091L);
		c2.setTitle("DevOps");
		c2.setModules(20);
		c2.setAbbreviation("DOS");
		c2.setFee(45000);
		
		Set<Course> courses = new HashSet<>();
		courses.add(c1);courses.add(c2);
		
		Student s = new Student();
		s.setId(5L);
		s.setName("Ram");
		s.setAge(32);
		s.setDept("Quality");
		s.setCourses(courses);
		
		repo.save(s);
		System.out.println("Added ");
		
		
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		addData();
	}
}
