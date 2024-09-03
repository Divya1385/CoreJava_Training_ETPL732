package com.evergent.corejava.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
public class CF6_ListIterator {
	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		list.add("vani");
		list.add("divya");
		list.add("Roni");
		list.add("Harish");
		ListIterator li=list.listIterator();
		li.add("Welcome");
		while(li.hasNext())
		{
			String s= (String) li.next();
			System.out.println(s);
			if(s.equals("Rog"))
				li.remove();
			}
		while(li.hasPrevious())
			System.out.println(li.previous());
	}
}