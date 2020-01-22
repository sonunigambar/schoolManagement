package com.school.management.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.management.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
