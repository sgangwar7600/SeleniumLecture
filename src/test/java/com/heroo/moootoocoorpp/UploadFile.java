package com.heroo.moootoocoorpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile  {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().getDownloadedDriverVersion();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://demoqa.com/upload-download");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\Shashikant\\OneDrive\\Desktop\\Issues.txt");
		
	}

}
