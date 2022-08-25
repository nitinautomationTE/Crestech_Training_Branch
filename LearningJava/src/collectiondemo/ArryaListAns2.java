package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
public class ArryaListAns2 extends ArrayListAns1
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
    	
    	//Printing elements by using iterator
    	Iterator n1=a1.iterator();
    	while(n1.hasNext())
    	{
    		System.out.println(n1.next());
    	}
		
	}

}
