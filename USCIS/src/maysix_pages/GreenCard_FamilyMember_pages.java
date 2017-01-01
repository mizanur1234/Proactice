package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GreenCard_FamilyMember_pages extends Base_pages {

	
	By HomePage_Right_className=By.className("right-nav");
	By Family_Member=By.linkText("Get Green Card for Family Member");
	
	By Page_className=By.className("main-content");
	By TageNameP=By.tagName("p");
	
	By FamilyMember=By.linkText("Green Card For Family Member");
	By Sibling=By.linkText("Green Card For Sibling");
	By Marriage=By.linkText("Green Card By Marriage");
	By Family=By.linkText("Green Card Through Family");
	By Parents=By.linkText("Green Card For Parents");
	By I_130=By.linkText("Immigrant Petition Form I-130");
	By Application=By.linkText("Green Card Application");
	By Adjustment_Status=By.linkText("USCIS Form I-485 - Adjustment Of Status");
	
	
	public GreenCard_FamilyMember_pages GreenCard_applications()
	{
		WebElement Catagory1=driver.findElement(HomePage_Right_className);
				
		WebElement Fiance = Catagory1.findElement(Family_Member);
		lb.highLightElement(driver, Fiance);
		Fiance.click();

		return this;
	}

	public GreenCard_FamilyMember_pages Ttitle()
	{
		String Actual=driver.getTitle();
		lb.print("Page title : "+Actual);
		return this;
	}

	public GreenCard_FamilyMember_pages PageName()
	{
		WebElement Catagoty=driver.findElement(Page_className);
		WebElement Pagename=Catagoty.findElement(TageNameP);
		String Pring=Pagename.getText();
		lb.print(Pring);
		return this;
	}

	public GreenCard_FamilyMember_pages Catagory()
	{
		WebElement Catagory1=driver.findElement(Page_className);
		
		WebElement Affordable= Catagory1.findElement(FamilyMember);
		lb.highLightElement(driver, Affordable);
		lb.print("Get A Green Card For Family Member Online. Easy, Fast & Affordable,");
		
		WebElement Sibling_Applications=Catagory1.findElement(Sibling);
		lb.highLightElement(driver, Sibling_Applications);
		lb.print("Get A Green Card For Brother Or Sister Online. Easy, Fast & Affordable,");
		
		WebElement Easy_Steps=Catagory1.findElement(Marriage);
		lb.highLightElement(driver, Easy_Steps);
		lb.print("Get A Green Card By Marriage Online. Easy, Fast & Affordable");
		
		WebElement Easy_Family=Catagory1.findElement(Family);
		lb.highLightElement(driver, Easy_Family);
		lb.print("Get Form I-130 Online For Family. Easy, Fast & Affordable");
		
		WebElement Parent=Catagory1.findElement(Parents);
		lb.highLightElement(driver, Parent);
		lb.print("Get A Green Card For Parents Online. Easy, Fast & Affordable");
		
		WebElement Family_member_Sponsor=Catagory1.findElement(I_130);
		lb.highLightElement(driver, Family_member_Sponsor);
		lb.print("Sponsor Family Member For A Green Card. Start Form I-130");
		
		WebElement Grren_card_Application=Catagory1.findElement(Application);
		lb.highLightElement(driver, Grren_card_Application);
		lb.print("Prepare Your Green Card Online. Applying Is Fast & Easy");
		
		WebElement Adjustment=Catagory1.findElement(Adjustment_Status);
		lb.highLightElement(driver, Adjustment);
		lb.print("Apply For Green Card By Adjustment Of Status Form I-485");

		lb.print("");
		return this;
	}

}
