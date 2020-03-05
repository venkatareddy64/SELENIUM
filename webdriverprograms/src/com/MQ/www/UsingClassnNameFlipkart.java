package com.MQ.www;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClassnNameFlipkart {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input:");
		String seLink=sc.next();
		boolean isVal=true;
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.ebay.com");
	List<WebElement>v=driver.findElements(By.id("a"));
	for(WebElement e:v)
	{
		if(e.getText().equalsIgnoreCase(seLink))
		{
			isVal=false;
			e.click();
			break;
		}
	}
	if(isVal==true)
	{
		System.out.println("please check.......");
		driver.close();
	}
	
	
	}
	
}
