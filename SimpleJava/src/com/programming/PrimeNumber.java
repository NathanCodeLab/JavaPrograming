package com.programming;

public class PrimeNumber {

	public static void main(String[] args) {

		// numrime Number

		// 1 3 5 7 11 13 17 19 33 ......

		int num = 7;
		int count = 0;
		if (num > 1)
			for (int i = 1; i <= num; i++)
				if (num % i == 0)
					count++;
		if (count == 2)
			System.out.println(num+" It is a prime Number");

		else
			System.out.println(num+" It is Not a prime Number");
	}

}
