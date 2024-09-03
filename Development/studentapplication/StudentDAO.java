package com.evergent.corejava.studentapplication;
import java.util.ArrayList;

public class StudentDAO {
	
	                       //  100  corejava 250   c
	public int addStudent(StudentBean studentBean)
	{
		try{
			ArrayList studentList=new ArrayList();
			studentList.add(studentBean.getstudentId());
			studentList.add(studentBean.getstudentname());
			studentList.add(studentBean.getstudentmarks());
			studentList.add(studentBean.getGrade());	
			
			System.out.println(studentList);
			
			System.out.println("Student ID :"+studentBean.getstudentId());
			System.out.println("Student Name :"+studentBean.getstudentname());
			System.out.println("Student Marks :"+studentBean.getstudentmarks());
			System.out.println("Student Grade :"+studentBean.getGrade());
			
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}

}