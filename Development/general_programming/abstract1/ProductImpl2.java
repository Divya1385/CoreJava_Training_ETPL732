package com.evergent.corejava.abstract1;
//  5 we cannot create object to abstract class but we can create reference to abstract
public class ProductImpl2 extends Product {
	public void newproduct() {
		System.out.println("my new product");
	}
	public void show() {
		System.out.println("local show");
	}

	public static void main(String[] args) {
		Product p1=new ProductImpl2();
		p1.newproduct();
		p1.Myproduct();
		//The method show() is undefined for the type Product
		//p1.show();
	}
}
