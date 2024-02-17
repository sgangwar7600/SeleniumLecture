package com.heroo.moootoocoorpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchWindoww {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.saucedemo.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
				
		String CWH = driver.getWindowHandle();
		driver.switchTo().window(CWH);
		
		Thread.sleep(2000);
		
		System.out.println("get window has been executed ");
		driver.close();
	}
}
