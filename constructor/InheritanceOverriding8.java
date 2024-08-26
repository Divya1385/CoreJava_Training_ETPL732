package com.evergent.corejava.constructor;
//Attributes
class Animal {
	private String name;
	private int age;
//Constructor
        public Animal(String name, int age) {
		this.name=name;
		this.age=age;
	}
//Method
	public void displayInfo() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		
}
}
//subclass (inheritance) Is_A
class Dog extends Animal {
	String bread;
	public Dog(String name, int age, String bread) {
		super(name,age);
		this.bread=bread;
	}
//method overriding(polymorphism)
public void displayInfo() {
		super.displayInfo();
		System.out.println("Bread:"+bread);
	}
	
}
//main class
public class InheritanceOverriding8 { //Has_A

	public static void main(String[] args) { 
		Dog d=new Dog("bread",10,"chow chow");
		d.displayInfo();	
		}
	}
