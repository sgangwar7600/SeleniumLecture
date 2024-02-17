package com.heroo.moootoocoorpp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open url - index - 0
		driver.get("https://demo.guru99.com/V4/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//enter text in search UserID
		//js.executeScript("document.ElementByxpath('//input[@name='uid']').value='shashikant';");
		//enter text in search password
		//js.executeScript("document.ElementByxpath('//input[@name='password']').value='shashikant';");
		
		driver.findElement(By.name("uid")).sendKeys("mngr34926");					
        driver.findElement(By.name("password")).sendKeys("amUpenu");
        
		//click on login button
		//WebElement element = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		WebElement button =driver.findElement(By.name("btnLogin"));			

		js.executeScript("arguments[0].click;", button);
		//To generate Alert window using JavascriptExecutor. Display the alert message 			
        js.executeScript("alert('Welcome to Guru99');");   
		
		//Thread.sleep(2000);
		//driver.close();
		
	
		
	}
}
