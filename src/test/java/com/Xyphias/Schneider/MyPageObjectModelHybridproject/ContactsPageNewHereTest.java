package com.Xyphias.Schneider.MyPageObjectModelHybridproject;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Xyphias.Schneider.Datadrivenframework.Datadriven;
import com.Xyphias.Schneider.testbase.TestBase;
import com.Xyphias.util.TestUtilHere;

public class ContactsPageNewHereTest extends TestBase{
	
	public ContactsPageNewHere con;
	
	public HomePageNewHere home;
	
	public TestUtilHere util;
	
	public LoginPageNewHere log;
	
	public static Datadriven da;
	
	//public Datadriven data;
	
	public static String SheetNameofExcel = "HelloSheet";
	public ContactsPageNewHereTest() {
		
		super();
		
	}
	
	
	@BeforeMethod
	
	public void ContactsPageNewHereInit() {
		
		InitializeProject();
		
		log = new LoginPageNewHere();
		
		home = new HomePageNewHere();
		
		util = new TestUtilHere();
		
		con = new  ContactsPageNewHere();
		
		home = log.LoginPageToHomePageNewHere(prop.getProperty("username"), prop.getProperty("password"));
		
	
		
		util.SwitchFrames();
		
		con = home.ContactsLinkNewHere();
		
		// home.NewContactsLinkHere();
		
		
	}

	
	
	@Test(priority = 2)
	
	public void VerifyContactsPageUserLabelTest() {
		
	         Assert.assertTrue(  con.VerifyContactsPageNewHereUserLabel(), "Wrong Label");
	}
	
	
	
	@DataProvider
	
	public Object[] [] getCRMPROtestData(){
		
		da = new Datadriven();
		
		Object[][] datas = da.getdatahere(SheetNameofExcel);
		
		return datas;
	}
	
	@Test(priority = 1 ,dataProvider= "getCRMPROtestData")
	
	public void CreateNewContactsTest(String Titles, String Firstname , String MidNames, String Surnames , String CompanyNames) {
		
	home.NewContactsLinkHere();
	  
	
	   con.CreateNewLeads(Titles, Firstname, MidNames, Surnames, CompanyNames);
	
	
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
}
