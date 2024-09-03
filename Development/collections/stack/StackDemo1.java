package com.evergent.corejava.collections.stack;
//push(): adding values into stack
//pop(): remove values into stack
import java.util.Stack;

public class StackDemo1 {
	public static void main(String[] args) {
		Stack mystack=new Stack();
		mystack.push("Red");
		mystack.push("black");
		mystack.push("white");
		System.out.println(mystack);
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
	
	}
}

