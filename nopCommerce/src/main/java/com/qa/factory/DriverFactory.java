package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory 
{
	static ThreadLocal<WebDriver> driver= new ThreadLocal<WebDriver>();
	
	public WebDriver setUp()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\003KT8744\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		driver.set(new ChromeDriver());
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
	public void quitBrowser()
	{
		getDriver().quit();
	}

}
