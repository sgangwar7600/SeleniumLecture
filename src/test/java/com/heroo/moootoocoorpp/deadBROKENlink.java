package com.heroo.moootoocoorpp;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class deadBROKENlink {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement>hyperlinks = driver.findElements(By.tagName("a"));
		
		int resCode = 200; //2xx response is valid link
		int brokenLinkCnt = 0;
		
		System.out.println("total link on page" + hyperlinks.size() );
		for (WebElement elements : hyperlinks ) 
		{
			String urls = elements.getAttribute("href");
					
		try { 
			
		URL urlLinks = new URL(urls);
		
		HttpURLConnection huc = (HttpURLConnection)urlLinks.openConnection();
		huc.setRequestMethod("HEAD");
		huc.connect();	
	
		resCode = huc.getResponseCode();
		
		if(resCode >= 400) {
			System.out.println(urls + "broken link");
			brokenLinkCnt++;
		}
		
		
			} 
		catch( MalformedURLException e) 
		{
			
		}
		catch (Exception e) {}
		
		}
		System.out.println("total broken links" + brokenLinkCnt);
		driver.close();
	}
	

}
