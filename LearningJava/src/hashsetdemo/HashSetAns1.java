package hashsetdemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetAns1 
{
	public static void main(String[] args)
	{   
		//Creating an empty hashset hs1
		HashSet<String> hs1=new HashSet<String>();
		
		//Ans1:Write a Java program to append the specified element to the end of a hash set.
		hs1.add("Nitin");
		hs1.add("Shivam");
		hs1.add("Mritunjay");
		hs1.add("Akash");
		hs1.add("Presenjit");
		hs1.add("Almas");
		
		System.out.println("Elements are: "+hs1);
		System.out.println();
		
		//Ans2: Java program to iterate through all elements in a hash list.
		Iterator it=hs1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		//Ans3:a Java program to get the number of elements in a hash set.
	    System.out.println("Size of hashset"+hs1.size());
	    
	    //Ans4: a Java program to empty an hash set.
	    hs1.removeAll(hs1);
	    
	    //Ans5:a Java program to test a hash set is empty or not.
	   if( hs1.isEmpty())
		   System.out.println("List is empty");
	   else
		   System.out.println("List is not empty");
	   
	   //Ans6:a Java program to clone a hash set to another hash set.
	   HashSet<String> hs5=new HashSet<String>();
	    hs5.add("Nitin");
		hs5.add("Shivam");
		hs5.add("Mritunjay");
		hs5.add("Akash");
		hs5.add("Presenjit");
		hs5.add("Almas");
		HashSet<String> hs6=new HashSet<String>();
	           hs6=(HashSet)hs5.clone();
			   System.out.println("After clone:"+hs6);
	    	 
	   /*
		//Ans10:a Java program to compare two hash set. 
		  if( hs1.equals(hs2))
			  System.out.println("HashSet are equals");
		  else
			  System.out.println("HashSet are not equals");
		  
		//Ans11:a Java program to compare two sets and retain elements which are same on both sets.
		  HashSet<String> hs3=new HashSet<String>();
		  hs3.add("Red");
		  hs3.add("Black");
		  hs3.add("Green");
		  
		  HashSet<String> hs4=new HashSet<String>();
		  hs4.add("Blue");
		  hs4.add("Black");
		  hs4.add("White");
		  
		  hs4.retainAll(hs3);
		  System.out.println(hs4);
		  
		//Ans12:a Java program to remove all of the elements from a hash set.
		  hs3.removeAll(hs3);
		  System.out.println(hs3);
		  */
		
		
	}

}
