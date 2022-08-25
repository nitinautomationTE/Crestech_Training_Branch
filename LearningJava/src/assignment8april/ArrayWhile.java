package assignment8april;


public class ArrayWhile 
{
	public static void main(String[] args)
	{   
		// declaration and instantiation of marks array as int type.
		int[] marks=new int[6];
		
		//initialization of marks array
		marks[0]=26;
		marks[1]=10;
		marks[2]=20;
		marks[3]=30;
		marks[4]=40;
		
		// displaying  array elements.
		System.out.println("These are the elements in arrray");
	    int i=0;
	    while(i<marks.length)
	    {
	    	System.out.println(marks[i]);
	    	i++;
	    }
	 }
}
