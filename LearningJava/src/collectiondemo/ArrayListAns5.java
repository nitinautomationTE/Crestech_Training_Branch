package collectiondemo;

import java.util.ArrayList;

public class ArrayListAns5 
{
	public static void main(String[] args)
	{
	            // creating an arraylist
		    	ArrayList a1=new ArrayList();
		    	
		    	// adding some colors.
		    	a1.add("Black");
		    	a1.add("Red");
		    	a1.add("Yellow");
		    	a1.add("Orange");
		    	a1.add("Violet");
		    	a1.add("White");
		    	
                System.out.println(a1);
		    	//update specific array element by given element.
		    	//let update orange to Green.
		    	a1.set(3, "Green");
		    	System.out.println("After update element at postion 3 , list is:"+a1);
}
}
