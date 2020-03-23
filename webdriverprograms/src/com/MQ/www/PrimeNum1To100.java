package com.MQ.www;

public class PrimeNum1To100 {

	public static void main(String[] args) {
		System.out.println("PrimeNumbers are:");
		for(int i=4;i<=100;i++)
		{
			boolean flag=true;
			for(int j=2;j<=i/2;++j)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
				}
			if(flag==true)
			{  
				System.out.println(i);
			}
		}
	}

}
