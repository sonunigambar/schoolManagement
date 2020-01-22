package com.school.management.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.school.management.model.Student;
import com.school.management.repositary.StudentRepo;

public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepo repo;
	
	public Student addStudent(Student student) {
		return repo.save(student);
	}

	public Student retriveStudent(int sId) {
		return repo.findOne(sId);
	}

	public Student updateStudent(int sId) {
		Student student=repo.findOne(sId);
		student.setContactNo("12345678");
		Student student1=repo.save(student);
		return student1;
	}

}
