package assignment8april;

public class Ans18Alt 
{
	public static void main(String[] args)
	{
		int i,j,k,row=5;
		for(i=1; i<=row; i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(k=i; k<=row; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		 for(i=1; i<=row; i++) 
	     {
	    	 for(j=i; j<row; j++)
		      {
			     System.out.print(" ");
		      }
		     for(k=1; k<=i; k++)
		     {
			     System.out.print("*");
			     System.out.print(" ");
		     }
		        System.out.println();
	      }
	}

}
