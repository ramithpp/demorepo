package com.test.testngtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testngbasics {
	
	public static WebDriver driver = null;
	
	@BeforeClass
	public void launch(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\148602\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void navigate(){
		 driver.navigate().to("http://www.google.com/");  
		 driver.close();
	}
	
	
}
