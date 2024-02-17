package com.heroo.moootoocoorpp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Titlee {

	public static void main(String[] args) throws InterruptedException {

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.heromotocorp.com/en-in.html");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}
	

}
