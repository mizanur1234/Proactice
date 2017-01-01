package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Apply_Citizenship_pages extends Base_pages {
	
	By HomePage_Right_className=By.className("right-nav");
	By apply=By.linkText("Apply for US Citizenship");
	
	By Page_className=By.className("main-content");
	By TageNameP=By.tagName("p");
	
	By Become_Citizen=By.linkText("Become A US Citizen");
	By Apply_Online=By.linkText("US Citizenship - Apply Online");
	By US_Citizenship=By.linkText("Apply For US Citizenship");
	By Certificate=By.linkText("Certificate Of Citizenship");
	By N_565=By.linkText("USCIS Form N-565");
	By N_400 =By.linkText("Form N-400 Citizenship Application");
	By Citizenship_Test=By.linkText("Pass The US Citizenship Test");
	By Citizenship_Form=By.linkText("US Citizenship Form");
	
	
	public Apply_Citizenship_pages ApplyforUS_Citizenship()
	{
		WebElement Catagoty=driver.findElement(HomePage_Right_className);
		WebElement tage=Catagoty.findElement(apply);
		lb.highLightElement(driver, tage); 
		tage.click();
		return this;
	}
	
	public Apply_Citizenship_pages Title()
	{
		String pagetitle=driver.getTitle();
		lb.print(pagetitle);
		return this;
	}
	
	public Apply_Citizenship_pages PageName()
	{
		WebElement Catagoty=driver.findElement(Page_className);
		WebElement Pagename=Catagoty.findElement(TageNameP);
		String Pring=Pagename.getText();
		lb.print(Pring);
		return this;
	}
	
	public Apply_Citizenship_pages Catagory_List()
	{
	
		WebElement Catagoty=driver.findElement(Page_className);
		
		WebElement Citizen_applications=Catagoty.findElement(Become_Citizen);
		lb.highLightElement(driver, Citizen_applications);
		lb.print("Complete Your US Citizenship Application Online.");
		
		WebElement ApplicationBy_online=Catagoty.findElement(Apply_Online);
		lb.highLightElement(driver, ApplicationBy_online);
		lb.print("Apply For US Citizenship Online. Complete Form N-400 ");
		
		WebElement Prepare_Apply=Catagoty.findElement(US_Citizenship);
		lb.highLightElement(driver, Prepare_Apply);
		lb.print("Prepare & Complete Your Citizenship Form Correctly.");
		
		WebElement Application_N565=Catagoty.findElement(Certificate);
		lb.highLightElement(driver, Application_N565);
		lb.print("Online Application Form N-600 For US Citizenship.");
		
		WebElement Application_replace=Catagoty.findElement(N_565);
		lb.highLightElement(driver, Application_replace);
		lb.print("Complete Application To Replace US Citizenship Certificate");
		
		WebElement Official_application=Catagoty.findElement(N_400);
		lb.highLightElement(driver, Official_application);
		lb.print("US Citizenship Application Online. Official Government Forms.");
		
		WebElement pass_Interview=Catagoty.findElement(Citizenship_Test);
		lb.highLightElement(driver, pass_Interview);
		lb.print("Pass Your US Citizenship Test & Interview. Get Expert Tips And A Practice Interview.");
		
		WebElement Easy_steps=Catagoty.findElement(Citizenship_Form);
		lb.highLightElement(driver, Easy_steps);
		lb.print("Apply Online For US Citizenship. Easy, Step-By-Step Form N-400");
		
		lb.print("");
		
		return this;
	}
	
		
	
	
	
	
	

}
