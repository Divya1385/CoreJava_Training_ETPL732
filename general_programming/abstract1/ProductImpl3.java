package com.evergent.corejava.abstract1;

public class ProductImpl3 extends Product3 {
	public ProductImpl3() {
		System.out.println("ProductImpl3 constructor");
	}
	public void newproduct() {
		System.out.println("my new product");
	}
	public void show() {
		System.out.println("local show");
	}
	public static void main(String[] args) {
		Product3 p1=new ProductImpl3();
		//The method show() is undefined for the type Product3
		//p1.show();
		p1.newproduct();
		p1.Myproduct();
	}
}