package Firdt;
import java.util.Scanner;

public class UniqueArray 
{

	public static void uniqueCheck(int a[],int n)
	{
	    int count=0;
	    for(int i = 0; i < n; i++) {  
	    for(int j = i + 1; j < n; j++) {  
	        if(a[i] == a[j])  
	        {
	            count++;
	        }
	    }  
	}  
	if(count>=1)
	    System.out.println("false");
	else
	    System.out.println("true");   
	}
	public static void main(String[] args)
	{

	    Scanner s=new Scanner(System.in);
	    System.out.println("enter the size of array");
	    int n=s.nextInt();
	    int a[]=new int[n];
	    System.out.println("enter the elements into array");
	    for(int i=0;i<a.length;i++)
	    {
	        a[i]=s.nextInt();
	    }
	    uniqueCheck(a,n);  
	}
	}


