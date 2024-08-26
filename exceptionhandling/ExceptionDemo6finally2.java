package com.evergent.corejava.exceptionhandling;
//try followed by either catch block or finally block
public class ExceptionDemo6finally2 {
	String name="null";
	int k=0;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println("End");		
		}
		finally {
			System.out.println("finally block for closing db/network connections");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo6finally2 ed2=new ExceptionDemo6finally2();
		ed2.myData();
	}
}
