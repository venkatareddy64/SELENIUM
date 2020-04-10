package com.MQ.www;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingRobotUploadFile {

	public static void main(String[] args)throws Exception {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://transfer.pcloud.com/");
	StringSelection sel=new StringSelection("C:\\Users\\susmitha\\Pictures\\wallpaper.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div/div[2]/div/div[1]/div[2]/a/span/span")).click();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	
	Thread.sleep(2000);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	}

}
