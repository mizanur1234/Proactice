package maysix_library_screenshot;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;

public class Screenshot extends TestWatcher {
	
	
	public WebDriver driver;
    public library lb;
     
    public Screenshot(WebDriver _driver)
    {
        this.driver = _driver;      
    }
     
    public void setDriver(WebDriver _driver)    
    {
        this.driver = _driver;
    }
     
    public WebDriver getDriver()
    {
        return this.driver;
    }
     
     
    private String createScreenshotName(Description des)
    {       
        String finalScreenshotName = null;
        //String timeStamp = myLib.getCurrentTime();
        try
        {
            String temp = des.getDisplayName();
            finalScreenshotName = temp.replace('(', '_').replace(')', '_').replace('.', '_'); //+ timeStamp;            
        }catch(Exception e)
        {
            e.printStackTrace();
        }       
        return finalScreenshotName;
    }
     
     
    @Override
    public void failed(Throwable t, Description des)
    {
        lb = new library(driver);
        String newSreenShotName = createScreenshotName(des);
        lb.takeScreenShot(newSreenShotName, "C:/Users/Raj/Desktop/New folder/USCIS");
         
        if(driver != null)
        {
            driver.close();
            driver.quit();
        }
    }


}
