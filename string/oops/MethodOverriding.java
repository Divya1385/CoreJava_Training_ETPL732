package com.evergent.corejava.oops;
class MyBigData {
	public void MyData() {
		System.out.println("MyBigData");
	}
}
public class MethodOverriding extends MyBigData {
	public void MyData() {
		System.out.println("MyData");
	}
	public void show() {
		System.out.println("local member");
	
	}
	public static void main(String[] args) {
		MethodOverriding mr=new MethodOverriding();
		mr.MyData();
		mr.show();
	}

}
