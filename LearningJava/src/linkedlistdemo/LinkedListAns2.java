package linkedlistdemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListAns2 
{
	public static void main(String[] args)
	{
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("Green");
		l1.add("Pink");
		l1.add("Green");
		l1.add("Yellow");
		l1.add("White");
		
		System.out.println(l1);
	    //Ans15:Java program of swap two elements in a linked list.
		Collections.swap(l1, 2, 3);
		System.out.println(l1);
		//Ans16:Java program to shuffle the elements in a linked list.
		Collections.shuffle(l1);
		System.out.println(l1);
		
		//Ans17:Write a Java program to join two linked lists.
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("lightgreen");
		l2.add("lightblue");
		
		LinkedList<String> l3=new LinkedList<String>();
		l3.addAll(l1);
		l3.addAll(l2);
		System.out.println("New List: "+l3);
		
		//Ans18:LinkedListAns3
		
		//Ans19:Write a Java program to remove and return the first element of a linked list.
		System.out.println("\nRemoved element:"+l3.pop());
		System.out.println("\nAfter removed list are:"+l3);
		
		//Ans20:a Java program to retrieve but does not remove, the first element 
		//of a linked list.
		System.out.println(l3.getFirst());
		//but not right way.
		System.out.println(l3.peekFirst());
		
		//Ans21: a Java program to retrieve but does not remove, the last element 
		//of a linked list.
		System.out.println(l3.getLast());
		//but not right way.
		System.out.println(l3.peekLast());
		
		//Ans22:a Java program to check if a particular element exists in a linked list.
		boolean value=l3.contains("lightgreen");
	    if(value)
		{
			System.out.println("The color is present");
		}
	    
	    //Ans24: a Java program to compare two linked lists.
	   boolean b1=l1.equals(l3);
	   if(b1)
	   {
		   System.out.println("List are equals");
	   }
	   else
	   {
		   System.out.println("List are not equals");
	   }
		
	   //if we want compare each element of the list
	   for (String e : l1)
           l3.add(l2.contains(e) ? "Yes" : "No");
        System.out.println(l3);
        
        //Ans25: a Java program to test an linked list is empty or not. 
        System.out.println(l1.isEmpty());
        
        //Ans26:a Java program to replace an element in a linked list. 
       System.out.println(l1);//[Green, Yellow, Pink, Green, White] , Replace 3rd green
       
		l1.set(3, "blue");
		 System.out.println(l1);
		
		
	}

}
