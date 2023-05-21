package com.CollectionsConcept;

import java.util.TreeSet;

public class TreeSetConcept {

	public static void main(String[] args) {

		
		//It will arrange in alfabetic order
		// It accept ordering
		// It will not accept duplicate value
		// It will not accept null values
		// It is synchronized
		// It is not thread- safe
		
		
		TreeSet<String> set=new TreeSet<String>();
		
		// To add values to the TreeSet
		set.add("Cars"); 
		set.add("BMW"); 
		set.add("BENZ"); 
		set.add("VOLKS");
		set.add("VOLVO");
		set.add("Audi"); 
		set.add("Audi"); //duplicate value is deleted
		
		System.out.println(set);
		
	}

}
