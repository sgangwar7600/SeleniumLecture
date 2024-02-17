package com.heroo.moootoocoorpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {

	public static void main(String[] args)throws InterruptedException {

		WebDriverManager.chromedriver().getDownloadedDriverVersion();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(3000);
		
		WebElement source = driver.findElement(By.id("box6"));
		
		WebElement target = driver.findElement(By.id("box106"));
		
		Actions actt = new Actions(driver);
		actt.dragAndDrop(source, target).perform();
		
		
		
		
		
		
		
		
		
		
		
}}
