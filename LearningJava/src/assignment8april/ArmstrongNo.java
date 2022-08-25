package assignment8april;
import java.util.Scanner;

public class ArmstrongNo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int rem,cube,sum=0,temp=0;
		temp=num;
		while(num>0)
		{
			 rem=num%10;
			 cube=rem*rem*rem;
			 sum=sum+cube;
			 num=num/10;
	  }
	  num=temp;
	  if(sum==num)
	  {
		  System.out.println("Armstrong no");
	  }
	  else
	  {
		  System.out.println("Not an Armstrong no");
	  }
	sc.close();	
	}

}
