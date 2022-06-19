package Collections;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
	public static void main(String[] args) 
	{
		List<Student> studentList;
			Student s1 = new Student(1001, "Harsh", 85, 77, 82);
			Student s2 = new Student(1002, "Priya", 57, 35, 63);
			Student s3 = new Student(1003, "Suraj", 32, 71, 61);
			Student s4 = new Student(1004, "Anil", 55, 52, 61);
			Student s5 = new Student(1009, "Arul", 95, 92, 97);
			
			studentList = new ArrayList<>();
			studentList.add(s1);
			studentList.add(s2);
			studentList.add(s3);
			studentList.add(s4);
			studentList.add(s5);
			ReportGeneration r=new ReportGeneration();
			System.out.println("CLASS TOPPER IS "+r.getTopScorer(studentList));
			System.out.println();
			r.getPassedOutStudents(studentList);
			System.out.println();
			r.getStudentsForRetest(studentList);
			System.out.println();
			r.getStudentGrades(studentList);
			System.out.println();
			r.getStudentRollNumber(studentList);
	}
}
