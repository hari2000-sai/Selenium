package com.hari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        System.setProperty("webdriver.edge.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\msedgedriver.exe");
        
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk");
	}
}
