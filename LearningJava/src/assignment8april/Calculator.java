package assignment8april;

public class Calculator 
{
    int num1,num2,sum; // variable declaration
	
    //Method to perform addition operation.
    void sum(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		this.sum=num1+num2;
	    System.out.println("Sum of two number:"+sum);
	}
    //Method to perform division operation.
	void sub(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		System.out.println(num1-num2);
	}
	//Method to perform multiplication operation.
	void mul(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
		System.out.println(num1*num2);
	}

}
