package hashsetdemo;

import java.util.HashSet;

public class HashSetDemo2 
{
	public static void main(String[] args)
	{
		//Creating hashset
		HashSet<Integer> evenno=new HashSet<Integer>();
		
		//Adding element into the hashset
		evenno.add(2);
		evenno.add(4);
		evenno.add(6);
		evenno.add(8);
		evenno.add(10);
		
		System.out.println("Hashset:"+evenno);
		
		//Adding all the elements of hashset into other hashset
		HashSet<Integer> no=new HashSet<Integer>();
		no.addAll(evenno);
		System.out.println("HashSet2:"+no);//[2, 4, 6, 8, 10]
		no.add(10);
		System.out.println("HashSet2 after add one ele:"+no);//[2, 4, 6, 8, 10] bcz duplicates are not allowed in hashset
		no.add(12);
		System.out.println("HashSet2 after add one ele:"+no);
		
		
		
	}

}
