package basic;
import java.util.Scanner;

public class CompleteDiamond
{
    public static void main(String[] args)
    {
    	int i,j,k;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the no of rows: ");
    	int n=sc.nextInt();
    	for(i=0; i<n; i++)
    	{
    		for(j=0; j<n; j++)
    		{
    			System.out.print(" ");	
    		}
    		for(k=0; k<2*i+1; k++)
    		{
    			System.out.print("*");
    		}
    		System.out.println("");
    	}
    	for(i=n-1; i>0; i--)
    	{
    		for(j=n-1; j>=i; j--)
    		{
    			System.out.print(" ");	
    		}
    		for(k=2*i-1; k>0; k--)
    		{
    			System.out.print("*");
    		}
    		System.out.println("");
    	}
    	
    }
}
