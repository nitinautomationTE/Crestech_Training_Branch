package assignment8april;

import java.util.Scanner;
public class VehicleDriver 
{
	    public static void main(String[] args)
	    { 
	    // while loop to repeat same code. By that user can give their choice again.
	      while(true)
	      {
	      Scanner ch=new Scanner(System.in);
	      System.out.println("Enter your Vehicle name:");
	      String choice=ch.nextLine();
	      
	      switch(choice)                        // switch statement to read the choice.
	     {
	       case "car":
	       {
	          //Scanner sc=new Scanner(System.in);
	          Vehicle car=new Vehicle();
              System.out.println("Enter  no of seats in car:");
              int seat=ch.nextInt();
              System.out.println("Enter  no of wheels in car:");
              int wheel=ch.nextInt();
              car.setInfo(seat,wheel);
              car.display();
              break;
            
        
	       }
	      case "motorcycle":
	       {
         
	    	
	 	      Vehicle motorcycle=new Vehicle();
	          System.out.println("Enter no of seats in motorcycle:");
	          int seat=ch.nextInt();
	          System.out.println("Enter no of wheels in motorcycle:");
	          int wheel=ch.nextInt();
	          motorcycle.setInfo(seat,wheel);
	          motorcycle.display();
	          break;

	        
      
	      } 
	       default:System.out.println("Invalid choice");
	       System.out.println();
	      }
	      }
	 }
        
        
        
}
