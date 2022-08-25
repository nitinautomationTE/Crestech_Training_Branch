package assignment8april;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo1 
{
	public static void main(String[] args)
	{
		/*Declare ArrayList*/
		ArrayList a1=new ArrayList();
	   
		// Add new elements to the arrayList. add method having two forms in list.
		a1.add(100);
		a1.add("Welcome");
		a1.add(15.4);
		a1.add('A');
		a1.add(true);
		
		System.out.println(a1);
		
		//printing size of arraylist.size() method return int type of value.
		System.out.println("No of elements in arraylist :"+a1.size());
		
		//remove. I don't want welcome in this list.
		a1.remove(1);
		System.out.println("After removing element from arraylist:"+a1);
		
		//a1.remove(A);
		
		// insert a new element{add(index,value)}
         a1.add(1,"welcome Nitin");	
         System.out.println("After adding value in arraylist:"+a1);
         
        //retrieval of specific element of particular index.
        System.out.println( a1.get(2));
        System.out.println( a1.get(1));
        
        //change element/replace
        a1.set(2,"welocome v sharma");
        System.out.println("After replace value into arraylist:"+a1);
        
        //search-contains(): Returns true/fals
        System.out.println(a1.contains("MS"));
        System.out.println(a1.contains("welocome v sharma"));
        
        //i want to check list is empty or not.so isEmpty method return boolean result. if list is empty it returns true.
        // it takes nothing.
        System.out.println(a1.isEmpty());
        
        /* Retrieval data through loops and iterator */
        
        //for loop
        System.out.println("Reading elements using for loop:");
        for(int i=0; i<a1.size(); i++)
        {
        	System.out.println(a1.get(i));
        }
        
        //for each loop
        /*System.out.println("Reading elements using for each loop....");
        for(Object e:a1)
        {
        	System.out.println((e));
        }*/
        
        //iterator
       /* System.out.println("Reading elements using iterator ....");
        Iterator n1=a1.iterator();
        
        while(n1.hasNext())
        {
        	System.out.println(n1.next());
        }*/
		
		
		
		
	
	}

}
