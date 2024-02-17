package com.heroo.moootoocoorpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FRAMEandIFRAME {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open url - index - 0
		driver.get("https://www.rediff.com/");
		
		//switch to IFRAME
		
		driver.switchTo().frame("moneyiframe");
		
		String nseindex = driver.findElement(By.id("nseindex")).getText();
		
		System.out.println(nseindex);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
		
		
	}

}
