package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Check_Status_pages extends Base_pages{

	
	By HomePage_Right_className=By.className("right-nav");
	By Status=By.linkText("Check Status");
	
	By Page_className=By.className("main-content");
	By TageNameP=By.tagName("p");
	
	By Forms_Online=By.linkText("USCIS Forms Online");
	By Renewal=By.linkText("Green Card Renewal");
	By Citizenship=By.linkText("Apply For US Citizenship");
	By Application=By.linkText("Green Card Application");
	By I_130=By.linkText("Immigrant Petition Form I-130");
	By Tourist=By.linkText("US Tourist Visa");
	By Family=By.linkText("Green Card Through Family");
	By Lottery=By.linkText("Green Card Lottery");
	
	
	public Check_Status_pages Check_Status_applications()
	{
		WebElement Catagory1=driver.findElement(HomePage_Right_className);
		WebElement Statuse_cheking = Catagory1.findElement(Status);
		lb.highLightElement(driver, Statuse_cheking);
		Statuse_cheking.click();

		return this;
	}

	public Check_Status_pages Ttitle()
	{
		String Actual=driver.getTitle();
		lb.print("Page title : "+Actual);
		
		return this;
	}

	public Check_Status_pages PageName()
	{
		WebElement Catagoty=driver.findElement(Page_className);
		WebElement Pagename=Catagoty.findElement(TageNameP);
		String Pring=Pagename.getText();
		lb.print(Pring);
		return this;
	}

	public Check_Status_pages Catagory()
	{
		WebElement Catagory1=driver.findElement(Page_className);
		
		WebElement Download_Instructions=Catagory1.findElement(Forms_Online);
		lb.highLightElement(driver, Download_Instructions);
		lb.print("Apply Or Download USCIS Forms With Step-By-Step Instructions.");
		
		WebElement Stolen=Catagory1.findElement(Renewal);
		lb.highLightElement(driver, Stolen);
		lb.print("Replace Lost Or Stolen Green Card");
		
		WebElement Steps_CitizenShip=Catagory1.findElement(Citizenship);
		lb.highLightElement(driver, Steps_CitizenShip);
		lb.print("Apply Online For US Citizenship. Easy, Step-By-Step Form N-400.");
		
		WebElement CreenCard_Applications=Catagory1.findElement(Application);
		lb.highLightElement(driver, CreenCard_Applications);
		lb.print("Prepare Your Green Card Online. Applying Is Fast & Easy. ");
		
		WebElement FAmily_member=Catagory1.findElement(I_130);
		lb.highLightElement(driver, FAmily_member);
		lb.print("Sponsor Family Member For A Green Card. Start Form I-130");
		
		WebElement Tourist_visa=Catagory1.findElement(Tourist);
		lb.highLightElement(driver, Tourist_visa);
		lb.print("Apply For A US Tourist Visa. All Forms Have Simple, Step-By-Step Instructions");
		
		WebElement Easy_Family=Catagory1.findElement(Family);
		lb.highLightElement(driver, Easy_Family);
		lb.print("Get Form I-130 Online For Family. Easy, Fast & Affordable,");
		
		WebElement Register_Diversity=Catagory1.findElement(Lottery);
		lb.highLightElement(driver, Register_Diversity);
		lb.print("Register for the Diversity Lottery. 50,000 yearly winners.");

		lb.print("");
		return this;
	}

}
