package com.simplilearn.service;

import java.util.List;

import com.simplilearn.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	void addStudent(Student student);
	
	Student getByStudentId(int id);
	
	void updateStudentById(Student student);
	
	void deleteById(int id);
	
	

	

}
