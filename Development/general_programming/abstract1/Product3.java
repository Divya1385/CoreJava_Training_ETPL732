package com.evergent.corejava.abstract1;

abstract public class Product3 {
	//abstract class constructor
	public Product3() {
		System.out.println("product3 constructor:abstract class");
	}
	//Abstract method
	abstract public void newproduct();
	//Concrete method
	public void Myproduct() {
		System.out.println("All products");
	}
}