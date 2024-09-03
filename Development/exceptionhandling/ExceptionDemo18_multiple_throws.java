package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo18_multiple_throws {
	String name= null;
	int k=0;
	public void myData() throws NullPointerException, ArithmeticException {
		System.out.println("one");
		System.out.println(name.length());
	
	int d=10/k;
	 System.out.println(d);
	 System.out.println("End");
	}

	public static void main(String[] args) {
		try {
			ExceptionDemo18_multiple_throws em=new ExceptionDemo18_multiple_throws();
			em.myData();
		}
		catch(Exception e) {
			System.out.println("I can handle: "+e.getMessage());
		}
		

	}
}
