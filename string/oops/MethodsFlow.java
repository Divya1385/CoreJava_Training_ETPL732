package com.evergent.corejava.oops;

public class MethodsFlow {
	// No parameters with No return Type
	public void show()
	{
		System.out.println("No parameters with No return Type");
	}
	// parameters with No return Type
	public void Myadd(int a, int b) {
		System.out.println(a+b);
	}
	// parameters with return Type
	public int Mymul(int a, int b) {
		return a*b;
	}
	// No parameters with return Type
	public int Myvalue() {
		return 10;
	}
	
	public static void main(String[] args) {
		MethodsFlow F=new MethodsFlow();
		F.show();
		F.Myadd(10,3);
	int S=F.Mymul(10,3);
	System.out.println(S);
	int T=F.Myvalue();
	System.out.println(T);	
	}

}
