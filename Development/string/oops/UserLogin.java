package com.evergent.corejava.oops;

public class UserLogin {
	public void LoginDetails() {
		System.out.println("login details");
	}
	public void LoginDetails(String name, String pass) {
		System.out.println("name:"+name);
		System.out.println("pass:"+pass);
		
	}
	public void LoginDetails(String name, String pass, String captcha) {
		System.out.println("name:"+name);	
		System.out.println("pass:"+pass);
		System.out.println("captcha:"+captcha);
	}
	public int LoginDetails(int mobile, String pass) {
		System.out.println("Mobile:"+mobile);	
		System.out.println("Pass:"+pass);
		return 0;
	}
	public void show() {
		System.out.println("local method");
	}
	

	public static void main(String[] args) {
		UserLogin ul=new UserLogin();
		ul.LoginDetails();
		ul.LoginDetails("divya","divya123");
		ul.LoginDetails("divya","divya123","CsdA");
		ul.LoginDetails(2314,"divya123");
		
	}

}
