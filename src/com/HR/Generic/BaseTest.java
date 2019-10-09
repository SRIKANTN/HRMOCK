package com.HR.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements Autoconstant 
{
	static
	{
		System.setProperty(chrome_key, chrome_value);
		System.setProperty(firefox_key, firefox_value);
	}
	public WebDriver driver;
	@BeforeMethod
	public void precondition()
	{
		
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://192.168.1.198:8008");
		
	}
	@AfterMethod
	public void postcondition(ITestResult res)
	{
		int status = res.getStatus();
		if(status==2)
		{
			String name = res.getMethod().getMethodName();
			GenericUtils.getScreenShot(driver, name);
		}
	//	driver.close();
		
	}
}
