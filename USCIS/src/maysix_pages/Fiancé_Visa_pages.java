package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Fiancé_Visa_pages extends Base_pages {
	
	
	By HomePage_Right_className=By.className("right-nav");
	By Fiancé =By.linkText("Fiancé Visa");
	
	By Page_className=By.className("main-content");
	By TageNameP=By.tagName("p");
	
	By K1=By.linkText("K1 Fiance Visa");
	By Marriage=By.linkText("Green Card By Marriage");
	By Spouse=By.linkText("Green Card For Spouse");
	By Immigrant_Petition=By.linkText("Immigrant Petition Form I-130");
	By Citizenship=By.linkText("Apply For US Citizenship");
	By Application=By.linkText("Green Card Application");
	By US_Visa=By.linkText("Apply For US Visa");
	By US_VISA_FORM=By.linkText("US Visas");
	
	public Fiancé_Visa_pages Fiance_visa_applications()
	{
		WebElement Catagory1=driver.findElement(HomePage_Right_className);
		WebElement Fiance = Catagory1.findElement(Fiancé);
		lb.highLightElement(driver, Fiance);
		Fiance.click();
		return this;
	}

	public Fiancé_Visa_pages Ttitle()
	{
		String Actual=driver.getTitle();
		lb.print("Page title : "+Actual);	
		return this;
	}

	public Fiancé_Visa_pages PageName()
	{
		WebElement Catagoty=driver.findElement(Page_className);
		WebElement Pagename=Catagoty.findElement(TageNameP);
		String Pring=Pagename.getText();
		lb.print(Pring);
		return this;
	}

	public Fiancé_Visa_pages Catagory()
	{
		WebElement Catagory1=driver.findElement(Page_className);
		
		WebElement Pass_test=Catagory1.findElement(K1);
		lb.highLightElement(driver, Pass_test);
		lb.print("Prepare Your K-1 Fiancé(e) Visa Application Online!");
		
		WebElement GreenCard_marriage=Catagory1.findElement(Marriage);
		lb.highLightElement(driver, GreenCard_marriage);
		lb.print("Apply For A Green Card By Marriage. Prepare All Your Forms");
		
		WebElement Get_greencard=Catagory1.findElement(Spouse);
		lb.highLightElement(driver, Get_greencard);
		lb.print("Get A Green Card For Your Spouse. Easy, Fast & Affordable,");
		
		WebElement Family_sponsor=Catagory1.findElement(Immigrant_Petition);
		lb.highLightElement(driver, Family_sponsor);
		lb.print("Sponsor Family Member For A Green Card. Start Form I-130 ");
		
		WebElement Complite_Citizenship=Catagory1.findElement(Citizenship);
		lb.highLightElement(driver, Complite_Citizenship);
		lb.print("Prepare & Complete Your Citizenship Form Correctly.");
		
		WebElement Easy_fast=Catagory1.findElement(Application);
		lb.highLightElement(driver, Easy_fast);
		lb.print("Prepare Your Green Card Online. Applying Is Fast & Easy");
		
		WebElement Steps_Guidance=Catagory1.findElement(US_Visa);
		lb.highLightElement(driver,Steps_Guidance );
		lb.print("Get A US Visa. Step-By-Step Guidance.");
		
		WebElement Guidance=Catagory1.findElement(US_VISA_FORM);
		lb.highLightElement(driver, Guidance);
		lb.print("Easy To Do US Visa Forms Online. Step-By-Step Guidance");

		lb.print("");
		return this;
	}








}

