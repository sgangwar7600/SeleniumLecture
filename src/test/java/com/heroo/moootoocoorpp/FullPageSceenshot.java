package com.heroo.moootoocoorpp;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullPageSceenshot {

	public static void main(String[] args) throws IOException {


		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://www.heromotocorp.com/en-in.html");
		
		//convert webdriver object into takescreenshot interface
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		
		//call screesnshot getScreenshotAs method to create image file
		
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\Shashikant\\eclipse-workspace\\motocorpp\\src\\Screenshots\\fullscreenshothero.png");
		
		FileUtils.copyFile(srcFile, des);
		
		driver.close();
		
	}

}
