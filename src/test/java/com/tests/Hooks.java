package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Hooks 
{
	
	WebDriver driver ;
	@BeforeClass
	public void beforeThisClass()
	{
		System.out.println("Testing Before this Class");
	}
	
	@BeforeTest
	public void beforeTest()
	{
	    driver = new FirefoxDriver();
		//driver.get("http://the-internet.herokuapp.com/");
	    driver.get("https://material.angularjs.org/latest");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	
	@AfterTest
	public void afterTest()
	{
		driver.close();
		driver.quit();
	}

}
