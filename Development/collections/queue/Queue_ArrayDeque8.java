package com.evergent.corejava.collections.queue;
import java.util.ArrayDeque;
public class Queue_ArrayDeque8 {
	public static void main(String[] args) {
		ArrayDeque<String> pq = new ArrayDeque<>();
		pq.add("Banana");
		pq.addFirst("pineapple");
		pq.add("Watermelon");
		pq.addLast("Papaya");
//		pq.offerFirst("Kiwi");
//		pq.add("Apple");
//		System.out.println(pq);
//		System.out.println(pq.size());
//		boolean t = pq.isEmpty();
//		System.out.println(t);
//		pq.clear();
//		System.out.println(pq);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.peekFirst());
		System.out.println(pq.peekLast());
	}
	}
