package com.heroo.moootoocoorpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	public static void main(String[] args)throws InterruptedException {

		WebDriverManager.chromedriver().getDownloadedDriverVersion();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://sellglobal.ebay.in/seller-center/home/");
		
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.partialLinkText("Shipping"));
		Actions actt = new Actions(driver);
		actt.moveToElement(element).perform();
}

}
