package com.btc.Assignments;

import java.util.Arrays;

public class Assignment8 
{
//	
//	
//	
//	
//	public static int[] hello(int a[])
//	{	int k=0;
//		int result[]= new int[5];
//		for(int i=0; i<a.length; i++)
//		{
//			if(a[i]%2==0)
//			{
//				result[k]=a[i];
//				k++;
//		}
//		}
//		return result;
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	public static void display(int arr[])
//	{
//		for(int i=0; i<arr.length; i++)
//			System.out.print(arr[i]+" ");
//	}
//	
//	
//	
//	
//	public static void main(String[] args) 
//	{
//		int array1[] = {1, 2, 3, 4, 5};
//		int array2[] = {6, 7, 8, 9, 10};
//		int out[]= new int[array1.length + array2.length];
//		int i=0;
//		int j=0;
//		
//		for(int k=0; k<out.length;)
//		{
//			if(i<array1.length)
//			{
//				out[k]=array1[i];
//				k++;
//				i++;
//			}
//			if(j<array2.length)
//			{
//				out[k]=array2[j];
//				j++;
//				k++;
//			}
//		}
//	int a[]= hello(out);
//		display(a);
//		for(int m=0; m<out.length; m++)
//		{
//			System.out.println(out[m]);
//		}
	
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
