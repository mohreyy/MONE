package com.cg.ms.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.ms.dto.Employee;



public class DataStore {

	private static Map<Integer, Employee> Employees;
	public static Map<Integer, Employee> createCollection()

	{
		if(Employees==null)
		{
			Employees=new HashMap<>();
			
		}
		return Employees;
	}
}
