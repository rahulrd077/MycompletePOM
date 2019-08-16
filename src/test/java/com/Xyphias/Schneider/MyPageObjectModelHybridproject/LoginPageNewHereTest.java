package com.Xyphias.Schneider.MyPageObjectModelHybridproject;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Xyphias.Schneider.testbase.TestBase;

public class LoginPageNewHereTest extends TestBase{
	
	public LoginPageNewHere log;
	
	public HomePageNewHere home;
	
	
	
	
	
	public LoginPageNewHereTest() {
		
		super();
	}
	
	@BeforeTest
	
	public void StartLoginHere() {
		
		InitializeProject();
		
		log = new LoginPageNewHere();
		
		//home = new HomePageNewHere();
		
		//home = log.LoginPageToHomePageNewHere(prop.getProperty("username"), prop.getProperty("password"));
		
		
		
	}
	
	  @Test(priority = 3)
	  
	  public void VerifyLoginPageNewHereToHomePageNewHereTest() {
		  
		 home = log.LoginPageToHomePageNewHere(prop.getProperty("username"), prop.getProperty("password")) ;
	  }
	  
	  
	  @Test(priority =1)
	  
	  public void VerifyLoginPageNewHereTitleTest() {
		 // String actualTitle = "CRMPRO  - CRM software for customer relationship management, sales, and support." ;
		Assert.assertEquals(  log.VerifyLoginPageNewHereTitle(), driver.getTitle() , "wrong title");
	  }

	  
	  @Test(priority =2)
	  
	  public void VerifyLoginPageNewHereLogoTest() {
		  
		  
		 Assert.assertTrue( log.VerifyLoginPageNewHereLogo(), "WRONG LOGO");
	  }
	  
	  
	  @AfterTest
	  
	  public void TearDown() {
		  
		  driver.quit();
	  }
}
