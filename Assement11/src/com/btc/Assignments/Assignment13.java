package com.btc.Assignments;

import java.util.Scanner;

public class Assignment13 
{
	public static void main(String args[]) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the decimal value");
	    int n1=sc.nextInt();
	    int n2=sc.nextInt();
	    int res=0;
	    for(int i=n1;i<=n2;i++)
	    {  int temp=i;int rev=0;
	        while(temp>0)
	        {
	           rev=rev*10+(temp%10);
	           temp=temp/10;
	        }
	        if(rev==i)
	        {
	             //System.out.println(i);
	        res=res+i;
	        }
	    }
	       System.out.println(res);
	    }
}
