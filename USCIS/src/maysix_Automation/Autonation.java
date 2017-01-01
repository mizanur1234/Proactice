package maysix_Automation;

import org.junit.Test;

import maysix_pages.Adjustment_Status_pages;
import maysix_pages.AllUSCIS_Forms_pages;
import maysix_pages.Apply_Citizenship_pages;
import maysix_pages.Base_pages;
import maysix_pages.CITIZENSHIP_pages;
import maysix_pages.Check_Status_pages;
import maysix_pages.Citizenship_Application_pages;
import maysix_pages.Citizenship_Test_pages;
import maysix_pages.DeferredAction_Childhood_pages;
import maysix_pages.Fiancé_Visa_pages;
import maysix_pages.Forms_pages;
import maysix_pages.FrequintQeustion_pages;
import maysix_pages.GreenCard_Employment_pages;
import maysix_pages.GreenCard_FamilyMember_pages;
import maysix_pages.GreenCard_Lottery_pages;
import maysix_pages.GreenCard_Renewal_pages;
import maysix_pages.GreenCard_pages;
import maysix_pages.HomePage_RightList;
import maysix_pages.Homepages_LeftList;
import maysix_pages.Infopass_pages;
import maysix_pages.RenewReplace_GreenCard_pages;
import maysix_pages.Replace_CitizenshipCertificate_pages;
import maysix_pages.US_Visas_pages;

public class Autonation extends Base_pages{
	
	private Homepages_LeftList home_left= new Homepages_LeftList();
	private HomePage_RightList Home_right=new HomePage_RightList();
	private CITIZENSHIP_pages CITIZENSHIP=new CITIZENSHIP_pages();
	private FrequintQeustion_pages Frequint=new FrequintQeustion_pages();
	private GreenCard_pages GreenCard=new GreenCard_pages();
	private Forms_pages form= new Forms_pages();	
	private GreenCard_Renewal_pages Renewal=new GreenCard_Renewal_pages();
	private US_Visas_pages US_visa=new US_Visas_pages();
	private Citizenship_Application_pages Application=new Citizenship_Application_pages();
	private Adjustment_Status_pages Adjustment=new Adjustment_Status_pages();
	private AllUSCIS_Forms_pages All_forms=new AllUSCIS_Forms_pages();
	private Apply_Citizenship_pages Apply_Cittizen=new Apply_Citizenship_pages();
	private Replace_CitizenshipCertificate_pages Replace_Certificate =new Replace_CitizenshipCertificate_pages();
	private Citizenship_Test_pages Citizen_Certificate=new Citizenship_Test_pages();
	private RenewReplace_GreenCard_pages Renuew_GreenCard= new RenewReplace_GreenCard_pages();
	private GreenCard_Lottery_pages Lottary_greencard=new GreenCard_Lottery_pages();
	private GreenCard_Employment_pages Greencard_employee=new GreenCard_Employment_pages();
	private Fiancé_Visa_pages Fiance_visa=new Fiancé_Visa_pages();
	private GreenCard_FamilyMember_pages GreenCard_Family=new GreenCard_FamilyMember_pages();
	private DeferredAction_Childhood_pages Deferred= new DeferredAction_Childhood_pages();
	private Check_Status_pages ChackStatus= new Check_Status_pages();
	private Infopass_pages Information= new Infopass_pages();
	
	
	
	
	@Test
	public void Automation_test()
	{
		home_left.URL();
		home_left.Title();
		home_left.Pagename();
		home_left.Catagory_Leftlist();
		home_left.Catagory_BottomList();
		Frequint.Quiestions();
		
		Home_right.Title();
		Home_right.Pagename();
		Home_right.Catagory_Rightlist();
		
		
		CITIZENSHIP.Citizenpage();
		CITIZENSHIP.Title();
		CITIZENSHIP.validate();
		CITIZENSHIP.Catagory_List();
		//Frequint.Quiestions();
		
		GreenCard.Green_Card();
		GreenCard.title();
		GreenCard.Pagename();
		GreenCard.Catagory_List();
		//Frequint.Quiestions();
		
		form.forms();
		form.Title();
		form.Pagename();
		form.Catagory_List();
		//Frequint.Quiestions();
		
		Renewal.Greencard_renuew();
		Renewal.Titel();
		Renewal.Pagename();
		Renewal.Catagory_List();
		//Frequint.Quiestions();
		
		US_visa.US_Visa_status();
		US_visa.Title();
		US_visa.Pagename();
		US_visa.Catagory_List();
		//Frequint.Quiestions();
		
		Application.Application_form();
		Application.Title();
		Application.PageName();
		Application.Catagory_List();
		//Frequint.Quiestions();
		
		Adjustment.Adjustment_form();
		Adjustment.Title();
		Adjustment.PageName();
		Adjustment.Catagory_List();
		//Frequint.Quiestions();
		
		All_forms.Application_form();
		All_forms.Title();
		All_forms.PageName();
		All_forms.Catagory_List();
		//Frequint.Quiestions();
		
		Apply_Cittizen.ApplyforUS_Citizenship();
		Apply_Cittizen.Title();
		Apply_Cittizen.PageName();
		Apply_Cittizen.Catagory_List();
		//Frequint.Quiestions();
	
		Replace_Certificate.ReplaceCertificate_Citizenship();
		Replace_Certificate.Title();
		Replace_Certificate.PageName();
		Replace_Certificate.Catagory_List();
		//Frequint.Quiestions();
		
		Citizen_Certificate.CitizenshipTest_Interview();
		Citizen_Certificate.Title();
		Citizen_Certificate.PageName();
		Citizen_Certificate.Catagory_List();
		//Frequint.Quiestions();
		
		Renuew_GreenCard.Adjustment_form();
		Renuew_GreenCard.Title();
		Renuew_GreenCard.PageName();
		Renuew_GreenCard.Catagory_List();
		//Frequint.Quiestions();
		
		
		Lottary_greencard.Replace_GreenCard();
		Lottary_greencard.Title();
		Lottary_greencard.PageName();
		Lottary_greencard.Catagory_List();
		//Frequint.Quiestions();
		
		Greencard_employee.Lottery_GreenCard();
		Greencard_employee.Title();
		Greencard_employee.PageName();
		Greencard_employee.Catagory_List();
		//Frequint.Quiestions();
		
		Fiance_visa.Fiance_visa_applications();
		Fiance_visa.Ttitle();
		Fiance_visa.PageName();
		Fiance_visa.Catagory();
		//Frequint.Quiestions();
		
		GreenCard_Family.GreenCard_applications();
		GreenCard_Family.Ttitle();
		GreenCard_Family.PageName();
		GreenCard_Family.Catagory();
		//Frequint.Quiestions();
		
		Deferred.DeferredAction_applications();
		Deferred.Ttitle();
		Deferred.PageName();
		Deferred.Catagory();
		//Frequint.Quiestions();
		
		ChackStatus.Check_Status_applications();
		ChackStatus.Ttitle();
		ChackStatus.PageName();
		ChackStatus.Catagory();
		//Frequint.Quiestions();
		
		Information.Infopass_applications();
		Information.Ttitle();
		Information.PageName();
		Information.Catagory();
	}//Frequint.Quiestions();
}
