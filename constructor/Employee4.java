package com.evergent.corejava.constructor;
//Constructor doesn't have any return type not even void also.
//If we declare as void it will consider as method not a constructor
public class Employee4 {
	void Employee4() { // with void it is implicit constructor without void it is explicit constructor
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {
		Employee4 emp=new Employee4();
		emp.Employee4();
		
	}

}
