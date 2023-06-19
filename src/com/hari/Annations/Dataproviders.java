package com.hari.Annations;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
 
 

 
 

 

public class Dataproviders{
	 WebDriver driver;
	 
	 @BeforeSuite
   public void start() throws InterruptedException{
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\chromedriver.exe");
		
       driver = new ChromeDriver();

       driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   Thread.sleep(2000);
   }
	 
	 
	 @DataProvider
	 public Object[][] getdata(){
		 
		 Object[][] data = new Object[3][2];
		 
		// data set 1
			data[0][0] = "123@test.com";
			data[0][1] = "Srisai@02";

			// data set 2
			data[1][0] = "test@test.com";
			data[1][1] = "test123";

			// data set 3
			data[2][0] = "doesntexist@test.com";
			data[2][1] = "xxxxxxx";

			return data;

		
		 
	 }
	 
		 
		@Test(dataProvider="getdata")
		public void signin(String email, String password) throws InterruptedException {
			driver.get("http://teststore.automationtesting.co.uk/");
			driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
			driver.findElement(By.cssSelector("section input[name='email']")).sendKeys(email);
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("button#submit-login")).click();
			System.out.println("user has logged in");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".hidden-sm-down.logout")).click();
       	 Thread.sleep(2000); 
		}

   
       
	
        @AfterSuite
	public void end() {
		driver.close();
		driver.quit();
	}
	 

}
