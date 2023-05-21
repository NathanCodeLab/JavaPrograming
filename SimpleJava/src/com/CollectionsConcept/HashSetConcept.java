package com.CollectionsConcept;
import java.util.*;

public class HashSetConcept {

	public static void main(String[] args) {
		
		//It do not accept ordering
		//It is not a index based one
		//Random access is not possible in set
		//It do not accept duplicate values
		//Hashset accept null values
		//It is synchronized 
		//It is not a thread-safe
		
		HashSet<String> set=new HashSet<String>();
		
		// To add values to the HashSet
				set.add("Cars"); 
				set.add("BMW"); 
				set.add("BENZ"); 
				set.add("VOLKS");
				set.add("VOLVO");
				set.add("Audi"); 
				set.add("Audi"); //duplicate value is deleted
				
				System.out.println(set);
				//Audi is not repeated again	

				// To addAll to another collection set value
				HashSet<String> anotherSet=new HashSet<String>();
				anotherSet.addAll(set);
				System.out.println(anotherSet);


				// To Check the value contains in the set
				System.out.println(set.contains("BENZ"));

				// To check set is empty
				System.out.println(set.isEmpty());

				// To check two set are equals
				System.out.println(set.equals(anotherSet));

				// To check the size of the set
				System.out.println(set.size());

				// To add the values in the particular set in index
				// Since set accepts null values
				set.add(null);

				// To Convert all values to String
				System.out.println(set.toString());

				System.out.println();
				// Iteration Methods

				// using for each loop
				for (String string : set) {
					System.out.println(string);
				}
				System.out.println();
				
				// Using iterator
				Iterator<String> iterator = set.iterator();
				while(iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				
				// To remove the particular index value
				set.remove("BENZ");
				System.out.println(set); // added BENZ removed now

				// To removeAll the value in set
				anotherSet.removeAll(anotherSet);
				System.out.println(anotherSet);

				// To clear the set values
				set.clear();
				System.out.println(set);
		
		

	}

}
