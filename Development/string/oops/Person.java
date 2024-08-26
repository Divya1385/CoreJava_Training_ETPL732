package com.evergent.corejava.oops;

public class Person {

		String name="Harika";//attributes
		int age=20;
		String address="Mahabubnagar";
		public void display() {     //Methods
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("Address:"+address);
		}
		public static void main(String[] args) {
			Person a=new Person();
			a.display();
	
	
	}

}
