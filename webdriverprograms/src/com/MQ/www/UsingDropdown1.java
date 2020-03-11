package com.MQ.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDropdown1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:ebay.com");
		WebElement ele=driver.findElement(By.id("gh-cat"));
		Select s=new Select(ele);
		s.selectByVisibleText("Books");
		driver.findElement(By.id("gh-ac")).sendKeys("selenium");
		driver.findElement(By.id("gh-btn")).click();
				
		
		
	}

}
