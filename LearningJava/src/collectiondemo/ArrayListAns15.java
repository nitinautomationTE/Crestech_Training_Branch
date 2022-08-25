package collectiondemo;

import java.util.ArrayList;

public class ArrayListAns15
{
	   public static void main(String args[])
	    {
	  
	        // Creating  the ArrayList1
	        ArrayList<String>  l1 = new ArrayList<String>();
	  
	        // Adding elements into the ArrayList
	        l1.add("Delhi");
	        l1.add("Noida");
	        l1.add("Gurugram");
	         System.out.println("ArrayList 1: " + l1);
	  
	        // Creating the ArrayList2
	        ArrayList<String> l2 = new ArrayList<String>();
	  
	        l2.add("Banglore");
	        l2.add("Pune");
	        System.out.println("ArrayList 2: "+ l2);
	  
	        // Join the ArrayLists
	        // using Collection.addAll() method
	        l1.addAll(l2);
	  
	        // Print the joined ArrayList
	        System.out.println("Joined ArrayLists: "+ l1);

}
}
