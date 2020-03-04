package com.MQ.www;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFindElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		List<WebElement>link=driver.findElements(By.tagName("a"));
		System.out.println("how many links there in page:");
		System.out.println(link.size());
		System.out.println("the links are:");
		for(WebElement links:link)
		{
			System.out.println(links.getText());
		}
		
	}

}
