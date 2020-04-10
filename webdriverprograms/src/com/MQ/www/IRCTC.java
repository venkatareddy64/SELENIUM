package com.MQ.www;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTC {

	public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.yatra.com/trains");
 driver.findElement(By.xpath("//a[@id='booking_engine_holidays']//div")).click();
	}
}
