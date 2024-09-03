package com.evergent.corejava.casting;
/* Widening Conversion Hierarchy :
 * byte -> short -> int -> long -> float -> double
 * Implicit (Automatic) Type Conversion
 * Implicit Type Conversion is 
 */
public class ImplicitConversionExample {

	public static void main(String[] args) {
		int num=1088; //intis a 32-bit data type
		double dnum=num; //double is a 64-bit data type
		System.out.println("Integer value:" +num);
		System.out.println("Double value:" +dnum);
		

	}

}
