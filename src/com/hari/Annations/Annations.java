package com.hari.Annations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annations{
	 WebDriver driver;
	 
	 @BeforeSuite
   public void start(){
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\chromedriver.exe");
		
       driver = new ChromeDriver();

       driver.manage().window().maximize();
	   
	   
   }
        @Test
	public void test() {
		 driver.get("https://www.automationtesting.co.uk");
	}
       
	
        @AfterSuite
	public void end() {
		driver.close();
		driver.quit();
	}
	 

}
