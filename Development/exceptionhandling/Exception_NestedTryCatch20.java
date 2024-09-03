package com.evergent.corejava.exceptionhandling;
//Neasted loop
public class Exception_NestedTryCatch20 {
	String name=null;
	int a=0;
	public void mydata() {
		try {
		System.out.println("one");
		System.out.println(name.length());
	try {
		int k=10/a;
	}
	catch(ArithmeticException e) {
	System.out.println("Nested try:"+e);
	}
	finally {
		System.out.println();	
	}
		}
   catch(NullPointerException | ArithmeticException e) {
	   System.out.println("finally block");
		}
		System.out.println("End");
	}
	public static void main(String[] args) {
		Exception_NestedTryCatch20 en=new Exception_NestedTryCatch20();
		en.mydata();


	}
}
