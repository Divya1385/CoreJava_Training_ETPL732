package com.evergent.corejava.string;

public class SplitDemo2 {

	public static void main(String[] args) {
		String str="Java is a powerful programming language";
		//split the string by space
		String[] words=str.split(" ");
		for (int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		//for each advance loop
		for(String a : words) {
			System.out.println(a);
		}	
	}
}

