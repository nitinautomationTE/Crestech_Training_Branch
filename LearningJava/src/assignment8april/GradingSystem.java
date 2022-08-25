package assignment8april;
import java.util.Scanner;

public class GradingSystem
{
	public static void main(String[] args)
	{   
		// Reading marks
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks=sc.nextInt();
		
		// Grade code according to marks
		if(marks>=90 && marks<=100)
			System.out.println("Congratulations: your grade is A+");
		else if(marks>=80 && marks<=90)
			System.out.println("Your grade si A");
		else if(marks>=70 && marks<=80)
			System.out.println("Your grade is B");
		else if (marks>=60 && marks<=70)
			System.out.println("your grade is C");
		else if (marks>=50 && marks<=60)
			System.out.println("Your grade is D");
		else 
			System.out.println("Sorry: you are fail. Please try again");
		}

}
