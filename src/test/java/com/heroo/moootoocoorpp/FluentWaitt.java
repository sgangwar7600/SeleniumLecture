package com.heroo.moootoocoorpp;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitt {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open url - index - 0
		driver.get("https://www.ebay.com/");
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				
	     .withTimeout(Duration.ofSeconds(10))
	     .pollingEvery(Duration.ofSeconds(2))
	     .withMessage("this is custom messege")
	     .ignoring(NoSuchElementException.class);
		
		WebElement elementt = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Saved")));
		
		elementt.click();
		driver.close();
	}

}
