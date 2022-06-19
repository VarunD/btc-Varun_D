package com.btc.Assignment;

import java.util.*;

public class Assignment10 
{

	public static void main(String[] args) 
	{
		int input1[] = {1, 2, 3,4};
		int input2[] = {3, 4, 5, 6};
		
		
		Set<Integer> add = new HashSet<>();
		for(int i=0; i<input1.length; i++)
		{
			for(int j=0; j<input2.length; j++)
			{
				{
				if(input1[i]==input2[j])
					add.add(input1[i]);
				}
			}
		}
		System.out.println(add);
		int sum=0;
		for(Integer i :add)
		{
			sum=sum+i;
		}
		System.out.println("the sum of common elements are: "+sum);
}
}
