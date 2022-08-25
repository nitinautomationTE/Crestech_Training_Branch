package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAns14 
{
	public static void main(String[] args)
	{
		   // Create Array List
        ArrayList<String> L1= new ArrayList<String>();
      
        // Adding items in ArrayList 1
        L1.add("Nitin");
        L1.add("Mritunjay");
        L1.add("Chirag");
        L1.add("Almas");
        L1.add("Akash");
        L1.add("Presenjit");
        L1.add("Shivam");
        
        System.out.println(L1);
       //Swapping the elements of 3rd and 4th indices
       Collections.swap(L1,2,3);
       
       System.out.println("After Swap:"+L1);
	}

}
