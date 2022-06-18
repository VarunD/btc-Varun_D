package Firdt;
import java.util.Scanner;

public class FencingBern {
	public static void square(int s)
	{
	    System.out.println("Area of square fence of chickens is " + s*s);
	}
	public static void circular(double radius)
	{
	    System.out.println("Area of circular area for the ducks is " + 3.142*radius*radius);
	}
	public static void rectangular(double length, double width)
	{
	    System.out.println("Area of rectangular area for the cows is " + length*width);
	}
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    System.out.println(" enter 1 for Square area of chicken");
	    System.out.println("enter 2 for circular area for ducks");
	    System.out.println("press 3 for Rectangular area ");
	    int a=scan.nextInt();
	    switch(10)
	    {
	        case 1: 
	            System.out.println("enter the side value");
	            int side=scan.nextInt();
	            square(side);
	            break;
	        case 2:
	            System.out.println("enter the  radius value");
	            int radius=scan.nextInt();
	            circular(radius);
	            break;
	        case 3:
	            System.out.println("enter the length  value");
	            int length=scan.nextInt();
	            System.out.println("enter the width value");
	            int width=scan.nextInt();
	            rectangular(length,width);
	            break;
	        default:
	            System.out.println("invalid value");
	    } 
}
}
