package com.btc.Assignments;

public class Pattern1 
{
public static void main(String[] args) 
	{
	int n=5;
	int k=1;
	for(int i=1; i<=n; i++)
	{
	for(int j=1; j<=i; j++)
	{
		System.out.print(k+" ");
		k++;
		if(k==10)
		{
			k=1;
		}
	}
	for(int l=n-i; l>=1; l--)
	{
		System.out.print("*"+" ");
	}
	System.out.println();
	}
}
}