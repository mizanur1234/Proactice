package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_Visas_pages extends Base_pages {
	
	By Manu=By.className("left-nav");
	By visa=By.linkText("US Visas");
	
	By Page_className=By.className("main-content");
	By TagenameP=By.tagName("p");
	By Tage=By.tagName("div");
	
	By Apply_Visa=By.linkText("Apply For US Visa");
		By Applications=By.linkText("US Visa Applications");
			By Tourist_Visa=By.linkText("US Tourist Visa");
				By Business_Visa=By.linkText("US Business Visa");
					By Extend_Visa=By.linkText("Change or Extend US Visa");
						By Fiance_Visa=By.linkText("K1 Fiance Visa");
							By Family_Visa=By.linkText("US Visa For Family");
								By Students_Visa=By.linkText("US Visa For Students");
									
	public  US_Visas_pages US_Visa_status()
	{
	
		WebElement List4=driver.findElement(Manu);
		WebElement Visa_status=List4.findElement(visa);
		lb.highLightElement(driver, Visa_status);
		Visa_status.click();
		return this;
	}
	
	public US_Visas_pages Title()
	{
		String Page_Title=driver.getTitle();
		lb.print(Page_Title);
		
		return this;
	}
	 
	public US_Visas_pages Pagename()
	{
		WebElement Catagory=driver.findElement(Page_className);
		WebElement Tagename=Catagory.findElement(TagenameP);
		String Pagename=Tagename.getText();
		lb.print(Pagename);
		return this;
	}


	public US_Visas_pages Catagory_List()
	{
		WebElement Catagory=driver.findElement(Page_className);
		
		WebElement Visa_Procces=Catagory.findElement(Apply_Visa);
		lb.highLightElement(driver, Visa_Procces);
		lb.print("Get A US Visa. Step-By-Step Guidance.");
	
		WebElement Visa_Application=Catagory.findElement(Applications);
		lb.highLightElement(driver, Visa_Application);
		lb.print("Easy To Do US Visa Forms Online. Step-By-Step Guidance");
		
		WebElement Tourist=Catagory.findElement(Tourist_Visa);
		lb.highLightElement(driver, Tourist);
		lb.print("Apply For A US Tourist Visa. All Forms Have Simple, Step-By-Step Instructions");
		
		WebElement Business=Catagory.findElement(Business_Visa);
		lb.highLightElement(driver, Business);
		lb.print("Apply For US Business Visa. All Forms Have Simple, Step-By-Step Instructions");
		
		WebElement Extend=Catagory.findElement(Extend_Visa);
		lb.highLightElement(driver, Extend);
		lb.print("Change Or Extend Visa Form I-539 Online.");
		
		WebElement Fiance= Catagory.findElement(Fiance_Visa);
		lb.highLightElement(driver, Fiance);
		lb.print("Prepare Your K-1 Fiancé(e) Visa Application Online!");
		
		WebElement Family=Catagory.findElement(Family_Visa);
		lb.highLightElement(driver, Family);
		lb.print("Start The Family US Visa Process Today. Get Visa Forms & Instructions.");
		
		WebElement Student=Catagory.findElement(Students_Visa);
		lb.highLightElement(driver, Student);
		lb.print("Apply For A Student Visa Online. Simple Step-By-Step Guidance.");
		
		lb.print("");
		return this;
	}
	

}
