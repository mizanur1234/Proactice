package maysix_pages;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import maysix_library_screenshot.Screenshot;
import maysix_library_screenshot.library;

public class Base_pages {
	
	public static WebDriver driver;
	public static library lb;
	
	
	
	
	@Before
	public void Beforetest()
	{
		driver=new FirefoxDriver();
		//lb=new library(driver);
		driver=lb.startFirefoxBrowser();
		//driver=lb.startFirefoxBrowser();
		driver=lb.cromeBrowser();
		shots.setDriver(driver);
		System.out.println("Test Started");
		
		
	}
	@Rule
	public Screenshot shots=new Screenshot(driver);
	
	@After
	public void Aftertest()
	{
		System.out.println("Test Ended");
		driver.close();
		driver.quit();
	}

}
