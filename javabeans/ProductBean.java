package com.evergent.corejava.javabeans;
import java.io.Serializable;
public class ProductBean implements Serializable {
	private int pno;
	private String Pname;
	private double price;
	public ProductBean(int pno, String pname, double price) {
		this.pno = pno;
		Pname = pname;
		this.price = price;
	}
	public int getPno() {
		return pno;
	}
	public String getPname() {
		return Pname;
	}
	public double getPrice() {
		return price;
	}
	

}
