package com.evergent.corejava.interface1;
/* If any class implements interface that class 
  should be override all interface methods otherwise 
  that class will be showing compile time error.
 */
public class BookImpl implements Book {
		public void BookTitle() {
			System.out.println("CoreJava: "+name);
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
			BookImpl BI=new BookImpl();
			BI.BookTitle();
			BI.BookAuthor();
			BI.BookPrice();
			BI.show();
	}

}
