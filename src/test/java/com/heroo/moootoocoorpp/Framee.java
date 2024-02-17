package com.heroo.moootoocoorpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framee {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open url - index - 0
		driver.get("https://www.javadoc.io/static/org.seleniumhq.selenium/selenium-api/2.50.1/index.html?overview-summary.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		//switch to main frame
		driver.switchTo().defaultContent();
		
		//switch to 2nd frame
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Alert")).click();
		
		//switch to main frame
		driver.switchTo().defaultContent();
				
		//switch to 2nd frame
				driver.switchTo().frame(2);
				driver.findElement(By.linkText("Abstract Methods")).click();
				
				//switch to main frame
				driver.switchTo().defaultContent();
		
		//find & print total iframes on page
		
		int Noofiframes = driver.findElements(By.tagName("frame")).size();
		System.out.println("Number of iframe  :   "  +  Noofiframes);
		
		
		
		
		
		
		
		
		
		
	}

}
