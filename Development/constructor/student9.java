package com.evergent.corejava.constructor;

public class student9 {
	String name;
	int age;
//constructor
	public student9(String name, int age) {
		this.name=name;
		this.age=age;
	}
//copy constructor
	public student9(student9 s) {
		this.name=s.name;
		this.age=s.age;
	}
	public void display() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		
	}

	public static void main(String[] args) {
		student9 std1=new student9("ravi",15); //creating object of student
		student9 std2=new student9(std1); //creating a copy of std1
		std1.display();
		std2.display();
		
		

	}

}
