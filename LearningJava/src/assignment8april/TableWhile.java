package assignment8april;

import java.util.Scanner;
public class TableWhile 
{
      public static void main(String[] args)
      {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter the number: ");
    	  int number=sc.nextInt();
    	  int i=1;
    	  while(i<=10)
    	  {
    		  System.out.println(number*i);
    		  i++;
    	  }
    	  
       }
}
