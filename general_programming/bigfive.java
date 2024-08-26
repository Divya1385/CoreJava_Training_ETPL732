package com.evergent.corejava.general_programming;

public class bigfive {

	public static void main(String[] args) {
		int a=3,b=2,c=1,d=6,e=4;
		if (a>b && a>c && a>d && a>e) {
			System.out.println("A is bigger");
		}
		else if (b>c && b>d && b>e){
			System.out.println("B is bigger");
		}
		else if (c>d && c>e){
			System.out.println("c is bigger");
		}
		else if (d>e){
			System.out.println("d is bigger");
		}

		else {
			System.out.println("e is bigger");

	}

}

}