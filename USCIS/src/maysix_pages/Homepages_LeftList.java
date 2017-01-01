package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Homepages_LeftList extends Base_pages {
	
	
	
	By Header=By.className("header-content");
	By Subtext_Logo=By.cssSelector(".logo-sub-text");
		
	By Left_className=By.className("left-nav");
		
	By Citizenship= By.linkText("US Citizenship");
	By Green_Card_paper=By.linkText("Green Card");
	By Form=By.linkText("USCIS Forms");
	By Green_card=By.linkText("Green Card Renewal");
	By visa=By.linkText("US Visas");
	
	By TagenameH=By.tagName("h2");
	By Citizenship_Application=By.linkText("Citizenship Application (Form N-400)");
	By Adjustment_Status=By.linkText("Adjustment of Status for Green Card (Form I-485)");
	By all_Form=By.linkText("View all USCIS Forms");
	
	
	String Webside="http://www.uscis.com/";
		
	public Homepages_LeftList URL()
	{
		driver.navigate().to("http://www.uscis.com/");
		//driver.get(Webside);
		return this;
	}
	
	public Homepages_LeftList Title()
	{
		String Actualtitle=driver.getTitle();
		lb.print("title of this page : "+Actualtitle);
		return this;
	}
	
	public Homepages_LeftList Pagename()
	{
		WebElement PageHeader=driver.findElement(Header);
		WebElement subtext=PageHeader.findElement(Subtext_Logo);
		String PageName=subtext.getText();
		lb.print(PageName);
		
		return this;
	}
	
	public Homepages_LeftList Catagory_Leftlist()
	{
		WebElement Catagory=driver.findElement(Left_className);
		
		WebElement Citizen=Catagory.findElement(Citizenship);
		lb.highLightElement(driver, Citizen);
		
		WebElement grean_card_secound=Catagory.findElement(Green_Card_paper);
		lb.highLightElement(driver, grean_card_secound);
	
		WebElement Form_paper=Catagory.findElement(Form);
		lb.highLightElement(driver, Form_paper);
		
		WebElement Green_card_renue=Catagory.findElement(Green_card);
		lb.highLightElement(driver, Green_card_renue);
		
		WebElement Visa_status=Catagory.findElement(visa);
		lb.highLightElement(driver, Visa_status);
		
		return this;
	}
	
		public Homepages_LeftList Catagory_BottomList ()
	{
		WebElement validate_Text=driver.findElement(Left_className);
		WebElement cupture1=validate_Text.findElement(TagenameH);
		String text_left_secound_half=cupture1.getText();
		lb.print("List name is : "+text_left_secound_half);
		
		
		WebElement tage=validate_Text.findElement(Citizenship_Application);
		lb.highLightElement(driver, tage);
				
		
		WebElement tage2=validate_Text.findElement(Adjustment_Status);
		lb.highLightElement(driver, tage2);
		
		
		WebElement tage3=validate_Text.findElement(all_Form);
		lb.highLightElement(driver, tage3);
		
		lb.print(" ");
		
		 return this;
	}
	
	
	
	
}
