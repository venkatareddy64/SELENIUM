package com.MQ.www;

import java.util.Scanner;

public class StringRev1 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    		 System.out.print("enter the String :");
    		 String str=sc.nextLine();
    		 String arr[]=str.split(" ");
    		 for(String i:arr)
    		 {
    			 System.out.println(i);
    		 }
    		 for(int i=arr.length-1;i>=0;i--)
    		 {
    			 System.out.print(" "+arr[i]);
    		 }
    		 
	}

}
