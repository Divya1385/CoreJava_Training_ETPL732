package com.evergent.corejava.objectclassmethods;
class person1 {
	String name;
	int age;
	public person1(String name, int age) {
		this.name=name;
		this.age=age;
	}
	//override
	public String toString() {
		return "Name:"+name+ "Age:"+age;
	}
}
public class PersonData {

	public static void main(String[] args) {
		person1 p1=new person1("Divya ",21);
		System.out.println(p1);
		//hashcode
		System.out.println(p1.hashCode());
		
	}

}
