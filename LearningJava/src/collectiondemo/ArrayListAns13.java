package collectiondemo;

import java.util.ArrayList;

public class ArrayListAns13 {

	public static void main(String[] args) 
	{
		   // create first Array List
        ArrayList<String> L1= new ArrayList<String>();
       
  
        // Adding items in ArrayList 1
        L1.add("Red");
        L1.add("Green");
        L1.add("White");
        L1.add("Orange");
        
        ArrayList<String> L2= new ArrayList<String>();
  
        //Adding items in ArrayList 2
        L2.add("Red");
        L2.add("Green");
        L2.add("White");
        L2.add("Orange");
  
        // Display both ArrayList
        System.out.println(" First ArrayList = " + L2);
        System.out.println(" Second ArrayList = " + L1);
  
        // compare L1 with L2
        if (L1.equals(L2) == true)
            System.out.println(" Array List are equal");
        else
            System.out.println(" Array List are not equal");
       
  
        // Adding one more element in ArrayList 1
        L1.add("Nitin");
  
        // Display both ArrayList
        System.out.println(" First arrayList = " + L1);
        System.out.println(" Second arrayList = " + L2);
  
        // again compare ArrayList 1 with ArrayList 2
        if (L1.equals(L2) == true)
            System.out.println(" Array List are equal");
        else 
            System.out.println(" Array List are not equal");
    }


}


