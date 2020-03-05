package com.MQ.www;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input:");
		String seLink=sc.next();
		boolean isAvail=false;
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com");
		List<WebElement> d=driver.findElements(By.tagName("a"));
		for(WebElement link:d)
		{
			if(link.getText().equalsIgnoreCase(seLink))
			{
			isAvail=true;
			link.click();
			break;
			
		}
	}
	
if(isAvail==false)
{
	System.out.println("please select specic link name......");
	driver.close();
}
	
}
}
