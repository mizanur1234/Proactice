package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Citizenship_Application_pages  extends Base_pages{
	
	By Manu=By.className("left-nav");
	By Citizenship_Application=By.linkText("Citizenship Application (Form N-400)");
	
	By Page_className=By.className("main-content");
	By TageNameP=By.tagName("p");
	
	By N_400=By.linkText("Citizenship Application Form N-400");
	By Citizenship=By.linkText("US Citizenship - Apply Online");
	By OnlineApp=By.linkText("Apply For Citizenship");
	By Online_Government_From=By.linkText("Form N-400 Citizenship Application");
	By Certificate=By.linkText("Certificate Of Citizenship");
	By N_565=By.linkText("USCIS Form N-565");
	By Test=By.linkText("Pass The US Citizenship Test");
	By Forms=By.linkText("US Citizenship Forms");
	
	public Citizenship_Application_pages Application_form()
	{
		WebElement Catagoty=driver.findElement(Manu);
		WebElement tage=Catagoty.findElement(Citizenship_Application);
		lb.highLightElement(driver, tage); 
		tage.click();
		return this;
	}
	
	public Citizenship_Application_pages Title()
	{
		String pagetitle=driver.getTitle();
		lb.print(pagetitle);
		return this;
	}
	
	public Citizenship_Application_pages PageName()
	{
		WebElement Catagoty=driver.findElement(Page_className);
		WebElement Pagename=Catagoty.findElement(TageNameP);
		String Pring=Pagename.getText();
		lb.print(Pring);
		return this;
	}
	
	public Citizenship_Application_pages Catagory_List()
	{
		WebElement Catagoty=driver.findElement(Page_className);
		
		WebElement getIt_ready=Catagoty.findElement(N_400);
		lb.highLightElement(driver, getIt_ready);
		lb.print("Prepare Your US Citizenship Application Online.");
		
		WebElement Online_Complite=Catagoty.findElement(Citizenship);
		lb.highLightElement(driver, Online_Complite);
		lb.print("Apply For US Citizenship Online. Complete Form N-400.");
		
		WebElement Complite_correctly=Catagoty.findElement(OnlineApp);
		lb.highLightElement(driver, Complite_correctly);
		lb.print("Prepare and Complete Your Citizenship Form Correctly.");
		
		WebElement Official_form=Catagoty.findElement(Online_Government_From);
		lb.highLightElement(driver, Official_form);
		lb.print("US Citizenship Application Online. Official Government Forms.");
		
		WebElement Online_N565_form=Catagoty.findElement(Certificate);
		lb.highLightElement(driver, Online_N565_form);
		lb.print("Online Application Form N-600 For US Citizenship.");
		
		WebElement Replacement=Catagoty.findElement(N_565);
		lb.highLightElement(driver, Replacement);
		lb.print("Complete Application To Replace US Citizenship Certificate");
		
		WebElement pass=Catagoty.findElement(Test);
		lb.highLightElement(driver, pass);
		lb.print("Pass Your US Citizenship Test & Interview. Get Expert Tips And A Practice Interview.");
		
		WebElement Easy_steps=Catagoty.findElement(Forms);
		lb.highLightElement(driver, Easy_steps);
		lb.print("Apply Online For US Citizenship. Easy, Step-By-Step Form N-400.");
		
		lb.print("");
		
		
		return this;
	}
	
	
	
	
	
	
	
	
	

}
