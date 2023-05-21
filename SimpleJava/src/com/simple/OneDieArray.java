package com.simple;

public class OneDieArray {

	public static void main(String[] args) {
		
		/*
		 *  Advantages of array
		 *  
		 *  it is index based one
		 *  it only supports similar datatype
		 *  for static array it is very usefull
		 *  there is no memory wastage in static array
		 *  it accepts dis-similar datatypes only through Object
		 *  
		 *  
		 *  Disadvantage of array
		 *  
		 *  it only supports similar datatype
		 *  Memory allocation will happen in the begining
		 *  we cant exit the memory allocation
		 *  it will hits the index out of bond exception
		 *  
		 */
		
		int[] intarr=new int[3];
		intarr[0]=1;
		intarr[1]=10;
		intarr[2]=100;
		
		String[] stringarr=new String[4];
		
		stringarr[0]="A";
		stringarr[1]="B";
		stringarr[2]="C";
		stringarr[3]="D";

		// similarly we can use other datatypes
		
		byte[] bytearr=new byte[3];
		short[] shortarr=new short[3];
		long[] longarr=new long[3];
		boolean[] booleanearr=new boolean[3];
		char[] chararr=new char[3];
		float[] floatarr=new float[3];
		double[] doubletarr=new double[3];
		Object[] obj=new Object[6];
		obj[0]=1;
		obj[1]="String";
		

	}

}
