package com.evergent.corejava.interface1;
/*We cannot create object to interface but we can create
  reference to interface then we can see only interface methods
 */
public class BookImpl2 implements Book {
		public void BookTitle() {
			System.out.println("CoreJava");
		}
		public void BookAuthor() {
			System.out.println("oracle");
		}
		public void BookPrice() {
			System.out.println("rs.450");
		}
		
		public void show() {
			System.out.println("show is local method");
		}
		public static void main(String[] args) {
			//Cannot instantiate the type Book
			//Book b1=new Book();
			Book b2= new BookImpl2();
			b2.BookTitle();
			b2.BookAuthor();
			b2.BookPrice();
		
			//The method show() is undefined for the type Book
			//b2.show();		
	}

}
