package com.evergent.corejava.constructor;

public class Employee3 {
	int eid;
	String ename;
	double sal;
	Employee3() {
		System.out.println("Default Constructor");
	}
	Employee3(int eid, String ename, double sal) {
		this.eid=eid;
		this.ename=ename;
		this.sal=sal;	
	}
	public void display() {
		System.out.println("empid:"+eid);
		System.out.println("empname:"+ename);
		System.out.println("salary:"+sal);
	}
	public static void main(String[] args) {
		new Employee3();
		Employee3 emp=new Employee3(1, "vasu", 50000);
		emp.display();
	}

}
