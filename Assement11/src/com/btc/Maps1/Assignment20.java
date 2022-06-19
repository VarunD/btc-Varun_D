package com.btc.Maps1;

public class Assignment20 
{
public static void main(String[] args) {
	String[] input = {"Vikas", "Lokesh", "Ashok"};
	StringBuffer s = new StringBuffer();
	s.append('"');
	for(int i=0; i<input.length; i++)
	{
		s.append(input[i]).append(',');
	}
	System.out.println(s);
	s.deleteCharAt(s.length()-1);
	
	s.append('"');
	System.out.println(s);
//	String st = 
}
}
