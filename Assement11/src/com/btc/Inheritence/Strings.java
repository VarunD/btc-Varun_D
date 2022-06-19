package com.btc.Inheritence;

public class Strings 
{
public static  String capi(String st)
{
	char ch[]= st.toCharArray();
	for(int i=0; i<ch.length; i++)
	{
		if(i==0&&ch[i]!=' '|| ch[i-1]==' '&&ch[i]!=' ')
		{
			if(ch[i]>='A'&& ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
		}
	}
	st = new String(ch);
	return st;
}
public static void main(String[] args) 
{
String st="Varun d is a good boy";	
String s =capi(st);
System.out.println(s);
}
}
