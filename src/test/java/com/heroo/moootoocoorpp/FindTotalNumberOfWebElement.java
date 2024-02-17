package com.heroo.moootoocoorpp;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//Find list of total number of web elements on web page
public class FindTotalNumberOfWebElement {


		public static void main(String[] args) throws InterruptedException  {
			{

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://www.calculator.net/");

			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			
			List<WebElement> listOfElement = driver.findElements(By.xpath("//*"));
			System.out.println("no of elements   " + listOfElement.size());
			
			//driver.close();
		}
	}

}
