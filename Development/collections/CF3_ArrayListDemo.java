package com.evergent.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
public class CF3_ArrayListDemo {
	public static void main(String[] args) {
		ArrayList mylist= new ArrayList();
		mylist.add(100);
		mylist.add("hello");
		mylist.add(100);
		System.out.println(mylist);
		Iterator i = mylist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
}
}
