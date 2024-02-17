package com.heroo.moootoocoorpp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTabl2 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//find total row webtable
		List <WebElement> rowList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		
		System.out.println("total row webtable   :   " + rowList.size());
		
		//find total columns in webtable
		List <WebElement> columnList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
				
		System.out.println("total columns in webtable   :   " + columnList.size());
		
		
		for (int r =2 ; r<= rowList.size(); r++ )//row
			
		{
			
			for (int c=1; c<=columnList.size() ; c++) //Column
				
			{
				String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+ r + "] /td[" + c + "]")).getText();

				System.out.println("print all the data "  +  data);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
