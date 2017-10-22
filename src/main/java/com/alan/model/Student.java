package com.alan.model;

public class Student {
	private String id;
	private String fullName;
	private String email;
	
	public Student() {
		
	}
	
	public Student (String fullName, String email) {
		this.fullName = fullName;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
}
