class P3
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<5;i++)
		{
			
			for(int k=2*(5-i);k<=0;k--)
			{
			System.out.print(" ");
			
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
				
				
			}
		
			System.out.println();
		}
	}
}