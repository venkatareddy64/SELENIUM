package com.MQ.www;

public class Amstrong {

	public static int Amstrong(int n)
	{
	int rem,sum=0,temp;
	temp=n;
	while(n!=0)
	{
		rem=n%10;
		sum=sum+rem*rem*rem;
		n/=10;
	}
	if(temp==sum)
	System.out.println("amstrong number is");
	else
		System.out.println("Not Amstrong number is:");
	
	return sum;
	}
	public static void main(String[] args) {
		int n=152;
		System.out.println(Amstrong(n));
	}

}
