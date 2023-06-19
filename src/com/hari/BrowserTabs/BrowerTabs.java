package com.hari.BrowserTabs;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerTabs {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/browserTabs.html");
        
       
        
        for (int i =0;i<3;i++) {
        	 driver.findElement(By.cssSelector("[type]")).click();
        }
        
        ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
        
      System.out.println( windows.size());
        
        for(String items: windows) {
        	  Thread.sleep(1500);
        	driver.switchTo().window(items);
        }
        Thread.sleep(1500);
        driver.switchTo().window(windows.get(0));
       
	}

	
	
	
}
