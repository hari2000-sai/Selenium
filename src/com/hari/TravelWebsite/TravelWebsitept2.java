package com.hari.TravelWebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelWebsitept2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        
        driver.get("https://www.easyjet.com/en");
        
        driver.findElement(By.id("ensCloseBanner")).click();
        
//        WebElement click = driver.findElement(By.id("ensCloseBanner"));
//        
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        
//        js.executeScript("arguments[0]",click );
         
         driver.findElement(By.cssSelector("input[name='origin']")).click();
         driver.findElement(By.cssSelector("input[name='origin']")).sendKeys("London");
         
         List<WebElement> elements =  new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-1 li>a>span")));
         
         for(WebElement element:elements) {
        	 if(element.getText().contains("Luton")) {
        		 element.click();
        	 }
         }
         
         driver.findElement(By.cssSelector("input[name='destination']")).click();
         driver.findElement(By.cssSelector("input[name='destination']")).sendKeys("France");
         
         List<WebElement> to =  new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-2 li>a>span")));
         
         for(WebElement destination:to) {
        	 if(destination.getText().contains("Bordeaux")) {
        		 destination.click();
        	 }
         }
//         driver.findElement(By.cssSelector("[ng-class] [origin-iata='OriginIata']:nth-of-type(1) .decoration-text")).click();
//         driver.findElement(By.cssSelector("[data-tab='Date Calendar Outbound'] [data-date='2023-05-17'] [aria-hidden]")).click();

//         driver.findElement(By.cssSelector("[passenger-type='Adults'] [alt='Add one passenger\\.']")).click();
//         driver.findElement( By.cssSelector("[passenger-type='Children'] [alt='Add one passenger\\.']")).click();
//         driver.findElement(By.cssSelector("form .search-submit:nth-child(9)")).click();
//        
         
	}

}
