package com.btc.Abc;

public class Palindrome {

	public static void main(String[] args) 
	{
		
		String words[] = {"Hannah", "Texas", "Renner", "Eleele"};
		int count=0;
		for(int i=0; i<words.length; i++)
		{
			String rev="";
			String st = words[i];
			char ch[] = st.toCharArray();
//			char cha[]= new char[ch.length];
			for (int j=ch.length-1; j>=0; j--)
			{
				rev = rev+ch[j]; 
			}
			if(words[i].equalsIgnoreCase(rev))
			{
				System.out.println(words[i] +" is a palindrome");
				count++;
			}
		}
	}
}
