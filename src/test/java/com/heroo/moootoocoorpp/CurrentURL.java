package com.heroo.moootoocoorpp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CurrentURL {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().getDownloadedDriverVersion();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.heromotocorp.com/en-in.html");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String CurrentURL = driver.getCurrentUrl();
		
		System.out.println(CurrentURL);
		
		driver.close();
	}

}
