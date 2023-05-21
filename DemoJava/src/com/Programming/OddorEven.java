package com.Programming;
import java.util.*;
public class OddorEven {

	public static void main(String[] args) {

		// number = 1234567890......
		
		//
		//6-2 4-2 2-2 0
		//7-2 5-2 3-2 1
		//13-2 11-2 9-2 7-2 5-2 3-2 1
		
		int num=123;
		
		
		if (num%2 == 0) {
			System.out.println("It is even number");
		}else {
			System.out.println("It is odd number");
		}
		
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		list.removeIf(number -> number%2==1);
		
		System.out.println(list);
		
		
	}

}
