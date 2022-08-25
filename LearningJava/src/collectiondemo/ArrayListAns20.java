package collectiondemo;

import java.util.ArrayList;

public class ArrayListAns20
{
	public static void main(String[] args)
	{
		
	     //Creating a integer type of arrayList
		 ArrayList<Integer> l1 = new ArrayList<Integer>(5);
         
		 //  Add elements into the arrayList.
	      l1.add(10);
	      l1.add(50);
	      l1.add(30);
	      
	      // to increase the size of an array list.
	      l1.ensureCapacity(15);

	      // Display elements by using for loop
	      for (Integer number : l1) 
	      {
	         System.out.println("Number = " + number);
	      }

}
}
