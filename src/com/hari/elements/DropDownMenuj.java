package com.hari.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class  DropDownMenuj {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\irkrishn\\Downloads\\Selenium\\drive_v1\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/dropdown.html");
         
        Select iteam = new Select(driver.findElement(By.cssSelector("select#cars")));
        
        iteam.selectByVisibleText("Ford");
	}

}
