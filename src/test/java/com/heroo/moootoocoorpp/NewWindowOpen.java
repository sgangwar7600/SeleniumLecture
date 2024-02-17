package com.heroo.moootoocoorpp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowOpen {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().getDriverVersions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open url - index - 0
		driver.get("https://www.heromotocorp.com/en-in.html");
		System.out.println(  "first tab title  :  "   +  driver.getTitle());
		
		Thread.sleep(4000);
		
		//first new tab - index - 1
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.makemytrip.com/");
		System.out.println(  "second tab title  :  "   +  driver.getTitle());
		
		Thread.sleep(3000);
		
		//second new tab - index - 2
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.booking.com/");
		System.out.println(  "second tab title  :  "   +  driver.getTitle());
		
		Thread.sleep(3000);
		
		//third new tab - index - 3
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://open.spotify.com/");
		System.out.println(  "second tab title  :  "   +  driver.getTitle());
		
		Thread.sleep(3000);
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.easemytrip.com/");
		System.out.println(  "second tab title  :  "   +  driver.getTitle());

		//get open window handles of open windows
		Set <String> windowhandles = driver.getWindowHandles(); 
		List<String> handles = new ArrayList<String>();
		handles.addAll(windowhandles);
		
		driver.close();
		
		Thread.sleep(3000);

		driver.switchTo().window(handles.get(2));
		

	}

}
