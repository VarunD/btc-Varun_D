package com.btc.Maps1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignment14 {

	public static void main(String[] args) 
	{
		Map<Integer, Integer> m = new HashMap<>();
		m.put(12, 90);
		m.put(35, 90);
		m.put(33, 90);
		m.put(56, 88);
		int sum=0;
		int count=0;
//		int v[]= new int[4];
//		for(Integer d :m.keySet())
//		{
//			if(m.get(d)%2!=0)
//			{
//				v[d]=m.get(d);
//				System.out.println(m.get(d));
//			}
//				
//		}
//		for(int i=0; i<v.length; i++)
//		{
//			System.out.println(v[i]);
//		}
//		
//		System.out.println(sum/v.length);
//		
		
		
	Iterator<Integer> i = m.keySet().iterator();
	while(i.hasNext())
	{
		int n = i.next();
		if(n%2!=0)
		{
			int c=0;
			c++;
			sum+=m.get(n);
			System.out.println(sum/c);
		}
			
	}
		
	}

}
