package com.Xyphias.Schneider.MyPageObjectModelHybridproject;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Xyphias.Schneider.testbase.TestBase;
import com.Xyphias.util.TestUtilHere;

public class HomePageNewHereTest extends TestBase{
	
	public LoginPageNewHere log;
	
	public ContactsPageNewHere contacts;
	
	public TestUtilHere util;
	
	public HomePageNewHere home;
	
	
	public HomePageNewHereTest() {
		
		super();
	}
	
	@BeforeTest
	
	public void HomePageStart() {
		
		InitializeProject();
		
		log = new LoginPageNewHere();
		
		home = new HomePageNewHere();
		
		home = log.LoginPageToHomePageNewHere(prop.getProperty("username"), prop.getProperty("password"));
		
		  util = new TestUtilHere();
		  
		  contacts = new ContactsPageNewHere();
		  
		 // util = new TestUtilHere();
		  
		  //contacts = home.ContactsLinkNewHere();
		
		
	}
	
	@Test(priority=2)
	
	public void VerifyHomePageNewHereUserLabelTest() {
		
		util.SwitchFrames();
		
		Assert.assertTrue(home.VerifyHomePageNewHereUserLabel(), " Not visible");
	}
	
	
	@Test(priority=1)
	
	public void VerifyHomePageNewTitleTest() {
		
	Assert.assertEquals(home.VerifyHomePageNewHereTitle(), "CRMPRO", "Wrong title displayed");
	}
	
	@Test(priority=3)
	
  public void HomePageToContactsPageTest() {
		
		//util.SwitchFrames();
		
		contacts = home.ContactsLinkNewHere();
	}
	
	@Test(priority=4)
	
	public void NewContactsLinkTest() {
	//	util.SwitchFrames();
		
		
		
		home.NewContactsLinkHere();
		
		
	}
	
	@AfterTest
	
	public void TearDownHomePage() {
		
		driver.quit();
	}
}
