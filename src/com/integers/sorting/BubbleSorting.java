package com.integers.sorting;

public class BubbleSorting 
{
	public static void bubbleSort(int[] array) 
	{
		// TODO Auto-generated method stub
		for (int pass = 0 ; pass<array.length-1 ; pass++)
		{
			for(int innerloop = 0 ; innerloop<array.length-pass -1; innerloop++)
			{
				if(array[innerloop]>array[innerloop+1])
				{
					swap(array,innerloop);
				}
					
			}
		}
		
	}

	private static void swap(int[] array,int innerloop) 
	{
		// TODO Auto-generated method stub
		int temp=0;
		temp = array[innerloop];
		array[innerloop] = array[innerloop+1];
		array[innerloop+1] = temp;		
	}
	
}
