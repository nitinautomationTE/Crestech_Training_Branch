package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAns12 {

	public static void main(String[] args) 
	{
		//Creating an arrayList of String  type.
		List<String> l1=new ArrayList<String>(15);
		
		//Adding elements into arrayList.
		l1.add("Cat");
		l1.add("Dog");
		l1.add("Elephant");
		l1.add("Horse");
		l1.add("Lion");
		l1.add("Tiger");
		l1.add("Leopord");
		
		
		System.out.println("Elements in arrayList are:"+l1);
		
		//Extract a portion of array list.
		//Let extract from 2nd postion to 6th postion.
		List sL=l1.subList(1, 6);
		
		System.out.println("Portion of ArrayList is:"+sL);
		
		
		
	}

}
