package com.CollectionsConcept;
import java.util.*;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//It is key and value pair format
		// It will not follow ordering
		// It accepts Random access
		// It accepts null values
		// Key s/b unique
		// It will not accepts duplicate values
		// It is Synchronized
		// It is not thread safe
		
		HashMap<Integer, String > map=new HashMap<Integer, String>();
		
		// To Add the values to map by key and value 
		map.put(1, "BMW");
		map.put(2, "Audi");
		map.put(3, "Benz");
		map.put(8, null);
		map.put(4, "Volvo");
		map.put(5, "Benz");
		map.put(6, "Skoda");
		map.put(7, "Audi");
		map.put(8, null);
		
		System.out.println(map);
		
		//To get the values
		String string = map.get(2);
		System.out.println(string);
		
		//To check values contains in key
		boolean containsKey = map.containsKey(3);
		System.out.println(containsKey);
		
		//To check values conatains in value
		boolean containsValue = map.containsValue("Benz");
		System.out.println(containsValue);
		
		//To check map is empty
		boolean empty = map.isEmpty();
		System.out.println(empty);
		
		

	}

}
