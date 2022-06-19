package com.btc.Maps1;

import java.util.*;
public class Assignment2 {
	public static void main(String[] args) 
	{
		Map<String, Integer> m = new HashMap<>();
		m.put("abc", 40);
		m.put("efg", 70);
		
		Map<String, String> n = new HashMap<>();
		for(String i :m.keySet())
		{
			if(m.get(i)<50)
			{
				n.put(i, "fail");
			}
			else
			{
				n.put(i, "pass");
			}
		}
		System.out.println(n);

}
}