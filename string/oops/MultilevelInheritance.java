package com.evergent.corejava.oops;
class MyPerson {
	public void PersonInfo() {
		System.out.println("Divya");
	}
}
class PersonDetails extends MyPerson {
	public void personData() {
		System.out.println("Hyderabad");
	}
}
public class MultilevelInheritance extends PersonDetails {
	public void show() {
		System.out.println("local member");
	}
	
	public static void main(String[] args) {
		MultilevelInheritance mi=new MultilevelInheritance();
		mi.PersonInfo();
		mi.personData();
		mi.show();
		
		

	}

}
