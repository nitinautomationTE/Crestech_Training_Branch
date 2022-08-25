package assignment8april;

public class Ans16 
{
	public static void main(String[] args)
	{
		int i,j, rows=5;
		for(i=1; i<=rows; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		for(i=1; i<rows; i++)
		{   
			for(j=i; j<rows; j++)
			{
			   System.out.print("*");
			   System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
