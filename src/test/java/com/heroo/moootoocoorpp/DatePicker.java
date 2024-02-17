package com.heroo.moootoocoorpp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args)throws InterruptedException {
		
		
		WebDriverManager.chromedriver().getDriverVersions();
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		
		
		driver.manage().window().maximize();
		//10-Dec-2022
		String expectedDay = "10";
		String expectedMonth = "December";
		String expectedYear = "2023";
		//open url - index - 0
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();
		Thread.sleep(3000);
		
		while(true) {
			
			String Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
								
			String Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(Month.equals(expectedMonth) && Year.equals(expectedYear) ) 
			{
				List <WebElement> dayList = driver.findElements(By.xpath("//table/tbody/tr/td"));
				
				for (WebElement e : dayList) {
					
				String calenderDayy = 	e.getText();
				if(calenderDayy.equals(expectedDay)) {
					
					e.click();
					
					System.out.println("calenderDayy"  +  calenderDayy);
					
					
					break;
				}
				
				}
				break;
			}
			else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			
		}	driver.close();
		
		} 
	
	} 
