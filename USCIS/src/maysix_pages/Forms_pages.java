package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Forms_pages extends Base_pages{
	
	By Manu=By.className("left-nav");
	By Form=By.linkText("USCIS Forms");
	
	By Page_className=By.className("main-content");
	By TagenameP=By.tagName("p");
	By tage=By.tagName("div");
	
	By All_Form=By.linkText("All USCIS Forms");
	By Form_I_90=By.linkText("Form I-90 - Green Card Renewal Online");
	By Form_N_400=By.linkText("Form N-400 - US Citizenship");
	By Form_I_130=By.linkText("Form I-130 - Family Based Green card");
	By Form_I_485=By.linkText("Form I-485 - Adjustment of Status");
	
		public Forms_pages forms()
	{	
		WebElement List2=driver.findElement(Manu);
		WebElement Form_paper=List2.findElement(Form);
		lb.highLightElement(driver, Form_paper);
		Form_paper.click();
		
		return this;
	}	
		
		public  Forms_pages Title()
	{
		String Actual=driver.getTitle();
		lb.print("Page title : "+Actual);
		return this;
	}
		public Forms_pages  Pagename()
		{
			WebElement Catagory=driver.findElement(Page_className);
			WebElement Page_name=Catagory.findElement(TagenameP);
			String Pagename=Page_name.getText();
			lb.print(Pagename);			
			return this;
		}
		
		public Forms_pages Catagory_List()
	{
		WebElement Catagory=driver.findElement(Page_className);
		
		
		WebElement All_USForm=Catagory.findElement(All_Form);
		lb.highLightElement(driver, All_USForm);		
		lb.print("Easy Online Forms For Green Card & Citizenship");
		
		WebElement Green_card_renewal=Catagory.findElement(Form_I_90);
		lb.highLightElement(driver, Green_card_renewal);
		lb.print("Renew Or Replace Expired Green Card. Complete USCIS Form I-90 Online");
		
		WebElement Citizen_form=Catagory.findElement(Form_N_400);
		lb.highLightElement(driver, Citizen_form);
		lb.print("Prepare & Complete Your Citizenship Form Correctly");
		
		WebElement GreenCard_Family=Catagory.findElement(Form_I_130);
		lb.highLightElement(driver, GreenCard_Family);
		lb.print("Prepare Green card for your family member");
		
		WebElement GreenCard_status=Catagory.findElement(Form_I_485);
		lb.highLightElement(driver, GreenCard_status);
		lb.print("Adjust the status of your Green card");
		
		lb.print(" ");
		
		return this;
	}
	
	

}
