import java.util.*;
class DectoBin
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		String bin=" ";
		while(n>1)
		{
			int r= n%2;
			bin= bin+r;
			n= n/2;
		}
		System.out.println(bin);
	}
}
	