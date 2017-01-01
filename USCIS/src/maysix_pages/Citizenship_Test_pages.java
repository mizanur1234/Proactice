package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Citizenship_Test_pages extends Base_pages {
	
	By HomePage_Right_className=By.className("right-nav");
	By Citizenship_Interview=By.linkText("Pass the Citizenship Test & Interview");
	
	By Page_className=By.className("main-content");
	By TageNameP=By.tagName("p");
		
	By Pass=By.linkText("Pass The US Citizenship Test");
	By Interview=By.linkText("US Citizenship Test & Interview");
	By Citizenship=By.linkText("Apply For Citizenship");
	By Certificate=By.linkText("Certificate Of Citizenship");
	By N_400=By.linkText("Form N-400 Citizenship Application");
	By N_565=By.linkText("USCIS Form N-565");
	By ApplyOnline=By.linkText("US Citizenship - Apply Online");
	By Study_Guide=By.linkText("US Citizenship Study Guide");
	
	
	
	public Citizenship_Test_pages CitizenshipTest_Interview()
	{
		WebElement Catagoty=driver.findElement(HomePage_Right_className);
		WebElement tage=Catagoty.findElement(Citizenship_Interview);
		lb.highLightElement(driver, tage); 
		tage.click();
		return this;
	}
	
	public Citizenship_Test_pages Title()
	{
		String pagetitle=driver.getTitle();
		lb.print(pagetitle);
		return this;
	}
	
	public Citizenship_Test_pages PageName()
	{
		WebElement Catagoty=driver.findElement(Page_className);
		WebElement Pagename=Catagoty.findElement(TageNameP);
		String Pring=Pagename.getText();
		lb.print(Pring);
		return this;
	}
	
	public Citizenship_Test_pages Catagory_List()
	{
	
		WebElement Catagoty=driver.findElement(Page_className);
		
		WebElement pass_test=Catagoty.findElement(Pass);
		lb.highLightElement(driver, pass_test);
		lb.print("Pass Your US Citizenship Test & Interview. Get Expert Tips And A Practice Interview.");
		
		WebElement Multi_language=Catagoty.findElement(Interview);
		lb.highLightElement(driver, Multi_language);
		lb.print("Multi-Language DVD Helps You Pass Your US Citizenship & Interview.");
		
		WebElement Correctly=Catagoty.findElement(Citizenship);
		lb.highLightElement(driver, Correctly);
		lb.print("Prepare & Complete Your Citizenship Form Correctly");
		
		WebElement Online_applications=Catagoty.findElement(Certificate);
		lb.highLightElement(driver, Online_applications);
		lb.print("Online Application Form N-600 For US Citizenship.");
		
		WebElement Official_Applications=Catagoty.findElement(N_400);
		lb.highLightElement(driver, Official_Applications);
		lb.print("US Citizenship Application Online. Official Government Forms.");
		
		WebElement Replace_Citizenship=Catagoty.findElement(N_565);
		lb.highLightElement(driver, Replace_Citizenship);
		lb.print("Complete Application To Replace US Citizenship Certificate");
		
		WebElement Online_Citizen_form=Catagoty.findElement(ApplyOnline);
		lb.highLightElement(driver, Online_Citizen_form);
		lb.print("Apply For US Citizenship Online. Complete Form N-400 ");
		
		WebElement Student_guide=Catagoty.findElement(Study_Guide);
		lb.highLightElement(driver, Student_guide);
		lb.print("Prepare To Pass Your US Citizenship Test.");
		
		lb.print("");
		
		return this;
	}

}
