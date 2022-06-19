package com.btc.Assignment;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Assignment3 
{
public static void main(String[] args) 
{
	 int ar1[]=new int[]{1,2,3,4};
     int ar2[]=new int[]{1,2,3,5};
     TreeSet <Integer> tr=new TreeSet<>();
     int nar=0;
     for(int i=0;i<ar1.length;i++)
     {   int count1=0;
         for(int j=0;j<ar2.length;j++)
         {
             if(ar1[i]==ar2[j])
             count1++;
         }
         if(count1==0)
         {
         tr.add(ar1[i]);
          tr.add(ar2[i]);
         }
     }
     
   System.out.println(tr);
}
}

