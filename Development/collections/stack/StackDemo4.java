package com.evergent.corejava.collections.stack;

import java.util.Stack;
//peek():last element value is showing
public class StackDemo4 {

	public static void main(String[] args) {
		Stack mystack=new Stack();
		mystack.push("Red");
		mystack.push("black");
		mystack.push("white");
		mystack.clear();
		boolean b=mystack.isEmpty();
		System.out.println(b);
		System.out.println(mystack);

	}

}
