package com.evergent.corejava.exceptionhandling;
//throws an exception will be executed method by method 
public class ExceptionDemo8throws {
	String name=null;
	public void myData()throws NullPointerException {
		System.out.println("one");
		System.out.println(name.length());
	}
	public void myinfo() {
		myData();
		System.out.println("my info mrethod");
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo8throws ed2=new ExceptionDemo8throws();
			ed2.myinfo();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
