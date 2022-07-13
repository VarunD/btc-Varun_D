
public class Pattern2 
{
public static void main(String args[])
{
	int n=4;
//	for(int i=n; i>=1; i--)
//	{
//		for(int j=1; j<=i; j++)
//		{
//			System.out.print(j);
//		}
//		for(int k=n-i; k>=1; k--)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	
//	for(int i=1; i<=n; i++)
//	{
//		for(int j=n-i; j>=1; j--)
//		{
//			System.out.print(" ");
//		}
//		for(int k=n-i+1; k<=n; k++)
//		{
//			System.out.print(k);
//		}
//		System.out.println();
//	}
	
//	for(int i=1; i<=n; i++)
//	{
//		for(int j=1; j<=i; j++)
//		{
//			System.out.print(j);
//			if(j!=i)
//				System.out.print("*");
//		}
//		System.out.println();
//	}
	try {
	System.out.println(100/0);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}