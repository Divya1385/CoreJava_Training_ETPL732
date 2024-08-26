package com.evergent.corejava.logical_programming;

public class Practise {
	public static void main(String[] args) {
	int a='A';
	int b='C';
	System.out.println((char)a+""+(char)b+"-");
	//System.out.println((a-'A')+""+(b-'A'));
	a=a+1;
	b=b+2;
	while(b<'Z') {
		System.out.println((char)a+""+(char)b+"-");
		//System.out.println((a-'A')+""+(b-'A'));
		a=a+2;
		b=b+2;
	}
}
}

