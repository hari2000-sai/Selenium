package com.hari.Cookies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://teststore.automationtesting.co.uk/");
        
        driver.findElement(By.cssSelector("a[title='Log in to your customer account']")).click();
        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("123@test.com");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("Srisai@02");
        driver.findElement(By.cssSelector("[data-link-action='sign-in']")).click();
        driver.findElement(By.linkText("CLOTHES")).click();
        driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();
        driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();
//      driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        
      driver.findElement(By.cssSelector("///a[@innertext='Proceed to checkout']")).click();
          
        
	}

}
