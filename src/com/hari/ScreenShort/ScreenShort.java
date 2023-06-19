package com.hari.ScreenShort;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  ScreenShort {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
        
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk");
        
        ScreenSnap(driver);
	}
	
	public static void ScreenSnap(WebDriver webdrive) throws IOException {
		
		File srcfile = ((TakesScreenshot)webdrive).getScreenshotAs(OutputType.FILE);
		 File distfile =  new File("C:\\Users\\irkrishn\\Downloads\\Selenium\\ScreenShorts\\"+timedate()+".png");
		 
		 FileUtils.copyFile(srcfile, distfile);
		
	}
	
	public static String timedate() {
		
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
