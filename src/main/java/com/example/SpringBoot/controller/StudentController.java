package com.example.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.SpringBoot.entity.Student;
import com.example.SpringBoot.services.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService sserv;
	@PostMapping("/createStudent")
	public String createStudent(@ModelAttribute Student student) {
		if(sserv.findByRollnumber(student.getRollno())==null ) {
			if(sserv.findByEmail(student.getEmail())==null) {
				sserv.createStudent(student);		
				return"studentcreated";
			}
			else {
				return "invalidemail";
			}
		}
		return "alreadyexists";

	}
	@GetMapping("/retrieve-student")
	public String retrieveStudent(@RequestParam int rollno, Model model) {
		Student student = sserv.findByRollnumber(rollno);
		if(student!=null) {
			model.addAttribute("student", student);
			return "student";}
		return "nostudent";
	}

	@GetMapping("/retrieve-all")
	public String retrieveAllStudent(Model model) {
		List<Student>student=sserv.findAll();
		model.addAttribute("student", student);
		return "allstudents";
	}
	@PostMapping("/updatestudentdetails")
	public String updateStudent(@ModelAttribute Student student) {
		Student existingStudent = sserv.findByRollnumber(student.getRollno());

		if(existingStudent != null) {
			sserv.updateStudent(existingStudent);
			return "updated";
		}
			return "nostudentforupdate";
	}

	@PostMapping("/deleteoperation")
	public String deleteStudent(@ModelAttribute Student student) {
		if(sserv.findByRollnumber(student.getRollno())!=null) {
			sserv.deleteStudent(student);
			return "deleted";
		}
		return "invaliddeletion";
	}













}
