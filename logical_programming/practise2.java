package com.evergent.corejava.logical_programming;
class Myperson {
	public void personname() {
		System.out.println("Divya");
	}
}
class persondetails extends Myperson {
	public void Persondata() {
		System.out.println("Mahabubnagar");
	}
}
public class practise2 extends persondetails  {
	public void show() {
		System.out.println("local method");
	}
	public static void main(String[] args) {
		practise2 p1=new practise2();
		p1.personname();
		p1.Persondata();
		p1.show();	
	}
}
