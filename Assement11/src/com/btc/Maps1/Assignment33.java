package com.btc.Maps1;

public class Assignment33 
{
	public  static int hello(String st)
	{
		char ch[]= st.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(ch[0]==ch[ch.length-1])
				return -1;
		}
		return 1;
	}
public static void main(String[] args) 
{
	String st = "this is great";
	int a = hello(st);
	System.out.println(a);
	
}
}
