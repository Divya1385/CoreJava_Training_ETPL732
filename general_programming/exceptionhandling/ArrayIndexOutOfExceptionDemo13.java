package com.evergent.corejava.exceptionhandling;
public class ArrayIndexOutOfExceptionDemo13  {
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5};
		try {
			System.out.println("Access of index 10: " +numbers[10]);
		}
			catch(Exception e) {
				System.out.println("caught the exception:"+e.getMessage());
				System.out.println(e);
			}
		System.out.println("program continues after handling the exception");
		}
		
		
	}

