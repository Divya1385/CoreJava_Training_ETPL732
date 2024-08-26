package com.evergent.corejava.constructor;
//we can call one constructor to another constructor within a class throw "this" keyword
public class Employee5 {
	int eid;
	String ename;
	double sal;
	Employee5(String ename) {
		this.ename=ename;
	}
	Employee5() {
		System.out.println("Default Constructor");
	}
	Employee5(int eid, String ename, double sal) {
		this(ename);
		this.eid=eid;
		this.sal=sal;	
	}
	public void display() {
		System.out.println("empid:"+eid);
		System.out.println("empname:"+ename);
		System.out.println("salary:"+sal);
	}
	public static void main(String[] args) {
		new Employee5();
		Employee5 emp=new Employee5(1, "vasu", 50000);
		emp.display();
	}

}
