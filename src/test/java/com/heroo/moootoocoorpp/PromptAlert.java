package com.heroo.moootoocoorpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlert {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.findElement(By.name("prompt")).click();
		
		driver.switchTo().alert().sendKeys("I am genius");
		
		driver.switchTo().alert().accept();
		
	}

}
