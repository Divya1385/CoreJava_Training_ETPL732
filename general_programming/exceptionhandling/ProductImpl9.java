package com.evergent.corejava.exceptionhandling;
/* 15 throw is for runtime exceptions and will call predefined 
   and user defined exception
 */
class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String message) {
		System.out.println("Hello: "+message);
	}
}
public class ProductImpl9 {
	int pno=105;
	public void myData() throws Exception {
		if (pno>100)
		  throw new ProductNotFoundException("This product is not there.....");
		    else
		    	System.out.println("product is there...");
	}

	public static void main(String[] args) {
		try {
			ProductImpl9 product1=new ProductImpl9();
			product1.myData();
		}
		catch(Exception e) {
			System.out.println("I can handle: "+e);
			
		}
		System.out.println("handle");
	}

}
