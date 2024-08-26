package com.evergent.corejava.string;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hi ");
		System.out.println("initial string: "+sb);
		//append
		sb.append("Divya");
		System.out.println("after append: "+sb);
		//insert
		sb.insert(3,"beauty ");
		System.out.println("after insert: "+sb);
		//replace
		sb.replace(0,2,"hello");
		System.out.println("after replace: "+sb);
		//delete
		sb.delete(0,5);
		System.out.println("after delete: "+sb);
		//reverse
		sb.reverse();
		System.out.println("after reverse: "+sb);
		//capacity and length
		System.out.println("capacity: "+sb.capacity());
		System.out.println("length: "+sb.length());
		}

}
