package com.hari.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtons {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/dropdown.html");
         
         driver.findElement(By.cssSelector("[for='demo-priority-low']")).click();
         
         Thread.sleep(3000);
         
         driver.findElement(By.cssSelector("[for='demo-priority-normal']")).click();
         
         Thread.sleep(3000);
         
         driver.findElement(By.cssSelector("[for='demo-priority-high']")).click();

        
	}

}
