package com.evergent.corejava.collections.queue;
import java.util.Queue;
//Addition: offer(), add()
//Retrieval: peek()
//remove: poll,remove()
import java.util.PriorityQueue;
public class Queue_Demo1 {

	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>();
		pq.add(8);
		pq.add(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq.poll());
		System.out.println(pq);
		pq.clear();
		System.out.println(pq.poll());
		//System.out.println(pq.remove());

	}

}
