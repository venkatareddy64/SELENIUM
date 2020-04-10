package com.MQ.www;
import java.util.*;
import java.io.*;
public class StaticMemb

		{
		public static void main(String[] args)
		{
		int i,n=28,sum=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("perfect square");
		}
		else
			System.out.println("not perfect square");
		
		}
		}