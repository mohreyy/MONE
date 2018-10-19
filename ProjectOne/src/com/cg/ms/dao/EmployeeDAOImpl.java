package com.cg.ms.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import com.cg.ms.dto.Employee;

public class EmployeeDAOImpl<empMap> implements EmployeeDAO {

	Map<Integer,Employee> empMap;
	public EmployeeDAOImpl()
	{
		empMap=DataStore.createCollection();
	}
	
	
	
	@Override
	public int addDetail(Employee emp) {
		int id=(int)(1000*Math.random());
		emp.setEmpId(id);
		empMap.put(id,emp);
		return id;
	}



	@Override
	public Employee getEmployee(int id) {
		Employee e=empMap.get(id);
		return e;
	}



	@Override
	public Employee updateEmployee(Employee emp) {
		empMap.put(emp.getEmpId(), emp);
		return emp;
	}



	@Override
	public ArrayList<Employee> getEmployeeList(String cname) {
		
		Collection<Employee> eList=empMap.values(); 
		ArrayList<Employee> employees=new ArrayList<>();
		

		for(Employee e:eList)
		{
		if(e.getProject().equals(cname)){
			employees.add(e);
		}
		}
		
		return employees;
	}
	

}
