package com.evergent.corejava.javabeans;

public class StudentImpl {

	public static void main(String[] args) {
		StudentBean std=new StudentBean();
		std.setSno(100);
		std.setSname("raj");
		std.setAddress("Banglore");
		System.out.println(std);

	}

}
