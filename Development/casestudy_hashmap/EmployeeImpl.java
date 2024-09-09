package com.evergent.corejava.casestudy_hashmap;
import java.util.Scanner;
import java.util.HashMap;
public class EmployeeImpl {
	HashMap<Integer, Employee> emp=new HashMap<>();
	public void addEmployee(Employee b)
	{
		if (emp.containsKey(b.getId())) 
		{

			System.out.println("Name is already there...... ");
		}
	    else 
	    {
	    	emp.put(b.getId(),b);
		System.out.println("details updated..");
	}
}
	public void retriveEmployee(int id) {
		if(emp.containsKey(id))
		{
			System.out.println(emp.get(id));
			
		}
		else 
		{
			System.out.println("details not there");
		}
	}
	public void updateEmployee(int id)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("select 1 update ID: ");
		System.out.println("select 2 update name: ");
		System.out.println("both ID and name update : ");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Enter update ID: ");
			emp.get(id).setId(sc.nextInt());
			break;	
		
		case 2:
			System.out.println("Enter update name: ");
			emp.get(id).setName(sc.next());
			break;
			
		case 3:
			System.out.println("Enter update ID: ");
			emp.get(id).setId(sc.nextInt());
			System.out.println("Enter update name: ");
			emp.get(id).setName(sc.next());
			break;
		}
		System.out.println("Employee details updated....");
	}
	
	public void removeEmployee(int id)
	{
		emp.remove(id);
		System.out.println("Given employee data removed:");
	}
	public void retriveEmployees()
	{
		for (Integer key : emp.keySet()) {
		      System.out.println(emp.get(key));
		}
	}
}

