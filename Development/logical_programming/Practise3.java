package com.evergent.corejava.logical_programming;
class practise {
	int eid;
	practise() {
			System.out.println("Divya");
}
}
public class Practise3 extends practise {
	int eid;
	String name;
	Practise3() {
		System.out.println("default");
	}
    Practise3(int eid, String name) {
		super(eid);
		this.name=name;
	}
	public void method() {
		//System.out.println("eid"+eid);
		System.out.println("name"+name);
	}

	public static void main(String[] args) {
		new practise();
		Practise3 p2=new Practise3(2, "vasu");
		p2.method();
		}
}
