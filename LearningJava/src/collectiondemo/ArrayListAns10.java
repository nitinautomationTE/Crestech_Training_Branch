package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAns10 
{
	public static void main(String[] args)
	{
			//Creating heterogeneous arrayList of String type
			  ArrayList<String> a1=new ArrayList<String>(); 
			
			//Inserting elements into the list
			  a1.add("A");
			  a1.add("B");
			  a1.add("C");
			  a1.add("D");
			  a1.add("E");
			  a1.add("F");
			  a1.add("G");
			  a1.add("H");
			  a1.add("I");
			  a1.add("J");
			  
			  System.out.println("Before shuffle objects are:"+a1);
			//After shuffle
			  Collections.shuffle(a1);
			  System.out.println("After shuffle objects are:"+a1);
			  
	}

}
