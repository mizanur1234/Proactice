package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GreenCard_Employment_pages extends Base_pages{
	
	By HomePage_Right_className=By.className("right-nav");
	By Green_Card_Employment=By.linkText("Green Card Through Employment");
	
	By Page_className=By.className("main-content");
	By TageNameP=By.tagName("p");
		
	By Employment=By.linkText("Green Card Through Employment");
	By EAD=By.linkText("EAD Form I-765");
	By Work_Visa=By.linkText("Apply For US Work Visa");
	By Authorization=By.linkText("Employment Authorization Doc.");
	By Business=By.linkText("US Business Visa");
	By Visa=By.linkText("Apply For US Visa");
	By Application=By.linkText("Form I-765 Application");
	By Lottery=By.linkText("US Green Card Lottery");
	
	public GreenCard_Employment_pages Lottery_GreenCard()
	{
		WebElement Catagoty=driver.findElement(HomePage_Right_className);
		WebElement tage=Catagoty.findElement(Green_Card_Employment);
		lb.highLightElement(driver, tage); 
		tage.click();
		return this;
	}
	
	public GreenCard_Employment_pages Title()
	{
		String pagetitle=driver.getTitle();
		lb.print(pagetitle);
		return this;
	}
	
	public GreenCard_Employment_pages PageName()
	{
		WebElement Catagoty=driver.findElement(Page_className);
		WebElement Pagename=Catagoty.findElement(TageNameP);
		String Pring=Pagename.getText();
		lb.print(Pring);
		return this;
	}
	
	
	public GreenCard_Employment_pages Catagory_List()
	{
	
		WebElement Catagoty=driver.findElement(Page_className);
		
		WebElement Work=Catagoty.findElement(Employment);
		lb.highLightElement(driver, Work);
		lb.print("Apply For A Green Card Through Employment. Easy, Fast & Affordable!");
		
		WebElement Employment_Authorization=Catagoty.findElement(EAD);
		lb.highLightElement(driver, Employment_Authorization);
		lb.print("Complete Employment Authorization. Apply Or Renew EAD Card ");
		
		WebElement Work_visa_steps=Catagoty.findElement(Work_Visa);
		lb.highLightElement(driver, Work_visa_steps);
		lb.print("Get A US Work Visa. Step-By-Step Guidance.");
		
		WebElement Employee_Document=Catagoty.findElement(Authorization);
		lb.highLightElement(driver, Employee_Document);
		lb.print("Employment Authorization Document Form I-765 Online.");
		
		WebElement Business_visa=Catagoty.findElement(Business);
		lb.highLightElement(driver, Business_visa);
		lb.print("Apply For US Business Visa. All Forms Have Simple, Step-By-Step Instructions.");
		
		WebElement Guidance=Catagoty.findElement(Visa);
		lb.highLightElement(driver, Guidance);
		lb.print("Get A US Visa. Step-By-Step Guidance.");
		
		WebElement Easy_online_form=Catagoty.findElement(Application);
		lb.highLightElement(driver, Easy_online_form);
		lb.print("Easy To DoI-765 EAD Form Online. Step-By-Step Guidance.");
		
		WebElement LOttary_REgistrations=Catagoty.findElement(Lottery);
		lb.highLightElement(driver, LOttary_REgistrations);
		lb.print("Prepare Your Green Card Lottery Registration Online.");
		
		
		lb.print("");
		
		return this;
	}

}
