package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add("x");
		a1.add("y");
		a1.add("z");
		a1.add("A");
		a1.add("B");
		a1.add("C");
		
		System.out.println(a1);
		
		//copy data of one arraylist into another.
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		System.out.println(a2);
		
		//removeAll
		a2.removeAll(a1);
		System.out.println(a2);
		
		// sort all the items of arrayList a1
		System.out.println("Elements in the array list before sorting:"+a1);
		Collections.sort(a1);
		System.out.println("Elements in the array list after sorting:"+a1);
		
		//Shuffling -collections.shuffle();
		Collections.shuffle(a1);
		System.out.println("Elements in the array list after shuffle:"+a1);
		
				
	}
}
