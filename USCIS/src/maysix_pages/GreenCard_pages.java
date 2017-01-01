package maysix_pages;

//import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GreenCard_pages  extends Base_pages{
	
	By Page_className=By.className("main-content");
	By First_tage=By.tagName("p");
	By tage=By.tagName("div");
	
	By Manu=By.className("left-nav");
	By Green_Card_paper=By.linkText("Green Card");
	
	By Renewal=By.linkText("Green Card Renewal");
	By Replace=By.linkText("Replace Lost or Stolen Green card");
	By Application=By.linkText("Green Card Application");
	By Parents=By.linkText("Green Card For Parents");
	By Family_Member=By.linkText("Green Card For Family Member");
	By Sibling=By.linkText("Green Card For Sibling");
	By Marriage=By.linkText("Green Card By Marriage");
	By Lottery=By.linkText("US Green Card Lottery");
	
	

	public GreenCard_pages Green_Card()
	{
		WebElement List5=driver.findElement(Manu);
		WebElement grean_card_secound=List5.findElement(Green_Card_paper);
		lb.highLightElement(driver, grean_card_secound);
		grean_card_secound.click();
		return this;
	}
	public GreenCard_pages title()
	{				
		String Actual=driver.getTitle();
		lb.print("Page title : "+Actual);
		return this;
	}

	public GreenCard_pages Pagename()
	{
		WebElement Catagory=driver.findElement(Page_className);
				
		WebElement pagename=Catagory.findElement(First_tage);
		String pagenamePrint=pagename.getText();
		lb.print("Pagename is : "+pagenamePrint);
		
		return this;
	}
	
	public GreenCard_pages Catagory_List()
	{

		WebElement Catagory=driver.findElement(Page_className);
		
		WebElement Page=Catagory.findElement(tage);
		lb.highLightElement(driver, Page);
		
		WebElement Renewal_green_card=Catagory.findElement(Renewal);
		lb.highLightElement(driver, Renewal_green_card);
		lb.print("Renew Or Replace Expired Green Card. Complete USCIS Form I-90 Online.");
		
		WebElement Replace_greencard=Catagory.findElement(Replace);
		lb.highLightElement(driver, Replace_greencard);
		lb.print("Replace Lost Or Stolen Green Card.");
		
		WebElement GreenCard_application=Catagory.findElement(Application);
		lb.highLightElement(driver, GreenCard_application);
		lb.print("Prepare Your Green Card Online. Applying Is Fast & Easy");
		
		WebElement Greencard_parent=Catagory.findElement(Parents);
		lb.highLightElement(driver, Greencard_parent);
		lb.print("Get A Green Card For Parents Online. Easy, Fast & Affordable,");
		
		WebElement FamilyMember=Catagory.findElement(Family_Member);
		lb.highLightElement(driver, FamilyMember);
		lb.print("Get A Green Card For Family Member Online. Easy, Fast & Affordable, ");
		
		WebElement GreenCard_sibling=Catagory.findElement(Sibling);
		lb.highLightElement(driver, GreenCard_sibling);
		lb.print("Get A Green Card For Brother Or Sister Online. Easy, Fast & Affordable, ");
		
		WebElement Green_card_marital=Catagory.findElement(Marriage);
		lb.highLightElement(driver, Green_card_marital);
		lb.print("Get A Green Card By Marriage Online. Easy, Fast & Affordable, Apply Now!");
				
		WebElement Green_card_lottary=Catagory.findElement(Lottery);
		lb.highLightElement(driver, Green_card_lottary);
		lb.print("Prepare Your Green Card Lottery Registration Online.  Start Now!");
		
		lb.print(" ");
		
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
