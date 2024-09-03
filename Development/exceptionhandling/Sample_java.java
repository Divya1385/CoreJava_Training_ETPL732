package com.evergent.corejava.exceptionhandling;
class StudentNotFoundException extends Exception {
	StudentNotFoundException(String Message) {
		super(Message);
	}
	}
public class Sample_java {
	public static void display(int Students) throws StudentNotFoundException{
		if (Students>20) {
		throw new StudentNotFoundException("class is invalid");
		}
		else {
			System.out.println("class is valid");
		}
	}
	public static void main(String[] args) {
		try {
			display(28);
		}
		catch(StudentNotFoundException e) {
			System.out.println("I can handle: "+e.getMessage());
			System.out.println(e);
	
		}
		System.out.println("end");

	}

}
