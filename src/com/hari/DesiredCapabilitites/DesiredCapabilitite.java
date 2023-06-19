package com.hari.DesiredCapabilitites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

 

public class  DesiredCapabilitite{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\chromedriver.exe");
		
		DesiredCapabilities c = new DesiredCapabilities();
        
		
		c.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		c.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions options = new ChromeOptions();
		
		options.merge(c);
          
                   

          WebDriver driver = new ChromeDriver(options);

          
        
        driver.get("https://expired.badssl.com/");
	}

}
