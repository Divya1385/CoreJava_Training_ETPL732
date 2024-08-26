package com.evergent.corejava.abstract1;
/* 4 if any class extends abstract class that class should be override
     all abstract methods, otherwise the class will showing compile time error
  */
public class ProductImpl extends Product {
	public void newproduct() {
		System.out.println("my new product");
	}
	public void show() {
		System.out.println("local show");
	}

	public static void main(String[] args) {
		ProductImpl p1=new ProductImpl();
		p1.show();
		p1.newproduct();
		p1.Myproduct();
	}
}
