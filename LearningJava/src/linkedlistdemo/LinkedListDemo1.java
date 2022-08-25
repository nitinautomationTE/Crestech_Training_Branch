package linkedlistdemo;

import java.util.LinkedList;

public class LinkedListDemo1 
{
	public static void main(String[] args)
	{
		//Declare Linked List
		LinkedList l1=new LinkedList();
		
		//Add elements into linked list
		l1.add(100);
		l1.add("welcome");
		l1.add(15.5);
		l1.add('A');
		l1.add(true);
		l1.add(null);
		
		System.out.println(l1);
		
		//find size of linked list
		int size=l1.size();// you can directly call it also into sop.
		System.out.println(size);
		
		//remove elements from the linked list
		l1.remove(3);
		System.out.println("After remove :"+l1);
		
		//add or insert element in the middle of linked list
		l1.add(3,"Java");
		System.out.println("After inserting elements:"+l1);
		
		//replace or update or change the value /element
		l1.set(3,"Collection");
		System.out.println("After update elements:"+l1);
		
		//retrieve value or object
		System.out.println(l1.get(3));
		
		//contain or not
		System.out.println(l1.contains("Java"));
		boolean b1=l1.contains("Collection");
		System.out.println(b1);
		
		//isEmpty or not
		System.out.println(l1.isEmpty());
		boolean b2=l1.isEmpty();
		System.out.println(b2);
		
		
		
	}

}
