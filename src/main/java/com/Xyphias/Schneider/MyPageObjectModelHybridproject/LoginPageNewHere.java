package com.Xyphias.Schneider.MyPageObjectModelHybridproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Xyphias.Schneider.testbase.TestBase;

public class LoginPageNewHere extends TestBase{
	
	
	@FindBy(xpath="//input[@placeholder='Username']")
	
	 WebElement LoginPageUserName;
	
       @FindBy(xpath="//input[@placeholder='Username']//following::input")
	
	WebElement  LoginPagePassword;
	
	@FindBy(xpath="//input[contains(@type,'sub')]")

     WebElement  Submit;

      @FindBy(xpath="//a[@class='navbar-brand']//img[@class='img-responsive']")

        WebElement UserLabelLogo;
      
      
      public LoginPageNewHere() {
    	  
    	  PageFactory.initElements(driver, this);
      }
	
      
      public String VerifyLoginPageNewHereTitle() {
    	  
    	 return driver.getTitle();
      }
      
         public boolean VerifyLoginPageNewHereLogo() {
        	 
        	 return this.UserLabelLogo.isDisplayed();
         }
	
      public HomePageNewHere LoginPageToHomePageNewHere(String userpass, String pwd) {
                    	   
                    	   this.LoginPageUserName.sendKeys(userpass);
                    	   this.LoginPagePassword.sendKeys(pwd);
                    	   this.Submit.click();
                    	   
                    	   return new HomePageNewHere();
                    	   
                       }
                      
}
