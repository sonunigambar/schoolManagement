package com.school.management.service;

import com.school.management.model.Student;

public interface StudentService {
	Student addStudent(Student student);
	Student retriveStudent(int sId);
	Student updateStudent(int sId);
}
