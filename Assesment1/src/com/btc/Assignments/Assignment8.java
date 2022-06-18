package com.btc.Assignments;

import java.util.Arrays;

public class Assignment8 
{
	    public static void main(String args[]) {
	   int ar1[]=new int[]{1,2,3,4,5};
	   int ar2[]=new int[]{6,7,8,9,10};
	   int result[]=new int[ar1.length];
	   for(int i=0;i<result.length;i++)
	   {
	       if(i%2==0)
	       result[i]=ar2[i];
	       else
	       result[i]=ar1[i];
	   }
	   System.out.println(Arrays.toString(result));
	    
	}

}
