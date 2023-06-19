package com.hari.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Accodrions {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();http://teststore.automationtesting.co.uk/

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/accordion.html");
        
        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();

        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
        
        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();
        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();


        
        
         
       
        
	}

}
