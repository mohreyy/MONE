package com.cg.ms.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.ms.dto.Employee;
import com.cg.ms.service.EmployeeService;
import com.cg.ms.service.EmployeeServiceImpl;



public class Main {

	public static void main(String args[]) {
		EmployeeService service=new EmployeeServiceImpl();
		
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int ch=0;
		do{
			
			System.out.println("**************************");
			System.out.println("1. Add EMPLOYEE Details:  ");
			System.out.println("2. Display EMPLOYEE Details:  ");
			System.out.println("3. Update EMPLOYEE Details:  ");
			System.out.println("4. Display EMPLOYEE List:  ");
			System.out.println("5. Exit:  \n");
			System.out.println("Enter your choice ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter EMPLOYEE Name:");
				String name = sc1.nextLine();
				
				System.out.println("Enter Salary:");
				double salary = sc1.nextDouble();

                System.out.println("Enter project Name:");
				String cname = sc.next();

				System.out.println("Enter Age:");
				int age = sc.nextInt();

				System.out.println("Enter Contact No.:");
				String mob = sc.next();
				Employee emp = new Employee();
				emp.setEname(name);
				emp.setProject(cname);
				emp.setAge(age);
				emp.setSalary(salary);
				emp.setMobNo(mob);
				int id = service.addDetail(emp);
				System.out.println("emp record added " + id);
				//System.out.println();
				System.out.println(emp.toString());
				break;

		
		case 2:
			System.out.println("Enter Employee id no: ");
			id = sc.nextInt();
			emp = service.getEmployee(id);
			if (emp == null)
				System.err.println("Record not found...\n");
			else {
				
				System.out.println(emp.toString());
			}
			break;
			
			
			
		
		case 3:

			System.out.println("Enter empid: ");
			id=sc.nextInt();
			emp=service.getEmployee(id);
			if (emp == null)
				System.err.println("Record not found...\n");
			else {
				System.out.println("Enter new Mobile No: ");
				String mobno=sc.next();
				emp.setMobNo(mobno);
				emp=service.updateEmployee(emp);
				System.out.println("Record Updated");
				System.out.println(emp.toString());
			}
			break;
		
			
			
		case 4:
		
			System.out.println("Enter project Name: ");
			cname=sc.next();
			ArrayList<Employee> list=service.getEmployeeList(cname);
			if(list.size()==0)
			{
				System.err.println("No emp enrolled to this record...");
			}
				else
				{
				for(Employee e: list){
					System.out.println(e.getAge()+ " "+e.getMobNo());
					System.out.println();
				}}
			
			break;
		
	}
	}while(ch!=5);
	}}
		
