package com.evergent.corejava.general_programming;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name ");
		String name=sc.next();
		System.out.println("enter value1");
		int a=sc.nextInt();
		System.out.println("enter value2 ");
		int b=sc.nextInt();
		System.out.println("total value");
		System.out.println(a+b);
				

	}

}
