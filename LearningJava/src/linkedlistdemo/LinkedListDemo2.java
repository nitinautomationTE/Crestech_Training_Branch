package linkedlistdemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 
{
	public static void main(String[] args)
	{   
		//Creating a Linked List
		LinkedList<String> l1=new LinkedList<String>();
		
		l1.add("X");
		l1.add("Y");
		l1.add("Z");
		l1.add("A");
		l1.add("B");
		l1.add("C");
		
	    System.out.println("List First:"+l1);
	    
	    //Creating another Linked List
	    LinkedList l2=new LinkedList();
	    
	    l2.addAll(l1);
	    System.out.println("List second:"+l2);
	    
	    l2.add("Nitin");
	    System.out.println(l2);
	    
	    //Remove all items of l1 from l2
	    l2.removeAll(l1);
	    System.out.println(l2);
	    //Reomove all items of l2 
	    l2.removeAll(l2);
	    System.out.println(l2);
	    
	    //sorting
	    Collections.sort(l1);
	    System.out.println("After sorting:"+l1);
	    
	    //sorting in reverse order
	    Collections.sort(l1,Collections.reverseOrder());
	    System.out.println(l1);
	    
	    //shuffling
	    Collections.shuffle(l1);
	    
	    
	    
		
	}

}
