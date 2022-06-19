package com.btc.Challenge;

import java.util.Scanner;

public class Work 
{
	public static void work(String name, double baseSalary, int hours)
	{
		System.out.println("Name of the employee: "+name);
		System.out.println("Base Salary is the: "+baseSalary);
		System.out.println("the hours worked is: "+hours);
		double totalpaid=0;
		if(hours >40&& baseSalary>12)
		{
			totalpaid	 = 40*12+((hours-40)*24);
		}
		if(baseSalary<12)
			System.out.println("the totalPaid amount paid for employee is: "+ 0);
		
		System.out.println("the totalPaid amount paid for employee is: "+totalpaid);
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the name of the employee: ");
		String name =scan.nextLine();
		
		System.out.println("enter the base pay of the employee");
		double baseSalary  = scan.nextDouble();
		
		System.out.println("Enter number of hours worked by the employee");
		int hours = scan.nextInt();
		
		work(name, baseSalary, hours);	
	}
}
