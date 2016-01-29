package com.Strings.Utils;

public  class stringReverse 
{
	
	public static String stringReverseChar(String originalString) 
	{
		// copy string to character array
		char[] str = originalString.toCharArray();
		//logic#1
		int originalStringLength = str.length;
		String reversedString = "";
		for(int i= originalStringLength-1; i>=0;i-- )
		{
			reversedString = reversedString+str[i];
		}
		return reversedString;
	}

}
