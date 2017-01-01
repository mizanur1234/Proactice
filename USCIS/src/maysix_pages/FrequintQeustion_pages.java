package maysix_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FrequintQeustion_pages  extends Base_pages{
	
	By Main_manu=By.className("faq");
	By manu=By.className("main-content");
	By tagenameh2=By.tagName("h2");
	By tagenameP=By.tagName("P");
	
	By Renew_green_card=By.linkText("How To Renew an Expired Green Card?");
	By Green_card_lost=By.linkText("What do I do if my Green Card was lost or stolen?");
	By Get_green_card=By.linkText("How to Get a Green Card");
	By Student_visa=By.linkText("How to Get a Student or Tourist Visa");
	By Marriage_visa=By.linkText("Prepare for the Marriage Visa Interview");
	By pass_test=By.linkText("Learn How to Pass the US Citizenship Test & Interview");
	

	public FrequintQeustion_pages Quiestions()
	{
		WebElement catagory=driver.findElement(Main_manu);
		
		WebElement pagename=catagory.findElement(tagenameh2);
		String text=pagename.getText();
		lb.print("This Questions : "+text);
						
		WebElement Quiestion1=catagory.findElement(Renew_green_card);
		lb.highLightElement(driver, Quiestion1);
				
		WebElement Quiestion2=catagory.findElement(Green_card_lost);
		lb.highLightElement(driver, Quiestion2);
		
		WebElement Quiestion3=catagory.findElement(Get_green_card);
		lb.highLightElement(driver, Quiestion3);
		
		WebElement Quiestion4=catagory.findElement(Student_visa);
		lb.highLightElement(driver, Quiestion4);
		
		WebElement Quiestion5=catagory.findElement(Marriage_visa);
		lb.highLightElement(driver, Quiestion5);
		
		WebElement Quiestion6=catagory.findElement(pass_test);
		lb.highLightElement(driver, Quiestion6);
		
		lb.print("All pages has same Questions");
		lb.print(" ");
		return this;
	}
	
	
}
