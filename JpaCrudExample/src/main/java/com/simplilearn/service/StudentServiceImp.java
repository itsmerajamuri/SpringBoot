package com.simplilearn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Student;
import com.simplilearn.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService{
	@Autowired
	StudentRepository repository;

	@Override
	public List<Student> getAllStudents() {
	  return repository.findAll();
	}

	@Override
	public void addStudent(Student student) {
		repository.save(student);
		
	}

	@Override
	public Student getByStudentId(int id) {
		Optional<Student> optional= repository.findById(id);
		Student student=null;
		if(optional.isPresent()) {
			student=optional.get();
			
		}else {
			throw new ArrayIndexOutOfBoundsException("id not present");
		}
		
		
		return student;
	}

	@Override
	public void updateStudentById(Student student) {
		repository.save(student);
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
		
	}

	

	
		

}
