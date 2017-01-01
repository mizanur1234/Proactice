package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Adjustment_Status_pages extends Base_pages {

	By Manu=By.className("left-nav");
	By Adjustment_Status=By.linkText("Adjustment of Status for Green Card (Form I-485)");
	
	By Page_className=By.className("main-content");
	By TageNameP=By.tagName("p");
	
	By Adjustment=By.linkText("USCIS Form I-485 - Adjustment Of Status");
	By Petition=By.linkText("Immigrant Petition Form I-130");
	By Family_Based=By.linkText("Family Based Green Card Forms");
	By Marriage=By.linkText("Green Card By Marriage");
	By Status=By.linkText("Adjustment Of Status");
	By Parents=By.linkText("Green Card For Parents");
	By Sibling=By.linkText("Green Card For Brother Or Sister");
	By Green_Card_Forms=By.linkText("Green Card Forms");
	
	public Adjustment_Status_pages Adjustment_form()
	{
		WebElement Catagoty=driver.findElement(Manu);
		WebElement tage=Catagoty.findElement(Adjustment_Status);
		lb.highLightElement(driver, tage); 
		tage.click();
		return this;
	}
	
	public Adjustment_Status_pages Title()
	{
		String pagetitle=driver.getTitle();
		lb.print(pagetitle);
		return this;
	}
	
	public Adjustment_Status_pages PageName()
	{
		WebElement Catagoty=driver.findElement(Page_className);
		WebElement Pagename=Catagoty.findElement(TageNameP);
		String Pring=Pagename.getText();
		lb.print(Pring);
		return this;
	}
	
	
	public Adjustment_Status_pages Catagory_List()
	{
		WebElement Catagoty=driver.findElement(Page_className);
		
		WebElement N_458=Catagoty.findElement(Adjustment);
		lb.highLightElement(driver, N_458);
		lb.print("Apply For Green Card By Adjustment Of Status Form I-485");
		
		WebElement Sponsor=Catagoty.findElement(Petition);
		lb.highLightElement(driver, Sponsor);
		lb.print("Sponsor Family Member For A Green Card. Start Form I-130 Online");
		
		WebElement GreenCard_family=Catagoty.findElement(Family_Based);
		lb.highLightElement(driver, GreenCard_family);
		lb.print("Prepare Your Green Card For Family Online. Applying Is Fast & Easy.");
		
		WebElement Apply_Marriage=Catagoty.findElement(Marriage);
		lb.highLightElement(driver, Apply_Marriage);
		lb.print("Apply For A Green Card By Marriage. Prepare All Your Forms Online");
		
		WebElement I_485=Catagoty.findElement(Status);
		lb.highLightElement(driver, I_485);
		lb.print("Adjust Your Status To Green Card. Complete Form I-485 Online");
		
		WebElement parent=Catagoty.findElement(Parents);
		lb.highLightElement(driver, parent);
		lb.print("Prepare Your Parent's Green Card Online. Fast & Easy. Apply");
		
		WebElement Sibling_Sponsor=Catagoty.findElement(Sibling);
		lb.highLightElement(driver, Sibling_Sponsor);
		lb.print("Sponsor Your Brother Or Sister For A Green Card.");
		
		WebElement Resources=Catagoty.findElement(Green_Card_Forms);
		lb.highLightElement(driver, Resources);
		lb.print("Green Card Applications & Resources.");
		
		lb.print(" ");
		
		return this;
	}
	
	
	
}
