package com.btc.Maps1;

import java.util.*;

public class Assignment1 
{
	public static Map<String, String> count(String[] st)
	{
		List<String> ls = new ArrayList<>();
		for(String s: st)
		ls.add(s.toUpperCase().substring(0,3));
		
		List<String> la = new ArrayList<>();
		for(String s1: st)
			la.add(s1);
		
	for(int i=2; i<la.size();i++)
	{
		la.get(2).toUpperCase().substring(0,1);
	}
	
	Map<String, String> map = new HashMap<>();
	for(int i=0; i<ls.size(); i++)
	{
	map.put(ls.get(i), la.get(i));
//	in order to get the element of the one index 
//	we should always use the "get"....
	}
		System.out.println(la);
		return map;
	}
public static void main(String[] args) 
{
	String a[]= {"goa", "kerala", "gujurat"};
	Map<String, String> m =count(a);
	
	System.out.println(m);
}
}
