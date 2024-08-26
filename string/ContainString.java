package com.evergent.corejava.string;
/* create a java program that creates a string checks if it contains a specific 
 substring and then print out result*/

public class ContainString {

	public static void main(String[] args) {
		String str="The quick brown fox jumps over the lazy dogs";
		String substr="fox";
		Boolean contains=str.contains(substr); 
		System.out.println("Contains " +substr+" : " +contains);
	}
}