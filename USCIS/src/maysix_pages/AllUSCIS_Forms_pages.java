package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AllUSCIS_Forms_pages  extends Base_pages{
	
	
	By Manu=By.className("left-nav");
	By all_Form=By.linkText("View all USCIS Forms");
	
	By Page_className=By.className("main-content");
	By TageNameP=By.tagName("p");
	
	By Instructions=By.linkText("USCIS Forms Online");
	By Renewal=By.linkText("Green Card Renewal");
	By Citizenship=By.linkText("Apply For US Citizenship");
	By Visa=By.linkText("US Visa Forms");
	By GreenCard_Forms=By.linkText("Green Card Forms");
	By Marriage=By.linkText("Green Card By Marriage");
	By I_90=By.linkText("USCIS Form I-90");
	By N_400=By.linkText("USCIS Form N-400");
	
	public AllUSCIS_Forms_pages Application_form()
	{
		WebElement Catagoty=driver.findElement(Manu);
		WebElement tage=Catagoty.findElement(all_Form);
		lb.highLightElement(driver, tage); 
		tage.click();
		
		return this;
	}
	
	public AllUSCIS_Forms_pages Title()
	{
		String Pagetitle=driver.getTitle();
		lb.print(Pagetitle);
		return this;
	}
	
	public AllUSCIS_Forms_pages PageName()
	{
		WebElement Catagoty=driver.findElement(Page_className);
		WebElement Pagename=Catagoty.findElement(TageNameP);
		String Pring=Pagename.getText();
		lb.print(Pring);
		return this;
	}
	
	
	public AllUSCIS_Forms_pages Catagory_List()
	{
		WebElement Catagoty=driver.findElement(Page_className);
		
		WebElement download=Catagoty.findElement(Instructions);
		lb.highLightElement(driver, download);
		lb.print("Apply Or Download USCIS Forms With Step-By-Step Instructions.");
		
		WebElement Stolen=Catagoty.findElement(Renewal);
		lb.highLightElement(driver, Stolen);
		lb.print("Replace Lost Or Stolen Green Card.");
		
		WebElement Step_by_step=Catagoty.findElement(Citizenship);
		lb.highLightElement(driver, Step_by_step);
		lb.print("Apply Online For US Citizenship. Easy, Step-By-Step Form N-400.");
		
		WebElement Tourist=Catagoty.findElement(Visa);
		lb.highLightElement(driver, Tourist);
		lb.print("Get A US Tourist Visa. Step-By-Step Guidance.");
		
		WebElement GreenCard_Instuction=Catagoty.findElement(GreenCard_Forms);
		lb.highLightElement(driver, GreenCard_Instuction);				
		lb.print("Apply For A US Green Card. All Forms and Instructions .");
		
		WebElement Application_mariiage=Catagoty.findElement(Marriage);
		lb.highLightElement(driver, Application_mariiage);
		lb.print("Apply For A Green Card By Marriage. Prepare All Your Forms");
		
		WebElement Renew_replace=Catagoty.findElement(I_90);
		lb.highLightElement(driver, Renew_replace);
		lb.print("Renew Or Replace Expired Green Card. Complete USCIS Form I-90 Online");
		
		WebElement ColpliteForm_online=Catagoty.findElement(N_400);
		lb.highLightElement(driver, ColpliteForm_online);
		lb.print("Apply For US Citizenship Online. Complete Form N-400");
				
		
		lb.print("");
		return this;
	}
	
	

}
