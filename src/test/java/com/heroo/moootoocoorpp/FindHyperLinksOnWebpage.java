package com.heroo.moootoocoorpp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindHyperLinksOnWebpage {

	public static void main(String[] args)throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.calculator.net/");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();	
		
		List<WebElement> AllHyperlinksElement= driver.findElements(By.tagName("a"));
		System.out.println("total of AllHyperlinksElement :   "   +   AllHyperlinksElement.size() );
		
					//driver.close();
			for (WebElement el : AllHyperlinksElement) {
			
			System.out.println( "find hyperlinks "  +  el.getText());	
		}
			driver.close();

	}
	
		
		}
		
		



