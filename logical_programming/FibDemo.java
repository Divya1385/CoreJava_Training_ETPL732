package com.evergent.corejava.logical_programming;

public class FibDemo {

	public static void main(String[] args) {
		int n=10;
		int a=0, b=1,temp;
		for (int i=0; i<n; i++) {
			System.out.print(" "+a);
			temp=a+b;
			a=b;
			b=temp;
			
		}

	}

}
