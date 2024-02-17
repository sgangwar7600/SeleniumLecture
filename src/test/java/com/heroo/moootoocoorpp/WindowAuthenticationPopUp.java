package com.heroo.moootoocoorpp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowAuthenticationPopUp {

	public static void main(String[] args)throws InterruptedException {

		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://admin:adminn@the-internet.herokuapp.com/basic_auth");
		
		//driver.close();

	}

}
