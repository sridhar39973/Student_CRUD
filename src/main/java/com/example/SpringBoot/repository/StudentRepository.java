package com.example.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBoot.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	public Student findByRollno(int rollno);
	public Student findByEmail(String email);
}
