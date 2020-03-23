package com.MQ.www;

import java.util.Scanner;

public class StringRev2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the String:");
		String str=sc.nextLine();
		String str1[]=str.split(" ");
		for(String i:str1)
		{
			char[] ch=i.toCharArray();
			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.println(ch[j
				                      ]);
			}
		}
		System.out.println(" ");
	}

}
