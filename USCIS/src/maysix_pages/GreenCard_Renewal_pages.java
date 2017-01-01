package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GreenCard_Renewal_pages extends Base_pages{
	
	By Manu=By.className("left-nav");
	By Green_card=By.linkText("Green Card Renewal");
	
	By Page_className=By.className("main-content");
	By TagenameP=By.tagName("p");
	By Tage=By.tagName("div");
	
	By Renewal=By.linkText("Green Card Renewal Online");
	By Replace=By.linkText("Replace Green Card");
	By Form_I_90=By.linkText("Form I-90");
	By Forms=By.linkText("Green Card Forms");
	By Lottery=By.linkText("Green card Lottery");
	
	public GreenCard_Renewal_pages Greencard_renuew()
	{
		WebElement List3=driver.findElement(Manu);
		WebElement Green_card_renuew=List3.findElement(Green_card);
		lb.highLightElement(driver, Green_card_renuew);
		Green_card_renuew.click();
		return this;
	}
	
	public GreenCard_Renewal_pages Titel()
	{
		String Actual=driver.getTitle();
		lb.print("Page title : "+Actual);
		
		return this;
	}
	
	public GreenCard_Renewal_pages Pagename()
	{
		WebElement Catagory=driver.findElement(Page_className);
		WebElement Page_name=Catagory.findElement(TagenameP);
		String Pagename=Page_name.getText();
		lb.print(Pagename);
	
		return this;
	}
	
	public GreenCard_Renewal_pages Catagory_List()
	{
		WebElement Catagory=driver.findElement(Page_className);
		
		WebElement Renew_Replace=Catagory.findElement(Renewal);
		lb.highLightElement(driver, Renew_Replace);
		lb.print("Renew Or Replace Expired Green Card. Complete USCIS Form I-90 Online");
		
		WebElement Prepare_Complete=Catagory.findElement(Replace);
		lb.highLightElement(driver, Prepare_Complete);
		lb.print("Apply To Replace Green Card Online. Prepare & Complete Form I-90");
		
		WebElement Renewal_Replacement=Catagory.findElement(Form_I_90);
		lb.highLightElement(driver, Renewal_Replacement);
		lb.print("Prepare Green Card Renewal & Replacement Online");
		
		WebElement GreenCard_Forms=Catagory.findElement(Forms);
		lb.highLightElement(driver, GreenCard_Forms);
		lb.print("Get Green Card Forms Online. Step-By-Step Instructions.");
		
		WebElement Register=Catagory.findElement(Lottery);
		lb.highLightElement(driver, Register);
		lb.print("Register for the Diversity Lottery. 50,000 yearly winners");
		
		lb.print("");
		return this;
	}

	
	
	
	
	

}
