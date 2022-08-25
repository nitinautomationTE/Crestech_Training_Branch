package treesetdemo;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) 
	{   
				//Creating empty treeset.
				TreeSet<String> t1=new TreeSet<String>();
				
				//Ans1:a Java program to create a new tree set, add some colors (string) and print out the tree set.
			    //Adding elements into empty treeset.
				t1.add("Red");
				t1.add("White");
				t1.add("Yellow");
				t1.add("black");
				t1.add("Blue");
				
				
				System.out.println(t1);//[Blue, Red, White, Yellow, black]
				
				//Ans2:a Java program to iterate through all elements in a tree set.
				System.out.println("Reading TreeSet values through iterator:");
				Iterator it= t1.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				
				//Ans3: a Java program to add all the elements of a specified tree set to another tree set. 
				TreeSet<String> t2=new TreeSet<String>();
				t2.addAll(t1);
				System.out.println(t1);
				
				//Ans4:a Java program to create a reverse order view of the elements contained in a given tree set.
				Iterator it1 = t1.descendingIterator();
			     System.out.println("Elements in Reverse Order:");
			     while (it1.hasNext()) 
			     {
			        System.out.println(it1.next());
			     }
				
				//Ans5: a Java program to get the first and last elements in a tree set.
			     //Get the first
			     Object o1=t1.first();
			     System.out.println(o1);
			     //Get the last
			     Object o2=t1.last();
			     System.out.println(o2);
			     
			   //Ans6: a Java program to clone a tree set list to another tree set.
			    TreeSet<String> t3 = (TreeSet<String>) t1.clone();
			     System.out.println("\nAfter clone t1 into t3 :"+t3);
			    
			   //Ans7:a Java program to get the number of elements in a tree set. 
			   //  System.out.println("\nNo of elements in t3:"+t3.size());
			     
			   //Ans8:a Java program to compare two tree sets.
			    boolean b1= t1.equals(t3);
			    System.out.println(b1);
			    //comparison of elements
			    System.out.println("\nFirst set tree  :"+t1);
			    System.out.println("\nSecond set tree :"+t3);
			    
			    TreeSet<String> result_set = new TreeSet<String>();
		        for (String element :t1)
		        {
		            System.out.println(t3.contains(element) ? "Yes equal" : "Not equal");
		         }     
		        
		        //Java program to find the numbers less than 7 in a tree set.
		       TreeSet<String> t4=new TreeSet<String>();
		        t4.add("Red");
				t4.add("White");
				t4.add("Yellow");
				t4.add("black");
				t4.add("Blue");
		        t4.add("lightRed");
				t4.add("lightWhite");
				t4.add("lightYellow");
				t4.add("lightblack");
				t4.add("lightBlue");
				
				TreeSet<String> treeheadset=new TreeSet<String>();
				 treeheadset = (TreeSet)t4.headSet("lightWhite");  
				 System.out.println(treeheadset);
			   //Ans10:Java program to get the element in a tree set which is greater than or equal to the given element.  
				TreeSet <Integer> t5 = new TreeSet<Integer>();
				   t5.add(50);
				   t5.add(62);
				   t5.add(106);
				   t5.add(34);
				   t5.add(19);
				   t5.add(45);
				   t5.add(98);
				   t5.add(84);
				   t5.add(5);
				   System.out.println("Greater than or equal to 98 : "+t5.ceiling(98));
				   
		       //Ans11: a Java program to get the element in a tree set which is less than or equal to the given element.
				   System.out.println("Less than or equal to 19 : "+t5.floor(19));
				//Ans12:a Java program to get the element in a tree set which is strictly greater than or equal to the given element
				   System.out.println("Strictly greater than 76 : "+t5.higher(98));
				   
		       //Ans13:a Java program to get an element in a tree set which is strictly less than the given element.
				   System.out.println("Strictly less than 69 : "+t5.lower(19));
				//Ans14: a Java program to retrieve and remove the first element of a tree set.
				   System.out.println("Original tree set: "+t5);
				   System.out.println("Removes the first(lowest) element: "+t5.pollFirst());
				   System.out.println("Tree set after removing first element: "+t5);
				//Ans15:a Java program to retrieve and remove the last element of a tree set.  
				   System.out.println("Original tree set: "+t5);
				   System.out.println("Removes the last element: "+t5.pollLast());
				   System.out.println("Tree set after removing last element: "+t5);
				//Ans16:a Java program to remove a given element from a tree set.
				   System.out.println("Set having elements:"+t5);
				   t5.remove(45);
				   System.out.println("After remove ele 45 :"+t5);
				   System.out.println(t5.contains(45));
			}

	

	

}
