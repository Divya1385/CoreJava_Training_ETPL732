package com.evergent.corejava.abstract1;
/* 1 Abstract is keyword
   2 abstract class having abstract method and concrete(implementation) method
   3 if any class having one abstract method that class 
     should be declared as abstract keyword otherwise that 
     class will be showing compile time error
 */
abstract public class Product {
	//Abstract method
	abstract public void newproduct();
	//Concrete method
	public void Myproduct() {
		System.out.println("All products");
	}
}