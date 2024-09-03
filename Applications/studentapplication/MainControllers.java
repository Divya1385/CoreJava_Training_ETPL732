package com.evergent.corejava.studentapplication;
import java.util.Scanner;

public class MainControllers {

	public static void main(String[] args) {
		int studentId=0;
		String studentname="";
		int studentmarks=0;
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter Student ID");
		studentId=sin.nextInt();
		System.out.println(("Enter Student Name"));
		studentname = sin.next();
		System.out.println("Enter Student Marks");
		studentmarks = sin.nextInt();
		
		StudentService studentService = new StudentService();
		
		int updeateCount=studentService.addStudentService(studentId,studentname,studentmarks);
		
		//last
		  System.out.println("Inserted :"+updeateCount+" record divya Success");
	}
}