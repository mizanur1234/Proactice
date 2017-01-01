package maysix_pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage_RightList extends Base_pages{

	
	By HomePage_Right_className=By.className("right-nav");
	
	By apply=By.linkText("Apply for US Citizenship");
	By Certificate=By.linkText("Replace Your Certificate of Citizenship");
	By Citizenship_Interview=By.linkText("Pass the Citizenship Test & Interview");
	By Renew=By.linkText("Renew or Replace Green Card");		
	By Green_Card_Lottery = By.linkText("Green Card Lottery");
	By Green_Card_Employment=By.linkText("Green Card Through Employment");
	By Fiancé =By.linkText("Fiancé Visa");
	By Family_Member=By.linkText("Get Green Card for Family Member");
	By Childhood=By.linkText("Apply for Deferred Action for Childhood Arrivals");        
	By Status=By.linkText("Check Status");
	By pass_fail_INfo=By.linkText("Infopass");
	By TagenameH=By.tagName("h2");
	
	
	public HomePage_RightList Title()
	{
		String Actualtitle=driver.getTitle();
		lb.print("title of this page : "+Actualtitle);
		
		return this;
	}
	
	public HomePage_RightList Pagename()
	{
		WebElement Catagory1=driver.findElement(HomePage_Right_className);
		WebElement cupture=Catagory1.findElement(TagenameH);
		String text=cupture.getText();
		lb.print("List name is : "+text);
		
		return this;
	}
	
	public HomePage_RightList Catagory_Rightlist()
	{
				
		WebElement Catagory1=driver.findElement(HomePage_Right_className);
		
			
		WebElement application = Catagory1.findElement(apply);
		lb.highLightElement(driver, application);
				
		WebElement list1 = Catagory1.findElement(Certificate);
		lb.highLightElement(driver, list1);

		WebElement list2 = Catagory1.findElement(Citizenship_Interview);
		lb.highLightElement(driver, list2);

		WebElement list3 = Catagory1.findElement(Renew);
		lb.highLightElement(driver, list3);

		WebElement list4 = Catagory1.findElement(Green_Card_Lottery);
		lb.highLightElement(driver, list4);

		WebElement list5 = Catagory1.findElement(Green_Card_Employment);
		lb.highLightElement(driver, list5);

		WebElement list6 = Catagory1.findElement(Fiancé);
		lb.highLightElement(driver, list6);
		
		WebElement list7 = Catagory1.findElement(Family_Member);
		lb.highLightElement(driver, list7);

		WebElement list8 = Catagory1.findElement(Childhood);
		lb.highLightElement(driver, list8);

		WebElement list9 = Catagory1.findElement(Status);
		lb.highLightElement(driver, list9);

		WebElement list10 = Catagory1.findElement(pass_fail_INfo);
		lb.highLightElement(driver, list10);
		
		lb.print(" ");
		
		return this;
	}
	
}
