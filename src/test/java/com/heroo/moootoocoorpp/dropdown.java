package com.heroo.moootoocoorpp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	
public static void main(String[] args)throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//driver.navigate().to("https://www.opencart.com/index.php?route=account/register/");
		driver.get("https://app.endtest.io/guides/docs/how-to-test-dropdowns/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement elements = driver.findElement(By.id("pets"));
		Select dropdown = new Select(elements);
		//dropdown.selectByIndex(1);
		//dropdown.selectByValue("rabbit");
		//dropdown.selectByVisibleText("Cat");		
		
		if(dropdown.isMultiple()==true) {
			System.out.println("Dropdown is Multiple");
			}
		else {
			System.out.println("Dropdown is not Multiple");
		}
		
		
		List<WebElement>  alldropdownOptions = 	dropdown.getOptions();
		
		for(WebElement ele: alldropdownOptions) {
			
			System.out.println(ele.getText());
		}
		
		//System.out.println(alldropdownOptions.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}
