package com.evergent.corejava.string;

public class StringBuilders {
	public static void main(String[] args) {
		String series="";
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			series = series + ch;
		}
		System.out.println(series);
		System.out.println('a'+'b');
		System.out.println('a'+3);		
		
	}
}
