package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import static org.junit.Assert.assertEquals;

public class CITIZENSHIP_pages extends Base_pages {
	
	
	By main_manu= By.className("main-content");
	By First_tage=By.tagName("p");
	By secound_tage=By.tagName("h2");
	By Citizenpages_Manu=By.className("left-nav");
	By Citizenship= By.linkText("US Citizenship");
	
	By Apply_US_Citizenship=By.linkText("Apply for U.S. Citizenship");
	By FOrm_N400=By.linkText("Form N-400 Online");
	By Certificate_Citizenship=By.linkText("Certificate Of Citizenship - Form N-600");
	By Form_N565=By.linkText("USCIS Form N-565");
	By passtest=By.linkText("Pass The US Citizenship Test");
	By thard_tage=By.tagName("div");
	
	public CITIZENSHIP_pages Citizenpage()
	{
				
		WebElement List1=driver.findElement(Citizenpages_Manu);
		WebElement Citizen=List1.findElement(Citizenship);
		lb.highLightElement(driver, Citizen);
		Citizen.click();
		
		return this;
	}
	
	public CITIZENSHIP_pages Title()
	{
		String Actualtitle=driver.getTitle();
		lb.print("title of this page : "+Actualtitle);
		return this;
	}
	
	public CITIZENSHIP_pages validate()
	{
		
		WebElement Catagory=driver.findElement(main_manu);
		WebElement pagename=Catagory.findElement(First_tage);
		String pagenamePrint=pagename.getText();
		lb.print("Pagename is : "+pagenamePrint);
		
		return this;
	}
	
	public CITIZENSHIP_pages Catagory_List()
	{
		//Highliting the pages
		
		WebElement Catagory=driver.findElement(main_manu);
		WebElement detail=Catagory.findElement(thard_tage);
		lb.highLightElement(driver,detail );
		
		
		
		WebElement Catagory1=driver.findElement(main_manu);
		WebElement firstlink=Catagory1.findElement(Apply_US_Citizenship);
		lb.highLightElement(driver, firstlink);
		lb.print("Complete Your US Citizenship Application Online");
		
		WebElement Catagory2=driver.findElement(main_manu);
		WebElement Secound_link=Catagory2.findElement(FOrm_N400);
		lb.highLightElement(driver, Secound_link);
		lb.print("Apply For US Citizenship Online");

		WebElement Catagory3=driver.findElement(main_manu);
		WebElement Thard_link=Catagory3.findElement(Certificate_Citizenship);
		lb.highLightElement(driver, Thard_link);
		lb.print("Online Application Form N-600 For US Citizenship.");
		
		WebElement forth_link=Catagory1.findElement(Form_N565);
		lb.highLightElement(driver, forth_link);
		lb.print("Complete Application To Replace US Citizenship Certificate");
		
		WebElement Catagory5=driver.findElement(main_manu);
		WebElement Fifth=Catagory5.findElement(passtest);
		lb.highLightElement(driver, Fifth);
		lb.print("Pass Your US Citizenship Test & Interview.");
		
		lb.print(" ");
		
		
		return this;
	}
	
	
	
}
