package com.MQ.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://flipkart.com");
		String name=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println(name+" "+url);
        driver.navigate().to("https://amazon.in");		
		

		
		
		
	
	}

}
