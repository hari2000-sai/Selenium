package com.hari.ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

 

public class ChromeOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\chromedriver.exe");
		
          ChromeOptions options = new ChromeOptions();
          
          options.addArguments("--start-maximized");
  		options.addArguments("--incognito");

          
          

          WebDriver driver = new ChromeDriver(options);

          
        
        driver.get("https://www.automationtesting.co.uk");
	}

}
