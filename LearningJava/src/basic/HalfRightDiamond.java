package basic;
import java.util.Scanner;

public class HalfRightDiamond
{
	public static void main(String[] args)
	{
		 int i,j;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number of row for half diamond:");
		 int n=sc.nextInt();
		 for(i=1; i<=n; i++)
		 {
			 for(j=1; j<=i; j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
		 for(i=n; i>1; i--)
		 {
			for(j=i; j>1; j--) 
			{
				System.out.print("*");
			}
			System.out.println("");
		 }
	}

}
