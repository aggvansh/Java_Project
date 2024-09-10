package Arraylist_hashmap_JDC;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {

		// How to declare array list

		ArrayList list = new ArrayList(); // we can store any type of elements

		// ArrayList <String> list=new ArrayList <String>(); //strings
		// ArrayList <Integer> List=new ArrayList <Integer>();

		// Adding values to array list

		list.add("John");
		list.add("David");
		list.add("Scott");
		list.add("Smith");
		list.add(100);
		list.add('A');

		// size of array list
		System.out.println(list.size());
		System.out.println("Before removing elements" + list);

		// remove an element
		list.remove(2);
		System.out.println(list.size());
		System.out.println("After removing elements" + list);

		// Inserting a new value into an array list

		list.add(1, "Vansh");
		System.out.println("After inserting elements" + list);

		System.out.println(list.size());

		// read values from array list using for loop

		/*
		 * for(String s:list) { System.out.println(s); }
		 */

		for (Object s : list) // Object type variable can hold any type of values or data types
		{
			System.out.println(s);
		}

	}

}
