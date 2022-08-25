package assignment8april;

public class Ans10 
{   
	
	public static void main(String[] args)
	{   
		int i,j,k,row=5;
		for(i=row-1; i>=0; i--)
		{
			for(j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(k=i; k<=row-1; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=1; i<=row-1; i++)
		{
			for(j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(k=i; k<=row-1; k++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}

		
		
	}

}
