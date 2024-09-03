package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo19_multi_catch {
	String name= "null";
	int k=0;
	public void myData() {
		System.out.println("one");
		System.out.println(name.length());
	
	int d=10/k;
	 System.out.println(d);
	 System.out.println("End");
	}

	public static void main(String[] args) {
		try {
			ExceptionDemo19_multi_catch em=new ExceptionDemo19_multi_catch();
			em.myData();
		}
		catch(NullPointerException | ArithmeticException e) {
			System.out.println("I can handle: "+e.getMessage());
		}
		

	}
}
