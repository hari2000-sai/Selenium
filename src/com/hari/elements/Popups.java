package com.hari.elements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Popups {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();http://teststore.automationtesting.co.uk/

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/popups.html");
        
        driver.findElement(By.cssSelector("[onclick='popup\\(\\)']")).click();
        
        String MainWindow = driver.getWindowHandle();
        
        Set<String> handle = driver.getWindowHandles();
        
        Iterator<String> itrate = handle.iterator();
        
        while(itrate.hasNext()) {
        	String child = itrate.next();
        	
        	if(!MainWindow.equalsIgnoreCase(child)) {
        		
        		Thread.sleep(3000);
        		
        		driver.switchTo().window(child);
        		
        		Thread.sleep(3000);
        		
        		driver.close();
        		
        	
        	}
        }
         
        driver.switchTo().window(MainWindow);
        
        driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();
        
		Thread.sleep(3000);

        
        driver.switchTo().alert().accept();
        
	}

}
