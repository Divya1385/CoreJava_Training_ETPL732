package com.evergent.corejava.logical_programming;

public class FacDemo {

	public static void main(String[] args) {
		int n=1;
		int fac=1;
		if (n==0) {
			System.out.println(fac);
		}
		else {
			for (int i=1; i<=n; i++) {
				fac=fac*i;
			}
			System.out.println(fac);
		}
		

	}

}
