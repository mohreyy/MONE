package com.cg.ms.service;

import java.util.ArrayList;

import com.cg.ms.dto.Employee;


public interface EmployeeService {

	public int addDetail(Employee emp);

	public Employee getEmployee(int id);
	public Employee updateEmployee(Employee emp);
	public ArrayList<Employee> getEmployeeList(String cname);
	
}
