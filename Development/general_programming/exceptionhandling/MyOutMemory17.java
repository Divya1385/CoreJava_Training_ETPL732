package com.evergent.corejava.exceptionhandling;
//java program to illustrate
//heap error
public class MyOutMemory17 {
	public static void main(String[] args) throws Exception{
		Integer[] array=new Integer[100000000*100000000];
		System.out.println(array);
		

	}

}
