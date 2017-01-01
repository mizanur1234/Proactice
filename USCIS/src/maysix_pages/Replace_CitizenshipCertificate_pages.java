package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Replace_CitizenshipCertificate_pages extends Base_pages{
	
	By HomePage_Right_className=By.className("right-nav");
	By Certificate=By.linkText("Replace Your Certificate of Citizenship");
	
	By Page_className=By.className("main-content");
	By TageNameP=By.tagName("p");
	
	By N_565=By.linkText("USCIS Form N-565");
	By Citizenship=By.linkText("US Citizenship - Apply Online");
	By US_Certificate=By.linkText("Certificate Of Citizenship");
	By N_400=By.linkText("Form N-400 Citizenship Application");
	By Interview=By.linkText("US Citizenship Test & Interview");
	By Become_Citizen=By.linkText("Become A US Citizen");
	By Citizenship_Application=By.linkText("Form N-400 Citizenship Application");
	By Replace=By.linkText("Replace Citizenship Certificate");
	
	
	public Replace_CitizenshipCertificate_pages ReplaceCertificate_Citizenship ()
	{
		WebElement Catagoty=driver.findElement(HomePage_Right_className);
		WebElement tage=Catagoty.findElement(Certificate);
		lb.highLightElement(driver, tage); 
		tage.click();
		return this;
	}
	
	public Replace_CitizenshipCertificate_pages Title()
	{
		String pagetitle=driver.getTitle();
		lb.print(pagetitle);
		return this;
	}
	
	public Replace_CitizenshipCertificate_pages PageName()
	{
		WebElement Catagoty=driver.findElement(Page_className);
		WebElement Pagename=Catagoty.findElement(TageNameP);
		String Pring=Pagename.getText();
		lb.print(Pring);
		return this;
	}
	
	public Replace_CitizenshipCertificate_pages Catagory_List()
	{
	
		WebElement Catagoty=driver.findElement(Page_className);
		
		WebElement Application_Replace=Catagoty.findElement(N_565);
		lb.highLightElement(driver, Application_Replace);
		lb.print("Complete Application To Replace US Citizenship Certificate");
		
		WebElement Online_Citizenhip=Catagoty.findElement(Citizenship);
		lb.highLightElement(driver, Online_Citizenhip);
		lb.print("Apply For US Citizenship Online. Complete Form N-400 ");
		
		WebElement Online_form=Catagoty.findElement(US_Certificate);
		lb.highLightElement(driver, Online_form);
		lb.print("Online Application Form N-600 For US Citizenship");
		
		WebElement Official_goverment=Catagoty.findElement(N_400);
		lb.highLightElement(driver, Official_goverment);
		lb.print("US Citizenship Application Online. Official Government Forms. ");
		
		WebElement Language_dvd=Catagoty.findElement(Interview);
		lb.highLightElement(driver, Language_dvd);
		lb.print("Multi-Language DVD Helps You Pass Your US Citizenship & Interview.");
		
		WebElement Become_Citizenships=Catagoty.findElement(Become_Citizen);
		lb.highLightElement(driver, Become_Citizenships);
		lb.print("Complete Your US Citizenship Application Online. Become a US Citizen!");
		
		WebElement Citizenship_Online=Catagoty.findElement(Citizenship_Application);
		lb.highLightElement(driver, Citizenship_Online);
		lb.print("US Citizenship Application Online. Official Government Forms.");
		
		WebElement prepare_Replace=Catagoty.findElement(Replace);
		lb.highLightElement(driver, prepare_Replace);
		lb.print("Replace Citizenship Certificate. Prepare Form N-565 Online");
		
		lb.print("");
		
		return this;
	}
	
	
	
	
	
	

}
