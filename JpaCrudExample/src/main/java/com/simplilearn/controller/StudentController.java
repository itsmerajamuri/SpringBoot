package com.simplilearn.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.simplilearn.entity.Student;
import com.simplilearn.service.StudentServiceImp;

@RestController
public class StudentController {
	@Autowired
	StudentServiceImp imp;
	

	@GetMapping("/student")
	public List<Student> get(){
		
		return imp.getAllStudents();
	}
	
	
	@PostMapping("/student")
	public String addStudent(@RequestBody Student student) {
           imp.addStudent(student);
           return "inserted successfully added";
	}
	
	@GetMapping("/student/{id}")
	public Student getById(@RequestParam(value="id") int id) {
		Student student= imp.getByStudentId(id);
		return student;
		
	}
	
	@PutMapping("/student")
	public void updateByid(@RequestBody Student student) {
		imp.updateStudentById(student);
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteById(@PathVariable int id) {
		imp.deleteById(id);
		
	}
	
	
}
