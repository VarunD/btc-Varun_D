package com.btc.Assignments;

import java.util.*;

public class Assignment4 
{
public static String[] fruitsLists( List<String> input1,List<String> input2)
{
	List<String> output = new ArrayList<>();
	for(int i=0; i<input1.size(); i++)
	{
		String s1 = input1.get(i);
		if(s1.charAt(0)!='a'&&s1.charAt(0)!='g')
			output.add(s1);
	}
	for(int i=0; i<input2.size(); i++)
	{
		String s2 = input2.get(i);
		if(s2.charAt(s2.length()-1)!='n'&&s2.charAt(s2.length()-1)!='e')
			output.add(s2);
	}
	String[] st = new String[output.size()];
	for(int i=0; i<output.size(); i++)
	{
		st[i]=output.get(i);
	}
	return st;
}
public static void main(String[] args) 
{
	 List<String> input1=new ArrayList<String>();
	 input1.add("apple");
	 input1.add("orange");
	 input1.add("grapes");
	 List<String> input2=new ArrayList<String>();
	 input2.add("melon");
	 input2.add("apple");
	 input2.add("mango");
	 String[] s2=fruitsLists(input1, input2);	
	 
	 for(int i=0; i<s2.length; i++)
	 {
		 System.out.println(s2[i]);
	 }
}
}
