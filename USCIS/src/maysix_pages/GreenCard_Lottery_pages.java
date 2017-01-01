package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GreenCard_Lottery_pages extends Base_pages{
	
	
	By HomePage_Right_className=By.className("right-nav");
	By Green_Card_Lottery = By.linkText("Green Card Lottery");
	
	By Page_className=By.className("main-content");
	By TageNameP=By.tagName("p");

	By Lottery=By.linkText("Green Card Lottery");
	By Program=By.linkText("USA Green Card Lottery");
	By DV=By.linkText("US DV Lottery");
	By Registration =By.linkText("US Green Card Lottery");
	By Requirements=By.linkText("Green Card Lottery Requirements");
	By Benefits=By.linkText("Green Card Lottery Benefits");
	By Results=By.linkText("US Green Card Lottery Results");
	By Applications=By.linkText("Green Card Applications");
	
	public GreenCard_Lottery_pages Replace_GreenCard()
	{
		WebElement Catagoty=driver.findElement(HomePage_Right_className);
		WebElement tage=Catagoty.findElement(Green_Card_Lottery);
		lb.highLightElement(driver, tage); 
		tage.click();
		return this;
	}
	
	public GreenCard_Lottery_pages Title()
	{
		String pagetitle=driver.getTitle();
		lb.print(pagetitle);
		return this;
	}
	
	public GreenCard_Lottery_pages PageName()
	{
		WebElement Catagoty=driver.findElement(Page_className);
		WebElement Pagename=Catagoty.findElement(TageNameP);
		String Pring=Pagename.getText();
		lb.print(Pring);
		return this;
	}
	
	
	public GreenCard_Lottery_pages Catagory_List()
	{
	
		WebElement Catagoty=driver.findElement(Page_className);
		
		WebElement Viversity=Catagoty.findElement(Lottery);
		lb.highLightElement(driver, Viversity);
		lb.print("Register for the Diversity Lottery. 50,000 yearly winners.");
		
		WebElement DV_lottery=Catagoty.findElement(Program);
		lb.highLightElement(driver, DV_lottery);
		lb.print("Register for the DV Lottery Program. Get your American ");
		
		WebElement Enter_dv=Catagoty.findElement(DV);
		lb.highLightElement(driver, Enter_dv);
		lb.print("Enter The DV Lottery To Live Work In The US. Get Started");
		
		WebElement GreenCard_Registration=Catagoty.findElement(Registration);
		lb.highLightElement(driver, GreenCard_Registration);
		lb.print("Prepare Your Green Card Lottery Registration Online.");
		
		WebElement Find_Eligibile=Catagoty.findElement(Requirements);
		lb.highLightElement(driver, Find_Eligibile);
		lb.print("Find Out If You're Eligibile For The Green Card Lottery");
		
		WebElement Lottary_Benefits=Catagoty.findElement(Benefits);
		lb.highLightElement(driver, Lottary_Benefits);
		lb.print("Learn About The Green Card Lottery Benefits.");
		
		WebElement Lottary_result=Catagoty.findElement(Results);
		lb.highLightElement(driver, Lottary_result);
		lb.print("Get The Green Card Lottery Results Online. ");
		
		WebElement Steps=Catagoty.findElement(Applications);
		lb.highLightElement(driver, Steps);
		lb.print("US Green Card Forms Online. Step-By-Step Instructions.");
		
		
		lb.print("");
		
		return this;
	}
}
