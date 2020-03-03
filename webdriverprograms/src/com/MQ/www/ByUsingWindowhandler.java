package com.MQ.www;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingWindowhandler {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http:naukri.com");
		String title=driver.getTitle();
		String whand=driver.getWindowHandle();
		Set<String>whand2=driver.getWindowHandles();
		for(String id:whand2)
		{
			driver.switchTo().window(id);
			if(!driver.getTitle().equalsIgnoreCase(title))
			{
				driver.close();
				
			}
		}
		driver.switchTo().window(whand);
		System.out.println(driver.getTitle());

	}

	private static Object getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}
