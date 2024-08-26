package com.evergent.corejava.javabeans;

public class EmployeeImp {
	public static void main(String[] args) { //step 1
		//Store the values to bean
		Employee emp=new Employee();//step 2
		emp.setEno(100);//step 3
		emp.setEname("Raj"); //step 7
		emp.setSal(55000); //step 11
		//Retrie values from bean
		System.out.println("Employee no: "+emp.getEno()); //step 15 : //step 19
		System.out.println("Employee name: "+emp.getEname());
		System.out.println("Employee sal: "+emp.getSal());
	}

}
