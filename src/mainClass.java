import static com.integers.sorting.QuickSorting.quickSort;
import static com.integers.sorting.BubbleSorting.bubbleSort;
import static com.integers.utils.arrayPrint.printArray;

public class mainClass 
{

	public static void main(String[] args) 
	{
		
		/*// reverse string with toChar method
		String originalString = new String("agjhgba");
		System.out.println("Original String is : "+originalString);
		String reversedString = com.Strings.Utils.stringReverse.stringReverseChar(originalString);
		System.out.println("Reversed String is : "+reversedString);
		 */
		
		//Quick Sort 
		int[] array = {4,9,6,2,8,3,7,20,14,5,1};
		System.out.println("Array Before Sorting : ");
		printArray(array);
		//quickSort(array, 0, array.length-1);
		bubbleSort(array);
		System.out.println("Array After Sorting : ");
		printArray(array);		
	}

	
}
