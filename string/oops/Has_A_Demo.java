package com.evergent.corejava.oops;

public class Has_A_Demo {
	public void MyData() {
		System.out.println("MyData");
	}

	public static void main(String[] args) {
		Has_A_Demo H=new Has_A_Demo();
			H.MyData();
			Person P=new Person();
			P.display();
		
		

	}

}
