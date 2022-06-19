package com.btc.Assignment;

public class Assignment5
{
public static boolean hello(String st, char in)
{
	char[] ch = st.toCharArray();
	for(int i=0; i<ch.length; i++)
	{
		if(ch[i]==in)
		{
			if(ch[i-1]==ch[i+1])
				return true;
		}
	}
	return false;
	
}
	public static void main(String[] args) 
	{
		String st = "Hello*world";
		char c ='*';
		boolean result = hello(st, c);
		System.out.println(result);
	}

}
