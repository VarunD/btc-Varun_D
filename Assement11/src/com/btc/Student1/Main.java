package com.btc.Student1;
import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		List<Student> studentList;
			Student s1 = new Student(1001, "Harsh", 85, 77, 82);
			Student s2 = new Student(1002, "Priya", 57, 35, 63);
			Student s3 = new Student(1003, "Suraj", 32, 71, 61);
			Student s4 = new Student(1009, "Anil", 55, 52, 61);
			Student s5 = new Student(1005, "Arul", 95, 92, 97);
			
			studentList = new ArrayList<>();
			studentList.add(s1);
			studentList.add(s2);
			studentList.add(s3);
			studentList.add(s4);
			studentList.add(s5);
			
			ReportGeneration r = new ReportGeneration();
			
			Comparator<Student> sortByRollNumber = new Comparator<Student>()
			{
				@Override
				public int compare(Student s1, Student s2) {
					return s1.getRollNo()-s2.getRollNo();
				}
			};
			
			Collections.sort(studentList, sortByRollNumber);
			for(Student student :studentList )
			{
				System.out.println(student);
			}
			ReportGeneration r2 = new ReportGeneration();
			
			r2.getPassedOutStudents(studentList);
			System.out.println("===============================");
			r2.getStudentsForRetest(studentList);
			System.out.println("===============================");
			r2.topScorer(studentList);
			System.out.println();
			r2.getStudentGrades(studentList);
	}
}
