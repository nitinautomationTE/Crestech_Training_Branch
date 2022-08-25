package hashsetdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemoAns3 
{
	public static void main(String[] args)
	{
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("Green");
		hs1.add("Blue");
		hs1.add("Black");
		hs1.add("Red");
		System.out.println("Elements are in hashset1:"+hs1);
		
		
		//Ans 7: Java program to convert a hash set to an array.
		//String arr[]=new String [10]; not right way to define size.Define size equal to hashset size. hs1.size()=4
		
		String arr[]=new String [hs1.size()];
		//copy array into hashset object by toArray() method 
		hs1.toArray(arr);
		                                                        //System.out.println(arr[8]);
		for(String s : arr)
		{
			System.out.println(s);
		}
		 
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		
		//Ans 8: Write a Java program to convert a hash set to a tree set. 
		//For this hashset should be contains homogenous elements
		TreeSet<String> t1=new TreeSet<String>(hs1);
		System.out.println(t1);
		t1.addAll(hs1);
		System.out.println("By addAll():"+t1);
		
		  /* Convert the HashSet to TreeSet
            Set<String> hashSetToTreeSet = new TreeSet<>();
            for (String i : setobj)
                hashSetToTreeSet
                .add(i);*/
  
		
	 //Ans9:Write a Java program to convert a hash set to a List/ArrayList. 
		ArrayList l1=new ArrayList();
		l1.addAll(hs1);
		System.out.println(l1);
		
	}

}
