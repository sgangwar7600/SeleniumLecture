package com.heroo.moootoocoorpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick  {

	public static void main(String[] args)throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://demoqa.com/buttons");
		
		Thread.sleep(3000);
	
	WebElement 	doubleclick = driver.findElement(By.id("doubleClickBtn"));
	
	Actions act = new Actions(driver);
	act.doubleClick(doubleclick).perform();
	
	
	
	
	}
	
	
	

}
