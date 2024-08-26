package com.evergent.corejava.constructor;
//super is a keyword always will call superclass constructor
class MyEmployee {
	int eid;
	public MyEmployee() {	
	}
	MyEmployee(int eid) {
		System.out.println("Employee Number super class:"+eid);
	}
} 
public class Employee6 extends MyEmployee {
	int eid;
	String ename;
	double sal;
	Employee6() {
		System.out.println("Default Constructor");
	}
	Employee6(int eid, String ename, double sal) {
		super(eid);
		this.ename=ename;
		this.sal=sal;	
	}
	public void display() {
		System.out.println("empname:"+ename);
		System.out.println("salary:"+sal);
	}
	public static void main(String[] args) {
		new Employee6();
		Employee6 emp=new Employee6(1, "vasu", 50000);
		emp.display();
	}

}