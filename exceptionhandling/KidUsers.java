package com.evergent.corejava.exceptionhandling;
class Kid extends Exception {
	public Kid(String message) {
	   super(message);
}
}
public class KidUsers implements LibraryUsers {
	int age;
	String booktype;
	public void registerAccount(int age) throws Kid {
		
		if (age < 12) {
		throw new Kid("you have successfully registered under a kids Account");
		}
		else {
		System.out.println("Sorry,Age must be less than 12 to register as a kid");
		}
	}
		public void requestBook(String booktype) {
		this.booktype=booktype;
		if(booktype.equals("kids")) {
		System.out.println("Book Issued Successfully, please return the book within 7 days");
		}
		else {
		System.out.println("oops, you are allowed to take only kids books");
		}

	

}
}


