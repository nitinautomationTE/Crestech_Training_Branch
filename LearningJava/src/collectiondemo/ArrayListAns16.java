package collectiondemo;

import java.util.ArrayList;

public class ArrayListAns16
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
		  
		  //Creating another arrayList of String type
		  ArrayList<String> a2=new ArrayList<String>();
		  
		  // clone an array list to another array list.
		  a2.addAll(a1);
		  System.out.println("Elements in second arrayList"+a2);
		 
	}

}
