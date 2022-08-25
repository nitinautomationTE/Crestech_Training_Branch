package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAns8 
{
	public static void main(String[] args)
	{
		//Creating heterogeneous arrayList of String type
		  ArrayList<String> a1=new ArrayList<String>(); 
		
		//Inserting elements into the list
		  a1.add("X");
		  a1.add("Y");
		  a1.add("Z");
		  a1.add("D");
		  a1.add("B");
		  a1.add("F");
		  a1.add("E");
		  a1.add("A");
		  a1.add("G");
		  a1.add("H");
		  
		  System.out.println("Before sorting :"+a1);
		  
		//Sorting the elements.
		Collections.sort(a1);
		System.out.println("After sorting :"+a1);
		
		 
		 }

}
