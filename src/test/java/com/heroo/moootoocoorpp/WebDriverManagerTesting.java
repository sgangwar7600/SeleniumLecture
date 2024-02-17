package com.heroo.moootoocoorpp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTesting {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();

		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open url - index - 0
		driver.get(" 	/");

	}

}
