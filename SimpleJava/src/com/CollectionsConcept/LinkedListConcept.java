package com.CollectionsConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		/*
		 * It is a class implements list interface
		 * It accepts similar and dis-similar datatypes
		 * It follows insertion order
		 * Insertion deletion easy
		 * Random access is not - possible
		 * It is index based one
		 * It accepts duplicate values
		 * It accepts null values
		 * It is not a Synchronized 
		 * It is not a Thread safe
		 */
			
		LinkedList<String> list = new LinkedList<String>();

		// To add values to the LinkedList
		list.add("Cars"); // 0 // follow insertion and index
		list.add("BMW"); // 1
		list.add("BENZ"); // 2
		list.add("VOLKS");// 3
		list.add("VOLVO"); // 4
		list.add("Audi"); // 5
		list.add("Audi"); // 6 //duplicate value
		System.out.println(list);

		// To add values by index
		list.add(5, "BENZ");
		System.out.println(list);
		
		// To add values in first
		list.addFirst("Kia");
		System.out.println(list);
		
		// To add values in last
		list.addLast("Skoda");
		System.out.println(list);

		// To add another collection list value
		LinkedList<String> anotherList = new LinkedList<String>();
		anotherList.addAll(list);
		System.out.println(anotherList);

		// To get the particular value
		System.out.println(list.get(2));

		// To see the index of the value
		System.out.println(list.indexOf("BMW"));
		System.out.println(list.indexOf("DMW"));// Returns -1 = not available

		// To see the last index of the value or duplicate value
		System.out.println(list.lastIndexOf("Audi"));

		// To Check the value contains in the list
		System.out.println(list.contains("BENZ"));

		// To check list is empty
		System.out.println(list.isEmpty());

		// To check two list are equals
		System.out.println(list.equals(anotherList));

		// To check the size of the list
		System.out.println(list.size());

		// To add the values in the particular list in index
		// Since list accepts null values
		list.set(3, null);
		System.out.println(list);

		// To Convert all values to String
		System.out.println(list.toString());
		

		System.out.println();
		// Iteration Methods

		// using for each loop
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println();
		
		// Using iterator
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		// Using Normal for loop
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//To remove first value
		list.removeFirst();
		System.out.println(list);
		
		//To remove last value
		list.removeLast();
		System.out.println(list);

		// To remove the particular index value
		list.remove(5);
		System.out.println(list); // added BENZ removed now

		// To removeAll the value in list
		anotherList.removeAll(anotherList);
		System.out.println(anotherList);

		// To clear the list values
		list.clear();
		System.out.println(list);

	}

}
