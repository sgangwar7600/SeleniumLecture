package com.heroo.moootoocoorpp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNewTab {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://www.heromotocorp.com/en-in.html");
		
		System.out.println(  "first tab title  :  "   +  driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to("https://www.easemytrip.com/");
		
		System.out.println(  "second tab title  :  "   +  driver.getTitle());

		
		driver.close();
	}

}
