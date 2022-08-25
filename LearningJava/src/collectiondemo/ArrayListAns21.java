package collectiondemo;

import java.util.ArrayList;

public class ArrayListAns21 
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
    	
    	// adding some colors.
    	a1.add("Black");
    	a1.add("Red");
    	a1.add("Yellow");
    	a1.add("Orange");
    	a1.add("Violet");
    	a1.add("White");
    	
    	System.out.println("Elements in arrayList are:"+a1);
    	//to replace the second element of a ArrayList with the specified element.
    	a1.set(2, "Pink");
    	System.out.println("After replace at second position:"+a1);
	}

}
