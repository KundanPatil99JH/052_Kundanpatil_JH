class P18
{
	public static void main(String args[])
	{
		int alpha= 65;
		int rows= 5;
		for(int i=5;i>=0;i--)
		{
			for(char j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
	}
}