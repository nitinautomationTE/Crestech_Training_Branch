package TreeMap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapAns1
{
	public static void main(String[] args)
	{  
	//Ans1:Write a Java program to associate the specified value with the specified key in a Tree Map.
		TreeMap tm1=new TreeMap();
		 // Put elements to the map 
		  tm1.put(1, "Red");
		  tm1.put(2, "Green");
		  tm1.put(3, "Black");
		  tm1.put(4, "White");
		  tm1.put(5, "Blue");
		    
		  System.out.println(tm1);
	//Ans2:a Java program to copy a Tree Map content to another Tree Map content.
          TreeMap tm2=new TreeMap();
          tm2.putAll(tm1);
          System.out.println(tm2);
    //Ans3:Write a Java program to search a key in a Tree Map.
          if(tm1.containsKey(1))
              System.out.println("The Tree Map contains key 1");
          else 
              System.out.println("The Tree Map does not contain key 1");
     //Ans4: Write a Java program to search a value in a Tree Map.
          if(tm1.containsValue("Green"))
              System.out.println("The TreeMap contains value Green");
          else 
              System.out.println("The TreeMap does not contain value Green");
     //Ans5:Write a Java program to get all keys from the given a Tree Map
          System.out.println(tm1.keySet());
     /*Ans6: Write a Java program to delete all elements from a given Tree Map.
          System.out.println("Orginal TreeMap content: "+tm1);
          tm1.clear();
          System.out.println("The New map: "+tm1);*/
     //Ans7: Write a Java program to sort keys in Tree Map by using comparator.
          class Sort implements Comparator<String>
          {
        	     @Override
        	    public int compare(String str1, String str2)
        	     {
        	        return str1.compareTo(str2);
                 }
         }
     //Ans8:Write a Java program to get a key-value mapping associated with the greatest 
    //key and the least key in a map.
          System.out.println("\nOrginal TreeMap content: " + tm1);
          System.out.println("\nGreatest key: " + tm1.firstEntry());
          System.out.println("\nLeast key: " + tm1.lastEntry());
    //Ans9:Write a Java program of get the first (lowest) key and the last (highest) 
    //key currently in a map.
          System.out.println("\nOrginal TreeMap content: " + tm1);
          System.out.println("\nGreatest key: " + tm1.firstKey());
          System.out.println("\nLeast key: " + tm1.lastKey());
          
  //Ans10:Write a Java program to get a reverse order view of the keys contained in a given map.
          System.out.println("\nOrginal TreeMap content: " + tm1);
          System.out.println("\nReverse order view of the keys: " + tm1.descendingKeySet());
   
  //Ans11:Write a Java program to get NavigableSet view of the keys contained in a map.
          System.out.println("\nOrginal TreeMap content: " + tm1);
          System.out.println("\nOrginal TreeMap content: " + tm1.navigableKeySet());

  //Ans12: Write a Java program to remove and get a key-value mapping associated with the least key in a map.
       // polling first entry
          System.out.println("\nValue before poll: " + tm1);
          System.out.println("\nValue returned: " + tm1.pollFirstEntry());
          System.out.println("\nValue after poll: " + tm1);
  
  //Ans13: Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
          System.out.println("\nValue before poll: " + tm1);
          System.out.println("\nValue returned: " + tm1.pollLastEntry());
          System.out.println("\nValue after poll: " + tm1);
  
   //Ans14:Write a Java program to get the portion of a map whose keys range from a given key (inclusive), 
   //to another key (exclusive).
          
          
          
   //Ans15:Write a Java program to get the portion of a map whose keys range from a given key to another key.
          SortedMap < Integer, String > sub_tree_map = new TreeMap < Integer, String > ();
          System.out.println("\nOrginal TreeMap content: " + tm1);
          sub_tree_map = tm1.subMap(2, true, 4, true);
          System.out.println("\nSub map key-values: " + sub_tree_map);
	
	
  //Ans16: Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
          System.out.println("\nOrginal TreeMap content: " + tm1);
          System.out.println("\nKeys are greater than 2: " + tm1.tailMap(2, false));	

  //Ans17: Write a Java program to get a portion of a map whose keys are greater than to a given key.
          System.out.println("\nOrginal TreeMap content: " + tm1);
          System.out.println("\nKeys are greater than or equal to 2: " + tm1.tailMap(2));
          
  //Ans18: Write a Java program to get a key-value mapping associated with the least key greater than or equal 
          //to the given key. Return null if there is no such key.
          System.out.println("\nOrginal TreeMap content: " + tm1);
          System.out.println("Keys greater than or equal to 20: " + tm1.ceilingEntry(2));
          System.out.println("Keys greater than or equal to 40: " + tm1.ceilingEntry(4));
          System.out.println("Keys greater than or equal to 50: " + tm1.ceilingEntry(5));
   
 //Ans19:Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
          System.out.println("\nOrginal TreeMap content: " + tm1);
          System.out.println("Keys greater than or equal to 20: " + tm1.ceilingKey(20));
          System.out.println("Keys greater than or equal to 30: " + tm1.ceilingKey(30));
          System.out.println("Keys greater than or equal to 50: " + tm1.ceilingKey(50));

}
	
	
}
