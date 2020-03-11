package com.MQ.www;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDropdown3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the catagory :");
		String cat=sc.nextLine();
		System.out.println("enter the product name :");
		String prod=sc.nextLine();
		boolean isAvail=false;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		WebElement dd=driver.findElement(By.id("gh-cat"));
		Select s=new Select(dd);
		List<WebElement>items=s.getOptions( );
		for(WebElement item:items)
		{
			if(item.getText().equalsIgnoreCase(cat))
			{
				isAvail=true;
				s.selectByVisibleText(cat);
				driver.findElement(By.id("gh-ac")).sendKeys(prod);
			    driver.findElement(By.id("gh-btn")).click();
			    break;
			
			}
			
		}
		if(isAvail==false)
		{
			System.out.println("please select specific item......");
		   driver.close();
		}
		
		
	}

}
