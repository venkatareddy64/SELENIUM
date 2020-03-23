package com.MQ.www;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Noukri {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:naukri.com");
		driver.findElement(By.xpath("//input[@class='orangeBtn bifurLightBox']")).click();
		driver.findElement( By.xpath("//*[@id=\'flowBifurcation\']/div[2]/form/div[1]/div/button")).click();
        driver.findElement(By.id("fname")).sendKeys("venkatreddy");
        driver.findElement(By.id("email")).sendKeys("venkatareddy.singatala");
        driver.findElement(By.xpath("//*[@id=\'basicDetailForm\']/div[3]/div[1]/div/input")).sendKeys("Venkat@123");
	    driver.findElement(By.xpath("//*[@id=\'basicDetailForm\']/div[4]/div[1]/div/input[2]")).sendKeys("9885073164");
	  WebElement list=driver.findElement(By.xpath("//*[@id=\'basicDetailForm\']/resman-location/div/div/div[1]/div/div[1]/ul/li/div/label/input"));
		Select s=new Select(list);
	    s.selectByVisibleText("Delhi");
	    
	
	
	
	}

}
