package com.MQ.www;

import java.util.Scanner;

public enum Month {
	jan,feb,mar, seasons;
	public void m1()
	{
		System.out.println("m1 method");
	}
	


public static void main(String args[]) throws InterruptedException
{
	
	Thread.sleep(1500);
	try {
	Month m=Month.seasons.feb;
	System.out.println(m);
	m.m1();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
