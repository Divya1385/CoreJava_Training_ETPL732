package com.evergent.corejava.exceptionhandling;
class adult extends Exception {
	public adult(String message) {
	   super(message);
}
}
public class AdultUsers implements LibraryUsers  {
int age;
String booktype;
public void registerAccount(int age) throws adult {
	if (age < 12) {
	throw new adult("you have successfully registered under a kids Account");
	}
	else {
	System.out.println("Sorry,Age must be less than 12 to register as a adult");
	}
}

	public void requestBook(String booktype) {
	this.booktype=booktype;
	if(booktype.equals("adults")) {
	System.out.println("Book Issued Successfully, please return the book within 7 days");
	}
	else {
	System.out.println("oops, you are allowed to take only adults books");
	}
	}
}
