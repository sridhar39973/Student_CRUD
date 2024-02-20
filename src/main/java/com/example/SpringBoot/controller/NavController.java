package com.example.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	@GetMapping("/create")
	public String createStudent(){
		return "createstudent";
	}
	@GetMapping("/retrieve")
	public String retrieveStudent() {
		return "retrievestudent";
	}
	@GetMapping("/update")
	public String updateStudentById() {
		return "updatestudentbyid"; 
	}
	@GetMapping("/updatestudent")
	public String updatePage() {
		return "updatepage";
	}
	@GetMapping("/delete")
	public String deletePage() {
		return "deletestudent";
	}
	@GetMapping("/index")
	public String homePage() {
		return "index";
	}

}
