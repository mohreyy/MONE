package com.cg.ms.dto;

public class Employee {
String ename;
String project;
double salary;

public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getProject() {
	return project;
}
public void setProject(String project) {
	this.project = project;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getMobNo() {
	return mobNo;
}
public void setMobNo(String mobNo) {
	this.mobNo = mobNo;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
int age;
String mobNo;
int empId;

public String toString() {
	return " emp Details are given below:-\n ID No: " +empId + "\n Name:"+ ename + "\n Project: "
			+ project + "\n Age:" + age + "\n Mobile No:" + mobNo + "\n salary is" + salary+ 
			"";
}
	
	
}

