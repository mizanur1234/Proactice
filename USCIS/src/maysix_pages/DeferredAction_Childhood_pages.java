package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DeferredAction_Childhood_pages extends Base_pages {

	
	By HomePage_Right_className=By.className("right-nav");
	By Deferred=By.linkText("Apply for Deferred Action for Childhood Arrivals");
	
	By Page_className=By.className("main-content");
	By TageNameP=By.tagName("p");
	
	By I_821D=By.linkText("Deferred Action Form I-821D");
	By DACA_Renewal=By.linkText("DACA Renewal");
	By Employment=By.linkText("Green Card By Employment");
	By Citizenship=By.linkText("Apply For US Citizenship");
	By Expired=By.linkText("Renew Expired Green Card");
	By Forms=By.linkText("Green Card Forms");
	By Form_821D=By.linkText("USCIS Form I-821D");
	By Immigration=By.linkText("US Immigration Forms");
	

	public DeferredAction_Childhood_pages DeferredAction_applications()
	{
		WebElement Catagory1=driver.findElement(HomePage_Right_className);
		WebElement Deferredlist = Catagory1.findElement(Deferred);
		lb.highLightElement(driver, Deferredlist);
		Deferredlist.click();

		return this;
	}

	public DeferredAction_Childhood_pages Ttitle()
	{
		String Actual=driver.getTitle();
		lb.print("Page title : "+Actual);
		return this;
	}

	public DeferredAction_Childhood_pages PageName()
	{
		WebElement Catagoty=driver.findElement(Page_className);
		WebElement Pagename=Catagoty.findElement(TageNameP);
		String Pring=Pagename.getText();
		lb.print(Pring);
		return this;
	}

	public DeferredAction_Childhood_pages Catagory()
	{
		WebElement Catagory1=driver.findElement(Page_className);
		
		WebElement Replace=Catagory1.findElement(I_821D);
		lb.highLightElement(driver, Replace);
		lb.print("Prepare USCIS Form I-821D To Renew & Replace DACA Online.");
		
		WebElement Deferred_Actions=Catagory1.findElement(DACA_Renewal);
		lb.highLightElement(driver, Deferred_Actions);
		lb.print("Apply Or Renew Deferred Action. DACA Form I-821D Online.");
		
		WebElement Employement=Catagory1.findElement(Employment);
		lb.highLightElement(driver, Employement);
		lb.print("Get Green Card Through Employment. All Forms & Instructions Included");
		
		WebElement Citizenship_Correctily=Catagory1.findElement(Citizenship);
		lb.highLightElement(driver, Citizenship_Correctily);
		lb.print("Prepare & Complete Your Citizenship Form Correctly.");
		
		WebElement Renew_Expaire=Catagory1.findElement(Expired);
		lb.highLightElement(driver, Renew_Expaire);
		lb.print("Renew Your Expired Green Card Online With Form I-90 Online");
		
		WebElement Instructions=Catagory1.findElement(Forms);
		lb.highLightElement(driver, Instructions);
		lb.print("Get Green Card Forms Online. Step-By-Step Instructions.");
		
		WebElement Deferred_Applications=Catagory1.findElement(Form_821D);
		lb.highLightElement(driver, Deferred_Applications);
		lb.print("Apply For Deferred Action Form I-821D Online. Easy To Do");
		
		WebElement Citizen_visa=Catagory1.findElement(Immigration);
		lb.highLightElement(driver, Citizen_visa);
		lb.print("US Green Card, Citizenship and Visas. Prepare Your Forms");

		lb.print("");
		return this;
	}

}
