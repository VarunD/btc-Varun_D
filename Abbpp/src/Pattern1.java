
public class Pattern1 
{
public static void main(String args[])
{
	int n=5;
//	for(int i=1; i<=n; i++)
//	{
//		for(int j=n-i+1; j>=1; j--)
//		{
//			System.out.print("*");
//		}
//		for(int k=1; k<i; k++)
//		{
//			System.out.print(" ");
//		}
//		for(int m=1; m<i; m++)
//		{
//			System.out.print(" ");
//		}
//		for(int l=n; l>=i; l--)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
for(int i=1; i<=n; i++)
{
	for(int j=n-i; j>=1; j--)
	{
		System.out.print("1");
	}
	for(int j=1; j<=n; j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
}
}
