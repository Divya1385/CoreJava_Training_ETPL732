package com.evergent.corejava.exceptionhandling;
//throws an exception will be executed method by method 
public class ExceptionDemo7 {
	String name=null;
	public void myData()throws Exception {
		System.out.println("one");
		System.out.println(name.length());
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo7 ed2=new ExceptionDemo7();
			ed2.myData();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
