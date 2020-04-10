package com.MQ.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
static int sum(int x,int y)
{
	int lcm,gcd,a,b,t;
	a=x;
	b=y;
	while(b!=0)
	{
		t=b;
		b=a%b;
		a=t;
	}
	gcd = a;
	 lcm=x*y/gcd;
	 return gcd;
	
	
}
public static void main(String args[])
{

	System.out.println(sum(12,14));
	


    
	}

}
