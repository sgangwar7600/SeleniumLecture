package com.heroo.moootoocoorpp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollByVisiability {

	public static void main(String[] args)throws InterruptedException {

		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open url - index - 0
		driver.get("https://www.calculator.net/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);

		WebElement Element = driver.findElement(By.xpath("//a[normalize-space()='Sales Tax Calculator']"));
		//Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoview();", Element);
	}

}
