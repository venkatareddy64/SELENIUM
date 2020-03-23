package com.MQ.www;

public class LeapYear {
	
	static int Leap(int year) {
		if(year%4==0)
		
			//if(year%400==0)
		
		System.out.println("leap year");
			else
				System.out.println("not leap year");
		
		return year;
		
	}
		
		public static void main(String args[])
		{
			int year=2017;
			System.out.println(Leap(year));
	}

}
