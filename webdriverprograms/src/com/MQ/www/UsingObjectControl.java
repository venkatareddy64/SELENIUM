package com.MQ.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingObjectControl {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("9703066734");
		driver.findElement(By.id("pass")).sendKeys("Venky@123");
		driver.findElement(By.id("u_0_v")).click();

	}

}
