package hashsetdemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 
{
	public static void main(String[] args)
	{   
		//Creating hashset 
		HashSet hs1=new HashSet();
		
		//Adding elements into hashset
		hs1.add(100);
		hs1.add("Welcome");
		hs1.add(16.4);
		hs1.add('A');
		hs1.add(true);
		hs1.add(null);
		
		System.out.println(hs1);
		
		//remove element
		hs1.remove(16.4);
		System.out.println(hs1);
		
		//After remove we will verify 16.4 is there or not
		System.out.println(hs1.contains(16.4));
		
		System.out.println(hs1.containsAll(hs1));
		
		//isEmpty or not
		System.out.println(hs1.isEmpty());
		
		/*Reading objects/elements by using for loop
		for(int i=0;i<hs1.size();i++)
		{
			System.out.println(((Object) hs1).get(i));
		}*/
		
		//Reading objects/elements by using for each loop
		/*for(Object e:hs1)
		{
			System.out.println(e);
		}*/
		//Reading by using iterator
		 Iterator it1=hs1.iterator();
		 while(it1.hasNext())
		 {
		      System.out.println(it1.next());
		 }
		 
		
		
		
	}

}
