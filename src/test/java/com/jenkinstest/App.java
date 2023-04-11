package com.jenkinstest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class App{
	public static WebDriver driver;

	@Test
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Priyanka Mehra"
				+ "\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		
		 Assert.assertTrue(driver.getTitle().contains("Orange"),"Title does not match");
		 driver.quit();
	}
}