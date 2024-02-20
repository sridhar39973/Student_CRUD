package com.example.SpringBoot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	int rollno;
	String student_name;
	long student_phonenumber;
	String email;
	String address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String student_name, long student_phonenumber, String email, String address) {
		super();
		this.rollno = rollno;
		this.student_name = student_name;
		this.student_phonenumber = student_phonenumber;
		this.email = email;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", student_name=" + student_name + ", student_phonenumber="
				+ student_phonenumber + ", email=" + email + ", address=" + address + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public long getStudent_phonenumber() {
		return student_phonenumber;
	}
	public void setStudent_phonenumber(long student_phonenumber) {
		this.student_phonenumber = student_phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
