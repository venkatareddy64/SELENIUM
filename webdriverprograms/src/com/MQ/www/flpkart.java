package com.MQ.www;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flpkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com");
		WebElement ele=driver.findElement(By.id("gh-ac"));
		ele.sendKeys("adidas");
		 driver.findElement(By.id("gh-btn")).click();
	}

}
