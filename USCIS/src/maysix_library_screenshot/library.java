package maysix_library_screenshot;

import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class library {
	
	



	private WebDriver driver;
	public library(WebDriver _driver)

	{
		this.driver = _driver;
	}

	/***
	 * Browser Setup (Firefox). with (Maximize,page load time and implicitilywait time)
	 * @return
	 */
	public WebDriver startFirefoxBrowser()

	{
		try {
		
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // wait
																				// for
																				// driver
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS); // wait
																				// for
																				// pageload
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return driver;
		
			
	}
	//C:/Users/Raj/Desktop/selenium/Traning 2016/IEDriverServer_Win32_2.52.0;C:/Users/Raj/Desktop/selenium/Traning 2016
	/****
	 *Browser Setup the GooglechromeDriver. with (Maximize,page load time and implicitilywait time)
	 * @return
	 */
	//C:\Ruby22\bin;C:\Users\Raj\Desktop\selenium\Traning 2016\IEDriverServer_Win32_2.52.0;C:\Users\Raj\Desktop\selenium\Traning 2016\chromedriver_linux64;C:\Users\Raj\Desktop\selenium\Traning 2016\apache-ant-1.9.6\bin;C:\cygwin64\bin
	public WebDriver cromeBrowser()
	{
		try{
			
			System.setProperty("WebDriver Chrome,Drive", "C:/Users/Raj/Desktop/selenium/Traning 2016/IEDriverServer_Win32_2.52.0;C:/Users/Raj/Desktop/selenium/Traning 2016/chromedriver_linux64");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		}catch (Exception e)
		{
			System.out.println("Error:"+e.getMessage());
			e.getStackTrace();
		}
		return driver;
	
	}
	
	
	
	/***
	 * this mathord start remot
	 * @param HubRul
	 * @param browserName
	 * @return
	 * @throws Exception
	 */
	public WebDriver StartremoteBrowser(String HubRul,String browserName) throws Exception
	{
		DesiredCapabilities Capabilities = new DesiredCapabilities();
		Capabilities.setBrowserName(browserName);
		driver= new RemoteWebDriver(new URL(HubRul),Capabilities);
		
		return driver;
	}
	
	
	/*public WebDriver startIEBrowser()
	
	{
		try{
		System.setProperty("webdriver.ie.driver","C:/Users/Raj/Desktop/selenium/Traning 2016/IEDriverServer_Win32_2.52.0");
		driver=new InternetExplorerDriver();
		}catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
			e.getStackTrace();
		}
		return driver;
	}*/

	/***
	 * This enterTexfiled will work for fillup the fild with string value.
	 * clear the file after that it will but value in there by send key
	 * @param by
	 * @param textValue
	 */
	public void enterTextField(By by, String textValue) {
		try {
			WebElement targetTextField = driver.findElement(by);
			targetTextField.clear();
			targetTextField.sendKeys(textValue);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}

	}
				// use this Library for Facebook select down method three element day, month, year
	/***
	 * This selec dropdown can only use for Visible text string value.
	 * @param by
	 * @param targetValue
	 */
	public void selectdropDown(By by, String targetValue) {
		try {
			WebElement dropDownElem = driver.findElement(by);
			Select selectList = new Select(dropDownElem);
			selectList.selectByVisibleText(targetValue);
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}

	}
	
	
	
	/***
	 * This Select dropdown can only use for Index value not the string .
	 * @param by
	 * @param targetvalue
	 */
	public void Selectdindex(By by,int targetvalue) {
		try
		{
			WebElement dropdwn=driver.findElement(by);
			Select selectlist=new Select(dropdwn);
			selectlist.selectByIndex(targetvalue);
		}catch (Exception e)
		{
			print("Error: "+e.getMessage());
			e.printStackTrace();
		}
	}
/***
 * screenshort
 * @param screenShotName
 * @param saveLocationPath
 * @return
 */
	public String takeScreenShot(String screenShotName, String saveLocationPath)
	{
		//String saveLocationPath=saveLocationPath+screenShotName +"_"+ getCurrentTime()+"JPG"
		try{
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(saveLocationPath + screenShotName +"_"+ getCurrentTime() + ".Png"));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return saveLocationPath + screenShotName + ".png"; 
	}
	
	/****
	 * This will give you current time for Screenshot.year,month,day as well as current time.
	 * @return
	 */
	public String getCurrentTime()
	{
		String timeStamp = null;
		try{
			timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return timeStamp;
	}
	

	
	/****
	 * Fullent wait is for same time . also as soon as the page open that will start work.
	 * @param by
	 * @return
	 */
	public WebElement fluentwait(By by)
	{
		WebElement targetelem=null;
		try{
		
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
				.withTimeout(40,TimeUnit.SECONDS)
				.pollingEvery(3, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		targetelem=wait.until(new Function<WebDriver, WebElement>()
				{
			@Override
				public WebElement apply (WebDriver driver)
			{
			return driver.findElement(by);	
			}
		});
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return targetelem;
		
	}
	
	/****
	 * 
	 * @param insecounds
	 * @throws Exception
	 */
	public void customwait(int insecounds)throws Exception
	{
		Thread.sleep(insecounds*1000);
	}
	
	/****
	 * This is as same as "SYSTES.OUT.PRINTLN()"
	 * @param stingValue
	 */
	public void print(String stingValue)
	{
		System.out.println(stingValue);
	}
	
	/***
	 * This clickbutton for cliking Redio Buttons.
	 * @param by
	 */
	public void clickbutton(By by)
	{
		try{
		WebElement btnElem=	driver.findElement(by);
		btnElem.click();
		}catch(Exception e)
		{
		print("Error: "+e.getMessage());
		e.printStackTrace();	
		}
		
		
	
	}	
	/***
	 *This can click hidden Element.
	 * @param by
	 */
	public void clickonhiddenelement(By by)
	{
		try{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", driver.findElement(by));
		}catch(Exception e)
		{
			print("ERROR: "+e.getMessage());
			e.getStackTrace();
		}
	}
	
	
	/***
	 * This will move mouse to the elemnt one time.
	 * @param ToElemnt
	 */
	
	public void movemouseToElemnt(WebElement ToElemnt)
	{
		try{
			Actions action=new Actions(driver);
			action.moveToElement(ToElemnt).build().perform();
			customwait(1);
		}catch(Exception e)
		{
			print("Error : "+e.getMessage());
		}
	}
	
	
	/***
	 * this will move mouse two elemnt one after other .
	 * @param toFirstElemnt
	 * @param toSecoundElemnt
	 */
	public void movemouseToElemnt(WebElement toFirstElemnt,WebElement toSecoundElemnt)
	
	{
		try{
			Actions action=new Actions(driver);
			action.moveToElement(toFirstElemnt).build().perform();
			customwait(1);
			action.moveToElement(toSecoundElemnt).build().perform();
			customwait(1);
		}catch(Exception e)
		{
			print("Error : "+e.getMessage());
		}
	}
	
	/****
	 * this will help us to upload file on the webside.
	 * Note*: For the window test execution enverionment , please use "\\" For the file path
	 * for other environtment (mac os,Linnux),please use "/" for the window.)
	 * @param by
	 * @param absulatepathforfile
	 */
	public void uploadfile(By by,String absulatepathforfile)
	{
		try{
			WebElement uploadfile=driver.findElement(by);
			uploadfile.sendKeys(absulatepathforfile);
		}catch(Exception e)
		{
			print("Error : "+e.getMessage());
		}
			
	}	
		
	
	public String Tablesearch(By tableiID,int Row_num,int col_num)
	{
		String Result = null;
		WebElement table = driver.findElement(tableiID);
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int i_row = 1;
		for (WebElement temp : rows) 
		{
			if (i_row == Row_num)
			{
				List<WebElement> cols = temp.findElements(By.tagName("td"));

				int i_cols = 1;
				for (WebElement temp2 : cols)
				{
					if (i_cols == col_num) 
					{
						return Result = temp2.getText();
					}
					// System.out.println("Row: "+i_row+",col: "+i_cols+",Data:
					// "+temp2.getText());
					i_cols++;
				}				
			}
			i_row++;
		}
		return Result;
	}
	
	
	
	
	/***
	 * creating damo mode for highlighter so that i can setup useing boolen 
	 * @author Raj
	 *
	 */
				
	
	public void highLightElement(WebDriver driver, WebElement element)
	{
	JavascriptExecutor js=(JavascriptExecutor)driver; 
	 
	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	 
	try 
	{
	Thread.sleep(500);
	} 
	catch (InterruptedException e) {
	 
	System.out.println(e.getMessage());
	} 
	 
	js.executeScript("arguments[0].setAttribute('style','border: solid 2px white')", element); 
	 
	}

}
