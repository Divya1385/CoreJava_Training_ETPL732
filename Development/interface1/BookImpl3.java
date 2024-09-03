package com.evergent.corejava.interface1;
// Java will support multiple inheritance through interface
public class BookImpl3 implements Book,NewBook{
		public void BookTitle() {
			System.out.println("CoreJava: "+name);
		}
		public void BookAuthor() {
			System.out.println("oracle");
		}
		public void BookPrice() {
			System.out.println("rs.450");
		}
		public void addNewBook() {
			System.out.println("Java version");
		}
		public void mydata() {
			System.out.println("data here");
		}
		public void show() {
			System.out.println("show is local method");
		}
		public static void main(String[] args) {
			BookImpl3 BI=new BookImpl3();
			BI.BookTitle();
			BI.BookAuthor();
			BI.BookPrice();
			BI.show();
			BI.addNewBook();
			BI.mydata();
	
			
		}
		
		}

