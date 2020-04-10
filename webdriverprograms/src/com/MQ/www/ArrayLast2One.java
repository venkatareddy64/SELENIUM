package com.MQ.www;

import java.util.Arrays;

public class ArrayLast2One {
	public static int Last(int arr[],int n)
		{
		Arrays.sort(arr);
		return arr[n-2];
			
		}
	public static void main(String args[])
	{
	int arr[]= {1,2,3,4,5,6};
	System.out.println(Last(arr,6));
	
	}

}
