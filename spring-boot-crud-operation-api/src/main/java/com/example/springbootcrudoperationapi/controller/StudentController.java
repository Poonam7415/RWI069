package com.example.springbootcrudoperationapi.controller;

import java.util.List;

import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootcrudoperationapi.Entity.Student;
import com.example.springbootcrudoperationapi.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	StudentRepository repo;
	//get all the students
	//localhost:8080/students
	@GetMapping("/students")
	public List<Student>getAllStudents(){
		
	List<Student>students =   repo.findAll();
	
		return students;
	}
	//localhost:8080/students/1
	@GetMapping("/students/{Id}")
	public Student getStudent(@PathVariable int Id) {
	Student student = repo.findById(Id).get();
	return student;
	}
	
	
	@PostMapping("/students/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createStudent(@RequestBody Student student) {
		repo.save(student);
	}
	
	@PutMapping("/students/update/{Id}")
	public void updateStudents(@PathVariable int Id) {
		Student student = repo.findById(Id).get();
		student.setName("Poonam");
		student.setPercentage(92);
		repo.save(student);
		return;
		
		
	}
	
	@DeleteMapping("/students/delete/{Id}")
	public  void removeStudent(@PathVariable int Id ) {
		Student student = repo.findById(Id).get();
		return;
		
	}

}
