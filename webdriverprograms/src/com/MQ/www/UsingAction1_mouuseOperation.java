package com.MQ.www;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingAction1_mouuseOperation {
	public static void main(String[]args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://google.com");
    driver.findElement(By.name("q")).sendKeys("Apples");
    Actions a=new Actions(driver);
    a.sendKeys(Keys.ENTER).build().perform();
	}

}
