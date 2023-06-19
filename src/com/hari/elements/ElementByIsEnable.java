package com.hari.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementByIsEnable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/buttons.html");
        System.out.println(
        	
driver.findElement(By.cssSelector("button#btn_three")).isEnabled()
        		);
        System.out.println(
            	
        		driver.findElement(By.cssSelector("button#btn_four")).isEnabled()
        		        		);
       
 	}

}
