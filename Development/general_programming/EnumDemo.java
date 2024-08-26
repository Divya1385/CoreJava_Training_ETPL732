package com.evergent.corejava.general_programming;

enum Color {
	Red, Green,Blue 
}
enum News {
	North,South,West,East
}
enum Products {
	Laptops,Desktops,
}
enum Days {
	M,T,W,Th,F,S
}
public class EnumDemo {

	public static void main(String[] args) {
		Color c=Color.Red;
		System.out.println(c);
		News N=News.North;
		System.out.println(N);
		Products P=Products.Laptops;
		System.out.println(P);
		Days D=Days.M;
		System.out.println(D);
		
	}

}
