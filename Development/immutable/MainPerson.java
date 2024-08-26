package com.evergent.corejava.immutable;
/* The PersonImmutable because once an instance 
 is created the name and age cannot be changed
 */
public class MainPerson {

	public static void main(String[] args) {
		PersonImmutable person=new PersonImmutable("Divya",21);
		person.MyName();
		person.MyAge();
		System.out.println("Name : "+person.MyName() );
		System.out.println("age : "+person.MyAge());
	}

}
