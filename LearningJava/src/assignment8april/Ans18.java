package assignment8april;

public class Ans18
{
	public static void main(String[] args)
	{
		int i,j,k,row=5;
		for(i=0; i<=row; i++)
		{
			for(j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(k=i; k<=row; k++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
		for(i=row; i>=0; i--)
		{
			for(j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(k=i; k<=row; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
}}