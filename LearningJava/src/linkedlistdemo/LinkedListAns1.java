package linkedlistdemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAns1 
{
	public static void main(String[] args)
	{
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("Green");
		l1.add("Red");
		l1.add("White");
		l1.add("Yellow");
		l1.add("Pink");
		
		System.out.println("List are:"+l1);
		//Ans1:Appended one element into LinkedList
		l1.addLast("Golden");
		System.out.println("Now List are:"+l1);
		
		//Ans2:to iterate through all elements in a linked list.
		Iterator it=l1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Ans5:to insert the specified element at the specified position in the linked list.
		l1.add(3,"Black");
		System.out.println("After insert element:"+l1);
		
		//Ans6:to insert elements into the linked list at the first and last position
		l1.addFirst("Brown");
		System.out.println("\n After add ele at first"+l1);
		l1.addLast("Violet");
		System.out.println("\n After add ele at last"+l1);
		
		//Ans7:to insert the specified element at the front of a linked list.
		l1.add(0, "test");
		System.out.println("\n"+l1);
		
		//Ans8:to insert the specified element at the end of a linked list.
		l1.add("test2");
		System.out.println("\n"+l1);
		
		//Ans9: to insert some elements at the specified position into a linked list.
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("lightpink");
		l2.add("lightgreen");
	    l1.addAll(2,l2);
	    System.out.println("\n"+l1);
	    
	    /*Ans10:Java program to get the first and last occurrence 
	    of the specified elements in a linked list.*/
	    Object o1=l1.getFirst();
	    System.out.println("\nFirst occurence: "+o1);
	    System.out.println("\nSecond occurence: "+l1.getLast());
	    
	    //Ans11:Java program to display the elements and their positions in a linked list.
	    
	    for(int i=0;i<l1.size();i++)
	    {
	    	System.out.println("At "+i+ " Position: "+l1.get(i));
	    }
	    
	    //Ans12:to remove a specified element from a linked list.
	    l1.remove("Brown");  //or l1.remove(1);
	    System.out.println("\n"+l1);
	    
	    //Ans13:to remove first and last element from a linked list.
	    l1.removeFirst();
	    System.out.println("\n"+l1);
	    l1.removeLast();
	    System.out.println("\n"+l1);
	    
	    //Ans14:to remove all the elements from a linked list.
	    l1.removeAll(l1);
	    System.out.println("\n"+l1);
	   
	    
	    
		
	}

}
