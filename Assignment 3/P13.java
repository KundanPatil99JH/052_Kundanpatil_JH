import java.util.Scanner;
class P13
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=n-1;k>=i;k--)
			{
				System.out.print("i");
				
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
				
			}
			for(int k=1;k<=i-1;k++)
			{
				System.out.print("*");
				}
			
			System.out.println();
			
		}
	}
}