package com.test.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbroswer {
	public static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.setProperty("webdriver.ie.driver",".\\driver\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.navigate().to("http://www.google.com/");  
		//driver.manage().window().maximize();
		driver.close();*/
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\148602\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.navigate().to("http://www.google.com/");  
		//driver.manage().window().maximize();
		driver.close();
	}

}
