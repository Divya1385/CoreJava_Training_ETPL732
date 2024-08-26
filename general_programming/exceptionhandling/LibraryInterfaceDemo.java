package com.evergent.corejava.exceptionhandling;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		        KidUsers kidUser1 = new KidUsers();
		        try {
		            kidUser1.registerAccount(10);  
		        } catch (Kid e) {
		            System.out.println(e.getMessage());  
		        }

		        kidUser1.requestBook("Kids");  

		        KidUsers kidUser2 = new KidUsers();
		        try {
		            kidUser2.registerAccount(18);  
		        }
		        catch (Kid e) {
		            System.out.println(e.getMessage());
		        }

		        kidUser2.requestBook("Fiction");
		
		        AdultUsers ad1 = new AdultUsers();
		        try {
		            ad1.registerAccount(5);  
		        } catch (adult e) {
		            System.out.println(e.getMessage());  
		        }

		        ad1.requestBook("kid");  

		        AdultUsers ad2 = new AdultUsers();
		        try {
		            ad2.registerAccount(23);  
		        }
		        catch (adult e) {
		            System.out.println(e.getMessage());
		        }

		        kidUser2.requestBook("Fiction");
	}
}
		   

