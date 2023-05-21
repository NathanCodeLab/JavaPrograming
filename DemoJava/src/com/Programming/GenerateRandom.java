package com.Programming;
import java.util.*;
public class GenerateRandom {

	public static void main(String[] args) {

		Random random=new Random();
		long nextLong = random.nextLong();
		int ran = random.nextInt(10);
		System.out.println(ran);
		
		boolean nextBoolean = random.nextBoolean();
		System.out.println(nextBoolean);
		//0 to 10
		double nextDouble = random.nextDouble();
		System.out.println(nextDouble);
		
		System.out.println(nextLong);
		
		
		
	}

}
