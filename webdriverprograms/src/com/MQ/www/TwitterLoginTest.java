package com.MQ.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterLoginTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/login");
		driver.findElement(By.name("session[username_or_email]")).sendKeys("venkatareddy65852@gmail.com");
		driver.findElement(By.name("session[password]")).sendKeys("Venkat@123");
			
	}

}
