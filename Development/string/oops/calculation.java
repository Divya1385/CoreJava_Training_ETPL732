package com.evergent.corejava.oops;

public class calculation {
	int a=5;
	int b=2;
	int c;
	public void addition() {
		c=a+b;
		System.out.println(c);
	}
	public void subtraction() {
		c=a-b;
		System.out.println(c);
	}
	public void multiplication() {
		c=a*b;
		System.out.println(c);
	}
	public void division() {
		c=a/b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		calculation cal=new calculation();
		cal.addition();
		cal.subtraction();
		cal.multiplication();
		cal.division();
		
		
	

	}

}
