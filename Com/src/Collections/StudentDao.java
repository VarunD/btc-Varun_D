package Collections;

import java.util.*;

public class StudentDao 
{
	 List<Student1> studentList = new ArrayList<>();
	public StudentDao()
	{
		Student1 s1 = new Student1(90, 89, 78, "abc", 1);
		Student1 s2 = new Student1(83, 67, 87, "xyz", 2);
		Student1 s3 = new Student1(83, 67, 87, "pqr", 2);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		System.out.println("Total marks calculated: ");
		int stu1_Total = s1.getMaths()+s1.getPhysics()+s1.getChem();
		int stu2_total = s2.getMaths()+s2.getPhysics()+s2.getChem();
		int stu3_total = s3.getMaths()+s3.getPhysics()+s3.getChem();
		
		studentList.add(s1.stu1_Total);
		studentList.add(stu2_total,s2);
		studentList.add(stu3_total, s3);
		System.out.println(studentList);
		
//		System.out.println();
//		
//		System.out.println("average is: " + stu_Total1+stu_total2+stu_total3/3);
//		int average[]= new int[3];
//		
//		int mat_avg= s1.getMaths()+s2.getMaths()+s3.getMaths()/3;
//		int phy_avg= s1.getPhysics()+s2.getPhysics()+s3.getPhysics()/3;
//		int chem_avg = s1.getChem()+s2.getChem()+s3.getChem()/3; 
//		average[0]=mat_avg;
//		average[1]=phy_avg;
//		average[2]=chem_avg;
		
		}
	
	public static void main(String[] args) 
	{
		StudentDao s = new StudentDao();
//		for(Student1 std:s.studentList)
//			System.out.println(std);
//	}
//	@Override
//	public String toString() {
//		return "StudentDao [studentList=" + studentList + ", toString()=" + super.toString() + "]";
//	}
		
}
}
