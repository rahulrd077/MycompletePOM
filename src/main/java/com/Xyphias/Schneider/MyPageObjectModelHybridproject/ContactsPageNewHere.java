package com.Xyphias.Schneider.MyPageObjectModelHybridproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Xyphias.Schneider.testbase.TestBase;

public class ContactsPageNewHere extends TestBase{
	
	
	@FindBy(xpath="//td[contains(text(),'User: Rahul Das')]")
	WebElement userlabelContactsPage;
	
	@FindBy(xpath="//select[@name='title']")
	WebElement Title;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='middle_initial']")
	WebElement MiddleName;
	
	@FindBy(xpath="//input[@id='surname']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement CompanyName;
	
	@FindBy(xpath="//input[contains(@value,'Save')]")
	WebElement SaveContacts;
	
	
	
	public ContactsPageNewHere() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	 public boolean VerifyContactsPageNewHereUserLabel() {
		 
	return	 this.userlabelContactsPage.isDisplayed();
	 }
	 
	 public void CreateNewLeads(String Titles , String Firstname , String MidNames , String Surnames, String CompanyNames ) {
		 
		 Select sel = new Select(this.Title);
		 
		 sel.selectByVisibleText(Titles);
		 
		 this.FirstName.sendKeys(Firstname);
		 
		 this.MiddleName.sendKeys(MidNames);
		 
		 this.LastName.sendKeys(Surnames);
		 
		 this.CompanyName.sendKeys(CompanyNames);
		 
		 this.SaveContacts.click();
		 
	 }
	

}
