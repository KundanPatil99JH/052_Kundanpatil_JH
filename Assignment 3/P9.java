import java.util.Scanner;
class P9
{
	public static void main(String args[])
	{
		int n= 5, alpha=65;
		for(int i=1;i<=n;i++)
		
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print((char)(alpha+k-1)+ " ");
			}
			System.out.println();
			
		}
	}
}