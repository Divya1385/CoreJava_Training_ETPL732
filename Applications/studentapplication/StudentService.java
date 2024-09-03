package com.evergent.corejava.studentapplication;

public class StudentService {
    //100      corejava    250
public int addStudentService(int studentId,String studentname,int studentmarks)
{  String grade="";

if(studentmarks<=300)
{
grade = "C";
}
else if(studentmarks<=600)
{
grade = "B";

}
else
{
grade = "A";
}


StudentDAO studentDAO = new StudentDAO();
StudentBean studentBean=new StudentBean();
studentBean.setstudentId(studentId);	
studentBean.setstudentname(studentname);
studentBean.setstudentmarks(studentmarks);
studentBean.setGrade(grade);

int updateResult= studentDAO.addStudent(studentBean);

return 1;
} 
}