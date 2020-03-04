package com.MQ.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsinUrlAndTitle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println(url+" "+title);
		System.out.println("**********************************");

		driver.navigate().to("http://flipkart.com");
		String title1=driver.getTitle();
		String url1=driver.getCurrentUrl();
		System.out.println(url1+" "+title1);
		;
		
	}

}
