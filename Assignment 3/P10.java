import java.util.Scanner;
class P10
{
	public static void main(String args[])
	{
		int n= 5, alpha=65;
		for(int i=n;i>=1;i--)
		
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print((char)(alpha+k-1)+" ");
			
			
			}
			
			System.out.println();
			
		}
	}
}