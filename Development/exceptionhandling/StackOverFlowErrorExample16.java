package com.evergent.corejava.exceptionhandling;

public  class StackOverFlowErrorExample16 {

	public static void main(String[] args) {
		try {
			 recursivemethod();
		}
		catch(StackOverflowError e) {
			System.out.println("StackOverFlowError caught:"+e.getMessage());
		}
	}
	//Recursive method with no base case
	public static void recursivemethod() {
		recursivemethod();
		
	}
}