package com.evergent.corejava.divya.casestudy;
import java.util.ArrayDeque;
import java.util.Deque;
public class CustomerSupportTicket {
	Deque<String> queue=new ArrayDeque<>();
	public void addTicket(String ticket) {
		System.out.println("Add Ticket: "+ticket);
		queue.add(ticket);
	}
	public String processNextTicket() {
		if (queue.isEmpty()) {
			return "queue is Empty"; 
		}
		return queue.poll();
	}
	public String peekNextTicket() {
		if (queue.isEmpty()) {
			return "queue is Empty"; 
		}
		return queue.peek();
	}
	public void displayQueue() {
		if (queue.isEmpty()) {
			System.out.println("queue is Empty");
		}
		else {
			for (String t:queue) {
				System.out.println("ticket is: "+t);
			}
		}
	}
	public static void main(String[] args) {
		CustomerSupportTicket t1=new CustomerSupportTicket();
		t1.addTicket("Book");
		t1.addTicket("bus");
	    t1.addTicket("event");
		t1.displayQueue();
		t1.addTicket("traffic");
		//System.out.println(t1.processNextTicket());
		//t1.displayQueue();
		//.System.out.println(t1.peekNextTicket());
		//t1.displayQueue();
		System.out.println(t1.processNextTicket());
		System.out.println(t1.processNextTicket());
		t1.displayQueue();
	}
}
