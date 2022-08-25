package assignment8april;
import java.util.*;
public class CalculatorDriver 
{
	public static void main(String[] args)
	{   
		// while loop to repeat code, so user can give choice again.
		while(true) 
		{
		Scanner sc1=new Scanner(System.in);
		System.out.println("For addition press 1");
		System.out.println("For subtraction press 2");
		System.out.println("For multiplication press 3");
		System.out.println("Enter your choice:");
		// Reading choice
		int  choice=sc1.nextInt();
	    switch(choice)
	    { 
	       // case1 perform addition operation.
	       case 1:
	           
	            System.out.println("Enter two number:");
	            int num1=sc1.nextInt();
	            int num2=sc1.nextInt();
	            Calculator add=new Calculator();
	            add.sum(num1,num2);
	            break;
	       // case2 perform subtraction operation. 
	       case 2:
	    	    
                System.out.println("Enter two number:");
                int num3=sc1.nextInt();
                int num4=sc1.nextInt();
                Calculator sub=new Calculator();
                sub.sub(num3,num4);
                break;
             // case3 perform multiplication operation.
	      case 3:
	    	    
                System.out.println("Enter two number:");
                int num5=sc1.nextInt();
                int num6=sc1.nextInt();
                Calculator mul=new Calculator();
                mul.mul(num5,num6);
                break;
	     default: System.out.println("Invalid choice");
	    	
	    }
	  
		}
		
	    
	}

}
