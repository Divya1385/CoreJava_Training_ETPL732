package com.evergent.corejava.string;
//to create a string remove all spaces from the string
public class removespace {

	public static void main(String[] args) {
		String str="The quick brown fox jumps over the lazy dogs";
		String nospace=str.replace(" ","");
		System.out.println(nospace);

	}

}
