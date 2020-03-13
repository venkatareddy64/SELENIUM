package com.MQ.www;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTable2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the company name :");
		String cmp=sc.nextLine();
		String cry=null;;
		boolean isAvail=false;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement>rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		for(int i=2;i<=rows.size();i++)
		{
			WebElement web=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td[1]"));
			if(web.getText().equalsIgnoreCase(cmp))
			{
				isAvail=true;
				cry=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td[3]")).getText();
				break;
			}
		}
		if(isAvail==true)
		{
			System.out.println("'"+cmp+"' is available in the counntry:"+cry);
		
		}else {
			System.out.println("'"+cmp+"'is not avialable in the country"+cry);
		
		}
		driver.close();
		
		
	}

}
