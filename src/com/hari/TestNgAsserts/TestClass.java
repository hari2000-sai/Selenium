package com.hari.TestNgAsserts;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
 
 

 
 
@Listeners(com.hari.TestNgAsserts.ITestListiner.class)
 

public class TestClass{
	 WebDriver driver;
	 
	 @BeforeSuite
   public void start() throws InterruptedException{
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\chromedriver.exe");
		
       driver = new ChromeDriver();

       driver.manage().window().maximize();
       
       driver.get("http://teststore.automationtesting.co.uk/login?back=my-account");
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   Thread.sleep(2000);
   }
	 
	 @Test
	 
	 public void email() {
		 
		Assert.fail();
		 driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("123@test.com");
	 }
	 
	 @Test
	 public void password() {
	  driver.findElement(By.cssSelector("[name='password']")).sendKeys("Srisai@02");
	 }
	 
	  
}
	 
	 
	  