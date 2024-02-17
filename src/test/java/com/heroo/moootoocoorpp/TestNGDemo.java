package com.heroo.moootoocoorpp;
import javax.annotation.security.RunAs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@Test
	public void verifyPageTitle() {
		
		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		String expectedtitle = "Google";
		String actualtitle = driver.getTitle();

		Assert.assertEquals(expectedtitle, actualtitle);
		//driver.quit();
		
		
		
	}
	
}
