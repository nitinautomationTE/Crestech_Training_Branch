package collectiondemo;

import java.util.ArrayList;

public class ArrayListAns19 
{
	
	    public static void main(String[] args) 
	    {
	        // create an ArrayList
	        ArrayList<String> l1 = new ArrayList<>();

	        // Add elements to ArrayList
	        l1.add("Noida");
	        l1.add("Gurugram");
	        l1.add("Banglore");
	        System.out.println("Elements in ArrayList are: " + l1);
	        System.out.println(l1.size());

	        // trim capacity to 3
	        l1.trimToSize();
	        System.out.println("Size of ArrayList: " + l1.size());
	        
	        
	    }
	

}
