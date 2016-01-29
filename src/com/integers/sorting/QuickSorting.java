package com.integers.sorting;

public class QuickSorting
{
	
	public static void quickSort(int[] array,int lowerIndex, int higherIndex) 
	{
		int left = lowerIndex;
		int right = higherIndex;
		// calculate pivot number, I am taking pivot as middle index number
		int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
		// Divide into two arrays
		while (left <= right) 
		{
			/*In each iteration, we will identify a number from left side which 
		     is greater then the pivot value, and also we will identify a number 
		     from right side which is less then the pivot value. Once the search 
		     is done, then we exchange both numbers.*/

			while (array[left] < pivot) 
			{
				left++;
			}
			while (array[right] > pivot) 
			{
				right--;
			}
			
			if (left <= right) 
			{
				exchangeNumbers(array,left,right);
				//move index to next position on both sides
				left++;
				right--;
			}
		}
		// call quickSort() method recursively
		if (lowerIndex < right)
		{
			quickSort(array,lowerIndex, right);
		}
		if (left < higherIndex)
		{
			quickSort(array,left, higherIndex);
		}
	}
	
	private static void exchangeNumbers(int[] array,int left, int right)
	{
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
	
	
}