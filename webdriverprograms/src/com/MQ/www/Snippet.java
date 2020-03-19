package com.MQ.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snippet {
	public static void main(String args[]) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///D:/Google%20Drive/Selenium%20ClassRoom%20Training/Selenium26/Programs/frames/main1.htm");
	
			driver.switchTo().frame("f1");
			driver.switchTo().frame("f2");
			
			driver.findElement(By.id("txtUid")).sendKeys("Admin");
			
			driver.switchTo().parentFrame();
			driver.findElement(By.id("txtPwd")).sendKeys("admin");
	
			driver.switchTo().defaultContent();
			driver.findElement(By.id("btnSignIn")).click();
			
			System.out.println("LoggedIn Successfully...");
		}
	
	}


