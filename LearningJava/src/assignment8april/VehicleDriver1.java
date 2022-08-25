package assignment8april;

import java.util.Scanner;
public class VehicleDriver1 
{ 
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sheets:");
		int sheets=sc.nextInt();
		System.out.println("Enter wheels:");
		int wheels=sc.nextInt();
		Vehicle car=new Vehicle();
		car.setInfo(sheets, wheels);
		car.display();
		
		Vehicle motorcycle=new Vehicle();
		System.out.println("Enter sheets:");
		int sheet1=sc.nextInt();
		System.out.println("Enter wheels:");
		int wheel1=sc.nextInt();
	
		motorcycle.setInfo(sheet1,wheel1);
		motorcycle.display();
		
		sc.close();
		
	}

}
