package basic;

import java.util.Scanner;

public class HalfLeftDiamond 
{
	public static void main(String [] args)
	{
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row for half diamong: ");
		int n=sc.nextInt();
		for(i=0; i<n; i++)
		{
			for(j=0; j<n-1; j++)
			{
				System.out.print(" ");
			}
			for(k=0; k<=1; k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(i=n-1; i>0; i--)
		{
			for(j=n; j>=1; j--)
			{
				System.out.print(" ");
			}
			for(k=i; k>0; k--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
