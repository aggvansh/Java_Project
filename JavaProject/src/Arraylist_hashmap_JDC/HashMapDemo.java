package Arraylist_hashmap_JDC;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// HashMap Declaration
		
	//	HashMap hm=new HashMap();
		
		HashMap <Integer, String> hm=new HashMap <Integer, String>();
		
		// Adding pairs to hashmap
		
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "David");
		hm.put(104, "Smith");
		hm.put(105, "Kim");
		
		System.out.println(hm);
		
		//Remove the pair from hashmap
		
		hm.remove(103);
		System.out.println("After Removing a pair" +hm);
		
		// How to read values from hashmap using Hashmap
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
