import java.util.*;
class A15
{
	public static void main(String args[])
	{
	 Scanner sc= new Scanner(System.in);
	 int a= sc.nextInt();
	 int b= sc.nextInt();
	 
	  int temp = a;
	  a= b;
	  b=temp;
	   System.out.println(" After Swapping a= "+a+" and b=" +b);
	 }
}