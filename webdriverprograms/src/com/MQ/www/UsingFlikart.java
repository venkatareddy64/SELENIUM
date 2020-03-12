package com.MQ.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class UsingFlikart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		 driver.findElement(By.id("u_0_m")).sendKeys("venkatreddy");
		 driver.findElement(By.id("u_0_o")).sendKeys("singatala");
		 driver.findElement(By.id("u_0_r")).sendKeys("9885073164");
		 driver.findElement(By.id("u_0_w")).sendKeys("Venkat@123");
	WebElement dd=	 driver.findElement(By.id("day"));
	Select s=new Select(dd);
	s.selectByValue("11");
		WebElement ddd= driver.findElement(By.id("month"));
		Select ss=new Select(ddd);
		ss.selectByIndex(5);
		WebElement d=driver.findElement(By.id("year"));
		 Select sss=new Select(d);
		 sss.selectByValue("1998");
		 
		driver.findElement(By.id("u_0_a")).click();
			
		 driver.findElement(By.id("u_0_13")).click();
			
		 
			
			
		 
		 

		 
			
		 
		 
			
		
	}

}
