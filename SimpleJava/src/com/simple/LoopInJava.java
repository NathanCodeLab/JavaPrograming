package com.simple;

public class LoopInJava {

	public static void main(String[] args) {
		
		
		// Two loops are there FOR and WHILE loop
		
		//for loop -> for(initialization ; condition ; increment/decrement){ } syntax for for loop
		
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Print the statement 10 times");
		}
		
		
		//while loop -> initialization  while( condition ){ increment/decrement }
		//must use the increment for decrement otherwise the loop will not terminate until memory full
		// infinity loop will happen
		
		int a=0;
		
		while(a<5) {
			System.out.println("Print the statement until loop termitnate");
			a++;
		}
		
		
		
		

	}

}
