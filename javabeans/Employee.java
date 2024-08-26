package com.evergent.corejava.javabeans;
import java.io.Serializable;
public class Employee implements Serializable{
	private int eno; //step 6 : //step 18
	private String ename; //step 10
	private double sal; ////step 14
	public int getEno() { //step 16
		return eno;  //step 17
	}
	public void setEno(int eno) { //step 4
		this.eno = eno; //step 5
	}
	public String getEname() { 
		return ename; 
	}
	public void setEname(String ename) { //step 8
		this.ename = ename; //step 9
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) { //step 12
		this.sal = sal; //step 13
	}

}
