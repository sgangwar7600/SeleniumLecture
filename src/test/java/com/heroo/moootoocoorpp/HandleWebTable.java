package com.heroo.moootoocoorpp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebTable {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open url
		driver.get("C:\\Users\\Shashikant\\OneDrive\\Desktop\\SampleDocument.html");
		
		//find second cell in web table and print second cell data
		
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
		
		//find total row webtable
		List <WebElement> rowList = driver.findElements(By.xpath("//table/tbody/tr"));
		
		System.out.println("Columns" + rowList.size());
		
		//find total columns in webtable
		List <WebElement> columnList = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		
		System.out.println("Columns" + columnList.size());
		
		
		for(int r = 2; r<= rowList.size(); r++) //2,3 
			{
			
			for (int c=1; c<=columnList.size() ; r++ )  //1,2
				{
				
				String data = driver.findElement(By.xpath("//table/table/tr[" + r + "]/td [" +c + "]")).getText();
				System.out.println(data);
			}
		}	
		
		
	}

}
