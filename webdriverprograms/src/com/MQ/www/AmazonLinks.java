package com.MQ.www;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://Amazon.com");
	List<WebElement>link=driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(WebElement links:link)
		{
		System.out.println(links.getText());
		}
	}

}
