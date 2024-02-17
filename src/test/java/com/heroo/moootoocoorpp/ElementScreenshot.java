package com.heroo.moootoocoorpp;

import java.io.File;
import java.io.IOException;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementScreenshot {

	public static void main(String[] args) throws IOException {



		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://www.heromotocorp.com/en-in.html");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//img[@alt='Home']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement SectionScr = driver.findElement(By.xpath("(//img[@alt='book now'])[2]"));
	
		File src = SectionScr.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Shashikant\\eclipse-workspace\\motocorpp\\src\\SectionSC\\elementSC.png");
		FileUtils.copyFile(src, des);
		driver.close();
		
		
	}

}
