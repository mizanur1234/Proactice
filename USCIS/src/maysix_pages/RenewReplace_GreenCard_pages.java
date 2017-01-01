package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RenewReplace_GreenCard_pages extends Base_pages{
	
	By HomePage_Right_className=By.className("right-nav");
	By Renew=By.linkText("Renew or Replace Green Card");
	
	By Page_className=By.className("main-content");
	By TageNameP=By.tagName("p");
	
	By Replace=By.linkText("Renew Or Replace Green Card");
	By Renew_greanCard=By.linkText("Renew Green Card");
	By Online=By.linkText("Green Card Forms Online");
	By Expired=By.linkText("Renew Expired Green Card");
	By Conditions=By.linkText("Remove Conditions On Green Card");
	By Forms=By.linkText("Green Card Forms");
	By Application=By.linkText("Green Card Application");
	By GreenCard_Renewal=By.linkText("Green Card Renewal");
	
	public RenewReplace_GreenCard_pages Adjustment_form()
	{
		WebElement Catagoty=driver.findElement(HomePage_Right_className);
		WebElement tage=Catagoty.findElement(Renew);
		lb.highLightElement(driver, tage); 
		tage.click();
		return this;
	}
	
	public RenewReplace_GreenCard_pages Title()
	{
		String pagetitle=driver.getTitle();
		lb.print(pagetitle);
		return this;
	}
	
	public RenewReplace_GreenCard_pages PageName()
	{
		WebElement Catagoty=driver.findElement(Page_className);
		WebElement Pagename=Catagoty.findElement(TageNameP);
		String Pring=Pagename.getText();
		lb.print(Pring);
		return this;
	}
	
	
	
	public RenewReplace_GreenCard_pages Catagory_List()
	{
	
		WebElement Catagoty=driver.findElement(Page_className);
		
		WebElement Prepare_Renew= Catagoty.findElement(Replace);
		lb.highLightElement(driver, Prepare_Renew);
		lb.print("Prepare USCIS Form I-90 To Renew & Replace Green Card Online");
		
		WebElement Simple_process=Catagoty.findElement(Renew_greanCard);
		lb.highLightElement(driver, Simple_process);
		lb.print("Renew Your Green Card Online. Fast & Simple Process.");
		
		WebElement Application_Resources=Catagoty.findElement(Online);
		lb.highLightElement(driver, Application_Resources);
		lb.print("Green Card Applications & Resources.");
		
		WebElement Renuew_Expaire=Catagoty.findElement(Expired);
		lb.highLightElement(driver, Renuew_Expaire);
		lb.print("Renew Your Expired Green Card Online With Form I-90 Online.");
		
		WebElement REmove_conditions=Catagoty.findElement(Conditions);
		lb.highLightElement(driver, REmove_conditions);
		lb.print("Apply To Remove Conditions On Green Card Form I-751 Online.");
		
		WebElement Get_GreenCard=Catagoty.findElement(Forms);
		lb.highLightElement(driver, Get_GreenCard);
		lb.print("Get Green Card Forms Online. Step-By-Step Instructions.");
		
		WebElement Applying_fast=Catagoty.findElement(Application);
		lb.highLightElement(driver, Applying_fast);
		lb.print("Prepare Your Green Card Online. Applying Is Fast & Easy.");
		
		WebElement Reolace_Expired=Catagoty.findElement(GreenCard_Renewal);
		lb.highLightElement(driver, Reolace_Expired);
		lb.print("Renew Or Replace Expired Green Card. Complete USCIS Form I-90 Online");
		
		lb.print("");
		
		return this;
	}

}
