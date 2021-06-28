package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Customers {
private int custid;
private String custname;
private String coursename;
private String email;
private float budget;
//getters et setters
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}
public String getCoursename() {
	return coursename;
}
public void setCoursename(String coursename) {
	this.coursename = coursename;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public float getBudget() {
	return budget;
}
public void setBudget(float budget) {
	this.budget = budget;
}
public void display()
{
System.out.println("Object Returned Successfully");
}


}