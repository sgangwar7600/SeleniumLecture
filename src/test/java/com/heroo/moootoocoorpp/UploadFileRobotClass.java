package com.heroo.moootoocoorpp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileRobotClass {

	public static void main(String[] args)throws InterruptedException, AWTException {

		//WebDriverManager.chromedriver().ignoreDriverVersions().setup();
		
		WebDriverManager.chromedriver().getDownloadedDriverVersion();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://demoqa.com/upload-download");
		
		Thread.sleep(3000);
		
		
		WebElement button = driver.findElement(By.id("uploadFile"));
		
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		//copy the file
		StringSelection ss = new StringSelection("C:\\Users\\Shashikant\\OneDrive\\Desktop\\Issues.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//paste the file (control + V action to paste file)
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
			

	}

}
