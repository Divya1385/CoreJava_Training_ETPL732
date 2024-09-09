package com.evergent.corejava.casestudy_hashmap;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		int id;
		Scanner sc=new Scanner(System.in);
		EmployeeImpl em=new EmployeeImpl();
		
		System.out.println("\t\t Employee details");
		for(;;) {
		System.out.println("1. Add new Employee.");
		System.out.println("2. Retrive Employee details.");
		System.out.println("3. Update Employee details.");
		System.out.println("4. Remove Employee.");
		System.out.println("5. List all Employee.");
		System.out.println("6. Exit");
		System.out.println("Enter your choice:");
		
		int n=sc.nextInt();
		switch(n) 
		{
		case 1:
			System.out.println("Enter Employee ID:");
			id=sc.nextInt();
			System.out.println("Enter Employee Name:");
			String name=sc.next();
			System.out.println("Enter Employee Department:");
			String dept=sc.next();
			Employee b=new Employee();
			b.setId(id);
			b.setName(name);
			b.setDept(dept);
			em.addEmployee(b);
			break;
		case 2:
			System.out.println("Enter Employee ID:");
			id=sc.nextInt();
			em.retriveEmployee(id);
		
		
		case 3:
			System.out.println("Enter Employee ID:");
			id=sc.nextInt();
			em.updateEmployee(id);
		case 4:
			System.out.println("Enter Employee ID:");
			id=sc.nextInt();
			em.removeEmployee(id);
		case 5:
			em.retriveEmployees();
			break;
		case 6:
			System.exit(0);
	}	
	}
	}
}
