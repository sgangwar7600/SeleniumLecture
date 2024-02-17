package com.heroo.moootoocoorpp;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



// find any specific name of weblelement


public class ReturnWebElements {
	
	public static void main(String[] args) {
	{

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://www.saucedemo.com/v1/inventory.html");
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	driver.manage().window().maximize();
	
	List<WebElement> listOfElement = driver.findElements(By.partialLinkText("Sauce"));
	System.out.println("no of elements   " + listOfElement.size());
	
	driver.close();
}
}}
