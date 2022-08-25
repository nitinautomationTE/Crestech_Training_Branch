package assignment8april;
import java.util.Scanner;

public class PalindromeNo 
{
    public static void main(String[] args)
    {
    	int num,r, sum=0, temp;
    	System.out.println("Enter the number: ");
    	Scanner sc=new Scanner(System.in);
    	num=sc.nextInt();
    	temp=num;
    	while(num>0)
    	{
    		r=num%10;
    		sum=sum*10+r;
    		num=num/10;
    	}
    	num=temp;
    	if(num==sum)
    	{
    		System.out.println("Given number "+num +" is palindrome");
    	}
    	else
    	{
    		System.out.println("Given number "+num +" is not a  palindrome number");
    	}
    		
    	
    	sc.close();
    }
}

