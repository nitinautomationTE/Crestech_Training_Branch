package collectiondemo;

import java.util.ArrayList;

public class ArrayListAns3 
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
		    	
		    	System.out.println("Before adding element at first position:"+a1);
		    	System.out.println("============================");
		    	a1.add(0,"Green");
		    	System.out.println("After added element at first position:"+a1);
		    	
		    	/* Added by set()
		    	 a1.set(0,"Green");
		    	 System.out.println("After added element at first position:"+a1);*/
		    	 
	}

}
