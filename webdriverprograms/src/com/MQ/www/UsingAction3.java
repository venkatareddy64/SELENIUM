package com.MQ.www;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class UsingAction3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		WebElement ibox=driver.findElement(By.id("selectable"));
	List<WebElement>items=ibox.findElements(By.tagName("li"));
	Actions a=new Actions(driver);
	a.keyDown(Keys.CONTROL).click(items.get(0)).click(items.get(2)).click(items.get(1)).click(items.get(3)).build().perform();
		
		
		
		
		
	}

}
