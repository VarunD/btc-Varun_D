package com.btc.Assignment;


import java.util.*;
public class Assignment9
{
 public static String fruits(String s[], int n)
 {
	 String st = new String();
	 List<String> ls = new ArrayList<>();
	 for(int i=0; i<s.length; i++)
	 {
		 ls.add(s[i]);
	 }
	 Collections.sort(ls);
	 System.out.println(ls);
	 Collections.reverse(ls);
	 System.out.println(ls);
	 
	 for(int i=0; i<ls.size(); i++)
	 {
		if(i==n-1)
			st=ls.get(i);
		
	 }
	 return st;
	
 }
 public static void main(String[] args) 
{
String s[]= {"red", "green", "blue", "ivory"};
int n=3;
String s1 = fruits(s,n);
//fruits(s,n);\
System.out.println(s1);
}
}



























//public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
//int fr=sc.nextInt();
//String a[]=new String[fr];
//for(int i=0;i<fr;i++)
//{
//  a[i]=sc.next();
//}
//String ba=sc.next();
//getvalues(a,ba);
//}
//public static void getvalues(String[] a, String b) {
//ArrayList<String>al=new ArrayList<String>();
//for(int i=0;i<a.length;i++)
//{
//al.add(a[i]);
//}
//System.out.println(al);
//Collections.sort(al);
//System.out.println(al);
//Collections.reverse(al);
//System.out.println(al);
//for(int i=0;i<al.size();i++)
//{
//if(b.equals(al.get(i)))
//{
//System.out.println(i+1);
//}
//}
//}
//}
