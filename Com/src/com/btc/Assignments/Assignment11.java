package com.btc.Assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment11 
{
	public static List<Integer> retrievePosition(int[] input1,int[] input2){

		List<Integer> ls = new ArrayList<>();
		  int i;
		  for(i=0;i<input1.length;i++){
		   if(i%2==0)
		   ls.add(input2[i]);
		   if(i%2!=0)
		   ls.add(input1[i]);}
		  return ls;
		 }
	public static void main(String[] args) 
	{
		int[] input1={12,1,32,3};
		  int[] input2={0,12,2,23};
		  List<Integer> l=retrievePosition(input1, input2);
		  for(Integer i : l)
		  {
			  System.out.println(i);
		  }
	}

}
