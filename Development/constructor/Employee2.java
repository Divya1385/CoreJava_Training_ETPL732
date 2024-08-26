package com.evergent.corejava.constructor;

public class Employee2 {
	int eid;
	String ename;
	double sal;
	Employee2() {
		System.out.println("Default Constructor");
	}
	Employee2(int eid1, String ename1, double sal1) {
		eid=eid1;
		ename=ename1;
		sal=sal1;	
	}
	public void display() {
		System.out.println("empid:"+eid);
		System.out.println("empname:"+ename);
		System.out.println("salary:"+sal);
	}
	public static void main(String[] args) {
		new Employee2();
		Employee2 emp=new Employee2(1, "vasu", 50000);
		emp.display();
	}

}
