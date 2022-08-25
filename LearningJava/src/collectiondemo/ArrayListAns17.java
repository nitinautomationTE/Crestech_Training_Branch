package collectiondemo;

import java.util.ArrayList;

public class ArrayListAns17 
{
	public static void main(String[] args)
	{
		//Creating heterogeneous arrayList of String type
		  ArrayList<String> a1=new ArrayList<String>(); 
		
		//Inserting elements into the list
		  a1.add("Hello");
		  a1.add("Nitin");
		  a1.add("Welcome");
		  a1.add("I");
		  a1.add("J");
		  
		  System.out.println("Elements in arrayList"+a1);
		 // empty an array list.
		  a1.removeAll(a1);
		  System.out.println("After remove all the elements from arrayList: "+a1);

}
}
