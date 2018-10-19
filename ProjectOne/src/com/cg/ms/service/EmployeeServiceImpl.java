package com.cg.ms.service;

import java.util.ArrayList;

import com.cg.ms.dao.EmployeeDAO;
import com.cg.ms.dao.EmployeeDAOImpl;
import com.cg.ms.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO dao;
	public EmployeeServiceImpl()
	{
		dao=new EmployeeDAOImpl();
	}
	
	
	@Override
	public int addDetail(Employee emp) {
		// TODO Auto-generated method stub
		return dao.addDetail(emp);
	}


	@Override
	public Employee getEmployee(int id) {
		
		return dao.getEmployee(id);
	}


	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(emp);
	}


	@Override
	public ArrayList<Employee> getEmployeeList(String cname) {
		// TODO Auto-generated method stub
		return dao.getEmployeeList(cname);
	}

}
