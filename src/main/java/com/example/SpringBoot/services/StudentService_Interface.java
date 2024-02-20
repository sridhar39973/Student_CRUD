package com.example.SpringBoot.services;

import java.util.List;

import com.example.SpringBoot.entity.Student;

public interface StudentService_Interface {
	public String createStudent(Student student);
	public Student findByRollnumber(int rollno);
	List<Student>findAll();
	public Student findByEmail(String email);
	public String updateStudent(Student student);
	public String deleteStudent(Student student);
}
