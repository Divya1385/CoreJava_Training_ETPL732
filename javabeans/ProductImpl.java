package com.evergent.corejava.javabeans;

public class ProductImpl {

	public static void main(String[] args) {
		//Initalizing the values through constructor
		ProductBean product = new ProductBean(100,"laptop",55000);
		//Retrive the values through getter method
		System.out.println("product no: "+product.getPno());
		System.out.println("product name: "+product.getPname());
		System.out.println("product price: "+product.getPrice());
	}

}
