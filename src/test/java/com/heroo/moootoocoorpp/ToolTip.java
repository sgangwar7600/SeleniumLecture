package com.heroo.moootoocoorpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://seleniumautomationpractice.blogspot.com/2020/04/tooltip.html");
				
		//driver.findElement(By.xpath("//li[@id='Forms Based']")).click();
		
		Thread.sleep(2000);
		
		String actualtooltip = driver.findElement(By.xpath("//a//time[@class=\"published\"][1]")).getAttribute("title");
		String expectedtooltip = "2020-04-02T13:04:00-07:000";
		
		if(actualtooltip.equals(expectedtooltip)) {
			System.out.println("Pass : Tooltip matching expected value");
		}
		else {
			System.out.println("Fail : Tooltip NOT matching expected value");
		}
		driver.close();
		
		
		
	}

}
