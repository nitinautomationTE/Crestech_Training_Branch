package linkedlistdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo3 
{
	public static void main(String[] args)
	{
		//Ans:18. Write a Java program to clone an linked list to another linked list.
		LinkedList<String> l1=new LinkedList<String>();
		//adding elements into linked list l1
		l1.add("Green");
		l1.add("Red");
		l1.add("Blue");
		l1.add("Black");
		System.out.println("First list :"+l1);
		
		//Creating another empty linked list as l2
		LinkedList<String> l2=new LinkedList<String>();
		l2=(LinkedList) l1.clone();
		System.out.println("Second list after clone :"+l2);
		
		//Ans19: Write a Java program to convert a linked list to array list.
		ArrayList al1=new ArrayList(l1);
		System.out.println(al1);
		System.out.println("The ArrayList elements are: ");
		
		/*
		List aList = new ArrayList(l1);
		System.out.println("The ArrayList elements are: ");
		for (String i : aList)                                         //error
		{
		   System.out.println(i);
		}*/
		/*
		List aList = new ArrayList(l1);
		System.out.println("The ArrayList elements are: ");
		for (Object i : aList)                                         
		{
		   System.out.println(i);
		}*/
		/*
		List<String> aList = new ArrayList<String>(l1);
		System.out.println("The ArrayList elements are: ");
		for (Object i : aList)                                        
		{
		   System.out.println(i);
		}*/
		/*
		List<String> aList = new ArrayList<String>(l1);
		System.out.println("The ArrayList elements are: ");
		for (String i : aList)                                         
		{
		   System.out.println(i);
		}*/
	}
	
	

}
