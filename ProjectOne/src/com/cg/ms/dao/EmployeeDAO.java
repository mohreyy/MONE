package com.cg.ms.dao;

import java.util.ArrayList;

import com.cg.ms.dto.Employee;

public interface EmployeeDAO {

	int addDetail(Employee emp);

	Employee getEmployee(int id);

	Employee updateEmployee(Employee emp);

	ArrayList<Employee> getEmployeeList(String cname);
	

}
