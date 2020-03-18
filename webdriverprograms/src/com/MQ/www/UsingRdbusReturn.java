package com.MQ.www;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingRdbusReturn {

	public static void main(String[] args)throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:redbus.in");
		Thread.sleep(1000);
		driver.findElement(By.xpath("\r\n" + 
				"//*[@id='search']/div/div[4]/div/label"));
		List<WebElement>rows=driver.findElements(By.xpath("//*[@id='rb-calendar_return_cal']/table/tbody/tr"));
		for(int i=3;i<=rows.size();i++)
		{
			List<WebElement>cols=driver.findElements(By.xpath("//*[@id='rb-calendar_return_cal']/table/tbody/tr["+i+"]/td"));
			{
				for(int j=1;j<=cols.size();j++)
				{
					WebElement cell=driver.findElement(By.xpath("//*[@id='rb-calendar_return_cal']/table/tbody/tr["+i+"]/td["+j+"]"));
				if(cell.getText().equals("25"))
				{
					cell.click();
					break;
				}
				
				
				}
			}
		}
	}

}
