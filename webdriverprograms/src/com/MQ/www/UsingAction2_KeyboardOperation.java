package com.MQ.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingAction2_KeyboardOperation {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://amazon.in");
driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[1]")).click();
driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("9885073164");
driver.findElement(By.xpath("//*[@id='continue']")).click();
driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("venkat123");
driver.findElement(By.xpath("//*[@id=\'signInSubmit\']")).click();
WebElement ddIcon=driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[2]/span"));
Actions a=new Actions(driver);
a.moveToElement(ddIcon).build().perform();
driver.findElement(By.xpath(" //*[@id=\'nav-item-signout\']/span")).click();
	}

}
