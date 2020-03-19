package com.MQ.www;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingEmail {

	public static void main(String[] args) {
	   WebDriver driver=new ChromeDriver();	
	   driver.manage().window().maximize();
	   driver.get("https://www.gmail.com");
	   driver.findElement(By.id("Email")).sendKeys("venkatareddy.singatalacom");
       //Click on Next
       driver.findElement(By.id("next")).click();
       // Wait For Page To Load
       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
       //Enter Password
       driver.findElement(By.id("Passwd")).sendKeys("venkatreddy678");
      
       // Click on 'Sign In' button
       driver.findElement(By.id("signIn")).click();
      
       // Close the driver
       //driver.quit();
  	}

}
