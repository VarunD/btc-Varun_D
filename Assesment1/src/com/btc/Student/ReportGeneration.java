package com.btc.Student;

import java.util.List;

public class ReportGeneration extends Student
{
	Student s=new Student();
	public int[] totalscore(List<Student> studentList)
	{
		int result_Total[]=new int[studentList.size()];
		for(int i=0;i<studentList.size();i++)
		{
			while(i<studentList.size())
			{
				int total=0;
				total=studentList.get(i).getMathsScore();
				total=total+studentList.get(i).getChemistryScore();
				total=total+studentList.get(i).getPhysicsScore();
				result_Total[i]=total;
			}
		}
		return result_Total;
	}
	public void getPassedOutStudents(List<Student> studentList)
	{
		for(int i=0;i<studentList.size();i++)
		{
			if( studentList.get(i).getChemistryScore()>=50 && studentList.get(i).getMathsScore()>=50 && studentList.get(i).getPhysicsScore()>=50)
			{
		
				System.out.println("Name of the Students who passed in the examination is "+studentList.get(i).getStudentName());
			}
		}
	}
//	public void namesOfStudentReappear(List<Student> studentList)
//	{
//		for(int i=0; i<studentList.size(); i++)
//		{
//			if(studentList.get(i).getChemistryScore()<50&&studentList.get(i).getPhysicsScore()<50&&studentList.get(i).getMathsScore()<50)
//				System.out.println("The student "+studentList.get(i).getStudentName()+"need to reapper for the exam");
//		}
//	}
//	public void gradeOfEachStudent(List<Student> studentList , int []total )
//	{
//		for(int i=0; i<total.length; i++)
//		{
//			String grade=null;
//			char grade1 = 0;
//			
//			if(studentList.get(i).getChemistryScore()<50||studentList.get(i).getPhysicsScore()<50 || studentList.get(i).getMathsScore()<50)
//			{	grade="fail";
//				grade1 = 'F';
//				System.out.println("The Grade of the student :" + studentList.get(i).getStudentName()+ grade1 +"("+grade+")");
//			}
//			
//			else if(total[i]>250)
//			{
//				grade1 = 'A';
//				System.out.println("The Grade of the student :" + studentList.get(i).getStudentName()+grade1);
//			}
//			else if(total[i]>200)
//			{
//				grade1 = 'B';
//				System.out.println("The Grade of the student :" + studentList.get(i).getStudentName()+grade1);
//			}
//			else if(total[i]>150)
//			{
//				grade1 = 'C';
//				System.out.println("The Grade of the student :" + studentList.get(i).getStudentName()+grade1);
//			}
//	}
//	}
	
	public String topScorer(List<Student> studentList)
	{
		String name=null;
		
		int result[]=totalscore(studentList);
		int big=result[0];
		int bigIndex=0;
		for(int i=0;i<studentList.size();i++)
		{
			if(big<result[i])
			{
				big=result[i];
				bigIndex=i;
			}
			
		}
		name=studentList.get(bigIndex).getStudentName();
		return name;
	}
	
	
	public void getStudentsForRetest(List<Student> studentList)
	{
		for(int i=0;i< studentList.size();i++)
		{
			if( studentList.get(i).getChemistryScore()<50 || studentList.get(i).getMathsScore()<50 || studentList.get(i).getPhysicsScore()<50)
			{
		
				System.out.println("Student who failed in the examination "+studentList.get(i).getStudentName());
			}
		}
	}
	
	public void getStudentGrades(List<Student> studentList)
	{
		char grade = 0;
		int[] total=totalscore(studentList);
		for(int i=0;i<total.length;i++)
		{
			if( studentList.get(i).getChemistryScore()<50 || studentList.get(i).getMathsScore()<50 || studentList.get(i).getPhysicsScore()<50)
			{
				grade='F';
				System.out.println("Student Name is:  "+ studentList.get(i).getStudentName()+" GRADE: "+grade);

			}
			else if(total[i]>=150 && total[i]<200)
			{
				grade='C';
				System.out.println("Student Name is: "+ studentList.get(i).getStudentName()+" GRADE: "+grade);
			}else if(total[i]>=200 && total[i]<250)
			{
				
				grade='B';
				System.out.println("Student Name is: "+ studentList.get(i).getStudentName()+" GRADE: "+grade);
				
			}
			else if(total[i]>=250)
			{
				
				grade='A';
				System.out.println("Student Name is: "+ studentList.get(i).getStudentName()+" GRADE: "+grade);
			}
		}
		
	}
	
	}


