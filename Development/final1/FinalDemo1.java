package com.evergent.corejava.final1;
// Final variable we can’t modify
public class FinalDemo1 {
	final String cname="India";
	public void display() {
		//The final field FinalDemo1.cname cannot be assigned
		//cname="welcome";
		System.out.println("name:"+cname);
	}
	public static void main(String[] args) {
		FinalDemo1 fd=new FinalDemo1();
		fd.display();
		
	}

}
