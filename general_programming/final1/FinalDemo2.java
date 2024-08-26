package com.evergent.corejava.final1;
//Final method we can’t inheritance
class myclass {
	//overrides final method com.evergent.corejava.final1.myclass.MyProducts()
	final public void MyProducts() {
		System.out.println("All Products");
	}
}
public class FinalDemo2 extends myclass {
	final String cname="India";
	 public void MyProduct() {
		System.out.println("hello products");
		}
		final void MyData() {
			System.out.println("name: "+cname);
		
	}
	public static void main(String[] args) {
		FinalDemo2 fd=new FinalDemo2();
		fd.MyProducts();
		fd.MyData();
		
	}

}
