import java.util.*;
class Leepyear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int yr=sc.nextInt();
		
		if((yr%400==0)||(yr%4==0)&&(yr%100!=0))
		{
			System.out.println("Leepyear");
		}
		else
		{
			System.out.println("NO Leepyear");
		}
	}
}