package com.evergent.corejava.studentapplication;

 import java.io.Serializable;

public class StudentBean implements Serializable {
	private String studentname;
	private int studentmarks;
	private String grade;
	private int studentId;
	public int getstudentId() {
		return studentId;
	}
	public void setstudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getstudentname() {
		return studentname;
	}
	public void setstudentname(String name) {
		this.studentname = name;
	}
	public float getstudentmarks() {
		return studentmarks;
	}
	public void setstudentmarks(int marks) {
		this.studentmarks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
}
 }