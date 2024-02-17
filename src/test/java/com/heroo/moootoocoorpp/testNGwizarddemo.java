package com.heroo.moootoocoorpp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class testNGwizarddemo {
	@Test
	public void verifyPageTitlee() {


		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		String expectedtitle = "Google";
		String actualtitle = driver.getTitle();

		Assert.assertEquals(expectedtitle, actualtitle);
	}
}
