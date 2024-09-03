package com.evergent.corejava.collections.stack;
/*push(): adding values into stack
pop(): remove values into stack
eek():last element value is showing
isEmpty:check if the stack is empty
search:search for an element in the stack and return its position from the top
*/
import java.util.Stack;
public class Stack_Demo5_Methods {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		stack.push("Apple");
		stack.push("Banana");
		stack.push("cherry");
		stack.push("Date");		
		String topElement=stack.peek();
		System.out.println("Top elements:"+topElement);
		String removedElement=stack.pop();
		System.out.println("popped element:"+removedElement);
		System.out.println("stack after pop:"+stack);
		System.out.println("---------------");
		boolean isEmpty=stack.isEmpty();
		System.out.println("Is the stack empty? "+isEmpty);
		int position=stack.search("Banana");
		if (position !=-1) {
			System.out.println("position of 'banana' from top:" +position);
		}
		else {
			System.out.println("Banana is not in stack ");
		}
		//clearing the stack
		stack.clear();
		System.out.println("stack after clear:"+stack);
			
		
	}

}
