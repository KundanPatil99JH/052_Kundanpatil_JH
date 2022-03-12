class p5
{
	public static void main(String args[])
	{
		int n=5,alpha=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				{
					System.out.print((char)(alpha+i-1)+" ");
				}
		}
		System.out.println();
	}
}