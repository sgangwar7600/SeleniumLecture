package com.heroo.moootoocoorpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageLinks {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://www.easemytrip.com/bus/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@title=\"easemytrip.com\"]")).click();
		
		if(driver.getTitle().equals("Book Flights, Hotels, Holidays, Bus & Train Tickets - EaseMyTrip.com")) {
			
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		driver.close();
		}
	}


