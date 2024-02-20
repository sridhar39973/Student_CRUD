package com.example.SpringBoot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot.entity.Student;
import com.example.SpringBoot.repository.StudentRepository;

@Service
public class StudentService implements StudentService_Interface{

	@Autowired
	StudentRepository srepo;
	
	@Override
	public String createStudent(Student student) {
		srepo.save(student);
		return null;
	}

	@Override
	public Student findByRollnumber(int rollno) {
		 return srepo.findByRollno(rollno);
		
	}
	@Override
	public List<Student> findAll() {
		
		return srepo.findAll();
	}

	@Override
	public Student findByEmail(String email) {
		return srepo.findByEmail(email);
		
	}

	@Override
	public String updateStudent(Student student) {
		srepo.save(student);
		return null;
	}

	@Override
	public String deleteStudent(Student student) {
		srepo.delete(student);
		return null;
	}

}
