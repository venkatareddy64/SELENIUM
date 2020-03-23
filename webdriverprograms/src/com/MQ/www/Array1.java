package com.MQ.www;

public class Array1 {

	public static void main(String[] args) {
		int i,big;
    int arr[]= new int[]{1,3,5,2,5,7,9};
   big=arr[0];
   for(i=0;i<arr.length;i++)
   {
	   if(big<arr[i])
	   {
		   big=arr[i];
	   }
   }
		System.out.println(big);
   }
	
}

   