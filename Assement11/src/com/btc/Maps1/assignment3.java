package com.btc.Maps1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class assignment3 
{
public static void main(String[] args) 
{
	Map<Integer, Integer> m = new HashMap<>();
	m.put(1, 4);
	m.put(2, 6);
	m.put(4, 7);
	m.put(5, 9);
	int a[]= new int[4];
	List<Integer>  x= new ArrayList<>();
	
	for(Integer i :m.keySet())
	{
		if(m.get(i)%2==0)
			a[i]=m.get(i);
	}
	int sum=0;
	System.out.println("======");
	for(int i=0; i<a.length; i++)
	{
		sum=sum+a[i];
		System.out.println(a[i]);
	}
	System.out.println(sum/a.length);
}
}
