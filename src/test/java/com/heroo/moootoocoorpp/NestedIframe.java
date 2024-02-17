package com.heroo.moootoocoorpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedIframe {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open url - index - 0
		driver.get("https://chercher.tech/practice/frames");
		driver.switchTo().frame("frame1");         //  ----    parent frame/ outer frame
		driver.switchTo().frame("frame3"); 			//  ---- child frame/ inner frame
		
		//find webelement checkbox
		
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().parentFrame();  //  ----    parent frame/ outer frame
		
		driver.findElement(By.tagName("input")).sendKeys("I hate the world");
		
		driver.switchTo().defaultContent();  //  ----- switching the main frame
		
		driver.switchTo().frame("frame2");  
		
		WebElement ListOFdropdownElements= driver.findElement(By.id("animals"));
		
		Select dropdown = new Select(ListOFdropdownElements);
		
		dropdown.selectByValue("babycat");
		
		
	}

}
