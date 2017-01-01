package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Infopass_pages extends Base_pages{
	
	By HomePage_Right_className=By.className("right-nav");
	By Info_pass=By.linkText("Infopass");
	
	By Page_className=By.className("main-content");
	By TageNameP=By.tagName("p");
	
	By Immigration=By.linkText("US Immigration Forms Online");
	By Citizenship=By.linkText("Apply For US Citizenship");
	By Renew=By.linkText("Renew Green Card");
	By Application=By.linkText("Green Card Application");
	By I_130=By.linkText("Immigrant Petition Form I-130");
	By Lottery=By.linkText("US Green Card Lottery");
	By Member=By.linkText("Green Card For Family Member");
	By Tourist_Visa=By.linkText("US Tourist Visa");
	
	
	public Infopass_pages Infopass_applications()
	{
		WebElement Catagory1=driver.findElement(HomePage_Right_className);
		WebElement Info = Catagory1.findElement(Info_pass);
		lb.highLightElement(driver, Info);
		Info.click();
		
		return this;
	}

	public Infopass_pages Ttitle()
	{
		String Actual=driver.getTitle();
		lb.print("Page title : "+Actual);
		return this;
	}

	public Infopass_pages PageName()
	{
		WebElement Catagoty=driver.findElement(Page_className);
		WebElement Pagename=Catagoty.findElement(TageNameP);
		String Pring=Pagename.getText();
		lb.print(Pring);
		return this;
	}

	public Infopass_pages Catagory()
	{
		WebElement Catagory1=driver.findElement(Page_className);
		
		
		WebElement Download_form=Catagory1.findElement(Immigration);
		lb.highLightElement(driver, Download_form);
		lb.print("Apply Or Download USCIS Forms With Step-By-Step Instructions.");
		
		WebElement Prepare_Applications=Catagory1.findElement(Citizenship);
		lb.highLightElement(driver, Prepare_Applications);
		lb.print("Prepare & Complete Your Citizenship Form Correctly.");
		
		WebElement Renew_greanCard_online=Catagory1.findElement(Renew);
		lb.highLightElement(driver, Renew_greanCard_online);
		lb.print("Renew Your Green Card Online. Fast & Simple Process.");
		
		WebElement Fast_easy_greenCard=Catagory1.findElement(Application);
		lb.highLightElement(driver, Fast_easy_greenCard);
		lb.print("Prepare Your Green Card Online. Applying Is Fast & Easy.");
		
		WebElement Family_menmer_GreenCard=Catagory1.findElement(I_130);
		lb.highLightElement(driver, Family_menmer_GreenCard);
		lb.print("Sponsor Family Member For A Green Card. Start Form I-130");
		
		WebElement Registration_GreenCard=Catagory1.findElement(Lottery);
		lb.highLightElement(driver, Registration_GreenCard);
		lb.print("Prepare Your Green Card Lottery Registration Online.");
		
		WebElement Family_member=Catagory1.findElement(Member);
		lb.highLightElement(driver, Family_member);
		lb.print("Get A Green Card For Family Member Online. Easy, Fast & Affordable,");
		
		WebElement Tourist_visa_Applications=Catagory1.findElement(Tourist_Visa);
		lb.highLightElement(driver, Tourist_visa_Applications);
		lb.print("Apply For A US Tourist Visa. All Forms Have Simple, Step-By-Step Instructions.");

		lb.print("");
		return this;
	}


}
