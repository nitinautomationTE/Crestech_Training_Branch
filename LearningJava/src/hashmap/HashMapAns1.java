package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapAns1
{
	public static void main(String[] args)
	{
		//Ans1:a Java program to associate the specified value with the specified key in a HashMap.
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		//Add objects/elements into hashset.
		hm1.put(101,"Nitin");
		hm1.put(102,"Mohit");
		hm1.put(103,"Rahul");
		hm1.put(104,"Ram");
		hm1.put(105,"Abhi");
		System.out.println(hm1);
		
		//Ans2:a Java program to count the number of key-value (size) mappings in a map.
		System.out.println(hm1.size());
		
		//Ans3:a Java program to copy all of the mappings from the specified map to another map.
		HashMap<Integer,String> hm2=new HashMap<Integer,String>();
		hm2.putAll(hm1);
		System.out.println(hm2);
		HashMap<Integer,String> hm3=new HashMap<Integer,String>(hm1);
		System.out.println(hm3);
		
		//Ans4: a Java program to remove all of the mappings from a map.
		System.out.println("\nBefore clear:"+hm2);
		hm2.clear();
		System.out.println("\nAfter clear:"+hm2);
		System.out.println("size:"+hm2.size());
		
		/*Method 2: remove through the iterator
           In this approach, you will iterate over the Map using iterator and then call remove on the iterator.
           In this case, we are iterating over keys obtained from the calling keySet() method.
            hasNext() is used to check whether there is a next element present inside the collection or not.*/

		System.out.println("\nBefore clear:"+hm3);
		 Set keyset =hm3.keySet();
		  // iterating over the keys and removing
	      // hasNext() method is used to check whether next
	      // element present inside the collection or not
	     Iterator itr = keyset.iterator();
	        while (itr.hasNext()) 
	        {
	            itr.next();
	            itr.remove();
	        }
	      System.out.println("--------After removing-------");
	      System.out.println(hm3);
	      System.out.println(hm3.size());
	      
	     /* Method 3: Using removeIf() method

	      Syntax:

	      public boolean removeIf(Predicate filter)
	      Parameter: This method takes a parameter filter which represents a predicate which returns true for elements to be removed.

	      Returns: This method returns True if the predicate returns true, and we are able to remove elements.

	      Exception: This method throws NullPointerException if the specified filter is null.

	      In this method, you need to specify the condition on which the element will be removed but for our case, we need to remove all elements.
	      Hence, we need to iterate on every key in entryset. We will check the set of keys obtained using the keySet() method.
	      We are removing every key of entrySet which is present in keySet. Every entry object, 1 entry=1key+1 value.
	      keySet() gives all keys present inside the Map.*/
	      HashMap<String, Integer> hm4 = new HashMap<>();
	      
	        // adding values in hashMap 1
	        hm4.put("DSA", 100);
	        hm4.put("Problem Solving", 100);
	        hm4.put("Development", 99);
	        hm4.put("Interviews", 99);
	        hm4.put("Competitive Programming", 97);
	        hm4.put("FANG", 99);
	  
	        System.out.println("-------before removing------");
	        System.out.println(hm4);
	        System.out.println(hm4.size());
	  
	        // getting all the keys of map
	  
	        Set<String> keySet = hm4.keySet();
	  
	        // checking the entry set 
	        // key in keySet and remove
	        // it one by one
	        hm4.entrySet().removeIf(
	            entry -> keySet.contains(entry.getKey()));
	  
	        System.out.println("--------After removing-------");
	        System.out.println(hm4);
	        System.out.println(hm4.size());
	       
	     //Ans5:a Java program to check whether a map contains key-value mappings (empty) or not.
	       boolean b1= hm1.isEmpty();
	       if(b1)
	             System.out.println("\nHashMap is empty");
	       else
	    	     System.out.println("HashMap is not empty");
	       
	    //Ans6:a Java program to get a shallow copy of a HashMap instance.
	       hm3=(HashMap)hm1.clone();
	       System.out.println("\nAfter clone:"+hm3);
	       
	    //Ans7:Java program to test if a map contains a mapping for the specified key.
	       boolean b2=hm1.containsKey(105);
	       if(b2)
	    	    System.out.println("Map contains this key");
	       else
	    	   System.out.println("Map not contains this key");
	    	    
	    //Ans8:Java program to test if a map contains a mapping for the specified value. 
	       boolean b3= hm1.containsValue("Nitin");
	       if(b3)
	    	   System.out.println("Map contains this value");
	       else
	    	   System.out.println("Map not contains this value");
	      
	    //Ans 9: Write a Java program to create a set view of the mappings contained in a map.   
	      Set s1= hm1.entrySet();
	      System.out.println(s1);
	      
	    //Ans10: Write a Java program to get the value of a specified key in a map. 
	     Object s2= hm1.get(102);
	     System.out.println("\n"+s2);
	   
	     //Ans11:Write a Java program to get a set view of the keys contained in this map. 
	  // get keyset value from map
	     Set keyset1 = hm1.keySet();
	        
	    // check key set values
	     System.out.println("\nKey set values are: " + keyset1); 
	   
	     //Ans12:Write a Java program to get a collection view of the values contained in this map.
	  
	     System.out.println("\nCollection view is: "+ hm1.values());
	}
	

}
