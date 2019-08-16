package com.Xyphias.Schneider.MyPageObjectModelHybridproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Xyphias.Schneider.testbase.TestBase;

public class HomePageNewHere extends TestBase{
	
	
	@FindBy(xpath="//*[text()[contains(.,'Rahul Das')]]")
	WebElement HomePageNewHereUserLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement ContactsHereLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement NewContactsHereLink;
	
	@FindBy(xpath="")
	WebElement aa;
	
	public HomePageNewHere() {
		
		PageFactory.initElements(driver, this);
	}
                
	
	public boolean VerifyHomePageNewHereUserLabel() {
		
	return	this.HomePageNewHereUserLabel.isDisplayed();
	}
	
	public ContactsPageNewHere ContactsLinkNewHere() {
		
		this.ContactsHereLink.click();
		
		return new ContactsPageNewHere();
		
	}
	
	public void  NewContactsLinkHere() {
		
		Actions act = new Actions (driver);
		
		act.moveToElement(this.ContactsHereLink).build().perform();
		
		this.NewContactsHereLink.click();
	}
	
	public String VerifyHomePageNewHereTitle() {
		
		return driver.getTitle();
	}
	
	
	
}
