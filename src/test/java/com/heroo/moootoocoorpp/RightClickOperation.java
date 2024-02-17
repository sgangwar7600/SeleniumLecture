package com.heroo.moootoocoorpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickOperation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://demoqa.com/buttons");
		
		Thread.sleep(3000);
		
		WebElement rightbutton = driver.findElement(By.id("rightClickBtn"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightbutton).perform();
	}
}
