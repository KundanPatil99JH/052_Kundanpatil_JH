class P17
{
	public static void main(String args[])
	{
		int n= 5;
		int temp=1;
		for(char i=1;i<=5;i++)
		{
			for(char j=1;j<=i;j++)
			{
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}
	}
}