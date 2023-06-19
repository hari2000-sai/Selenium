package com.hari.elements;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assertions_part2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://teststore.automationtesting.co.uk/");
        
// driver.findElement( By.xpath("///a[@innertext='Tables']")).click() ; 
 
         driver.findElement( By.cssSelector( "[alt='The best is yet to come\\' Framed poster']")).click();
         
         driver.findElement(By.cssSelector( ".add-to-cart.btn.btn-primary")).click();
         
         Thread.sleep(2000);
         
        String amount =driver.findElement(By.cssSelector(".product-total > .value")).getText();
       
          Assert.assertEquals("$36.00",amount);
         
        
	}

}
