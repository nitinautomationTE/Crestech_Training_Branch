package assignment8april;

public class ArrayFor 
{
	public static void main(String[] args)
	{
		//declaration of marks array as int type.
		int marks[];
	   //memory allocation of marks array as int type.
		marks=new int[5];
		// intialization 
		marks[0]=10;
		marks[1]=20;
		marks[2]=30;
		marks[3]=40;
		marks[4]=50;
		
		// printing array elements
		System.out.println("Printing array elements using for loop:");
		for(int i=0; i<marks.length; i++)
		{
			System.out.println(marks[i]);
		}
	
	}

}
