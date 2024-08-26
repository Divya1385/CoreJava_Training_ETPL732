package com.evergent.corejava.oops;

public class Myclass extends calculation{

		public void show() {
			System.out.println("local method");
		}
		public static void main(String[] args) {
			Myclass my=new Myclass();
			my.show();
			my.addition();
		

	}

}
