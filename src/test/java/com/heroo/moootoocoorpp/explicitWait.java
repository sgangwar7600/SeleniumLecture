package com.heroo.moootoocoorpp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitWait {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open url - index - 0
		driver.get("https://www.ebay.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Saved")));
		element.click();
		
		driver.close();
		
		
		
		
		
		
	}

}
