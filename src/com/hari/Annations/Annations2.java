package com.hari.Annations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annations2{
	 WebDriver driver;
	 
	 @BeforeSuite
   public void start() throws InterruptedException{
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\chromedriver.exe");
		
       driver = new ChromeDriver();

       driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   Thread.sleep(2000);
   }
	 @BeforeTest
	 public void singin() throws InterruptedException {
		 driver.get("http://teststore.automationtesting.co.uk/");
		 
		 driver.findElement(By.cssSelector("a[title='Log in to your customer account']")).click();
	        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("123@test.com");
	        driver.findElement(By.cssSelector("[name='password']")).sendKeys("Srisai@02");
	        driver.findElement(By.cssSelector("[data-link-action='sign-in']")).click();
	        
	        Thread.sleep(2000);
	 }
        @Test
	public void test() {
        	
        	driver.findElement(By.linkText("CLOTHES")).click(); 
	}
        @AfterTest
       public void singout() throws InterruptedException {
        	driver.findElement(By.cssSelector(".hidden-sm-down.logout")).click();
        	 Thread.sleep(2000);
       }
	
        @AfterSuite
	public void end() {
		driver.close();
		driver.quit();
	}
	 

}
