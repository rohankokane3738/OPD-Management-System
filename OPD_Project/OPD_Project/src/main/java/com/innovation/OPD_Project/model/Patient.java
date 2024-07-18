package com.innovation.OPD_Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patient {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private long pid;
private String name,address,gender,age,contact,email,password;
public Patient() {
	super();
	// TODO Auto-generated constructor stub
}
public Patient(String name, String address, String gender, String age, String contact, String email, String password) {
	super();
	this.name = name;
	this.address = address;
	this.gender = gender;
	this.age = age;
	this.contact = contact;
	this.email = email;
	this.password = password;
}
public long getPid() {
	return pid;
}
public void setPid(long pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
