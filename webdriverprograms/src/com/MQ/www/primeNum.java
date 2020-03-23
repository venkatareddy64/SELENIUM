package com.MQ.www;

public class primeNum {

	public static void main(String[] args) {
		int n=28;	
		boolean flag=true;
		for(int i=2;i<=n/2;i++)
			{
			
			if(n%i==0)
			{
				flag=false;
				break;
			}
			}
			if(!flag)
		
				System.out.println("it is not prime");
			else
			   System.out.println("it is   prime");
			
				
			}
	}


