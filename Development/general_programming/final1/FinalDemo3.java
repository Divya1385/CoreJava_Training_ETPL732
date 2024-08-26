package com.evergent.corejava.final1;
//5)Final class we can’t override
final class myclass1 {
	 public void MyProducts() {
		System.out.println("All Products");
	}
}
public class FinalDemo3 {
	final String cname="India";
	 public void MyProduct() {
		System.out.println("hello products");
		}
		final void MyData() {
			System.out.println("name: "+cname);
		
	}
	public static void main(String[] args) {
		FinalDemo3 fd=new FinalDemo3();
		myclass1 mc=new myclass1();
		mc.MyProducts();
		fd.MyData();
		
	}

}
