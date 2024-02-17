package com.heroo.moootoocoorpp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MavenClass {

			public static void main(String[] args) {

		
				 //WebDriverManager.chromedriver().browserVersion("114").setup();
				 WebDriverManager.chromedriver().setup();

			     WebDriver driver = new ChromeDriver();
				

				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shashikant\\OneDrive\\Desktop\\drivers\\chromedriver.exe");
			     //WebDriver driver = new ChromeDriver();
			
				driver.navigate().to("https://www.heromotocorp.com/en-in.html");
				
				String title = driver.getTitle();
				
				System.out.println(title);
				
				String CurrentURL = driver.getCurrentUrl();
				
				System.out.println(CurrentURL);
				
				String PageSource = driver.getPageSource();
				System.out.println(PageSource);
				
				driver.close();
				
			}

		

		
		
		
	}


