package pattern;

public class Pattern1 
{
public static void main(String[] args) 
{
	int n=7;
	for(int i=1; i<=n; i++)
	{
		for(int j=1; j<=i; j++)
		{
			if(j%2==0)
				System.out.print("*");
			else
			{
				if(j==1)
					System.out.print(j);
				else if(j==3)
					System.out.print(j-1);
				else if(j==5)
					System.out.print(j-2);
				else if(j==7)
					System.out.print(j-3);
			}
		}
		System.out.println();
	}
}
}
