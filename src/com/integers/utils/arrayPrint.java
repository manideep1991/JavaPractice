package com.integers.utils;

public class arrayPrint 
{
	
	public static void printArray(int[] array) 
	{
		// TODO Auto-generated method stub
		System.out.print("{");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+",");
		}
		System.out.print("}");
		System.out.print("\n");		
	}

}
