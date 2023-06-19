package com.hari.TravelWebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelWebsitept1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        
        driver.get("https://www.easyjet.com/en");
        
         driver.findElement(By.id("ensCloseBanner")).click();
         
         driver.findElement(By.cssSelector("input[name='origin']")).click();
         driver.findElement(By.cssSelector("input[name='origin']")).sendKeys("London");
         
         List<WebElement> elements =  new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-1 li>a>span")));
         
         for(WebElement element:elements) {
        	 if(element.getText().contains("Luton")) {
        		 element.click();
        	 }
         }
         
      

	}

}
