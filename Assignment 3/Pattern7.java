import java.util.Scanner;
class Pattern7
{
	public static void main(String args[])
	{
		int n= 5;
		for(int i=1;i<=n;i++)
		
		{
			for(int k=n;k>i;k--)
			{
				System.out.print(" ");
				
			}
			
			for(int j=0;j< i*2-1;j++)
			{
				System.out.print("*");
				
				
			}
			System.out.println();
			
		}
		for(int i=1;i<=n-1;i++)
		{
			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=(n-i)*2-1;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}