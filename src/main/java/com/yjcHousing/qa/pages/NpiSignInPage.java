package com.yjcHousing.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yjcHousing.qa.base.TestBase;

public class NpiSignInPage extends TestBase {
	
	// page factory ------ Object Repository
	
	@FindBy(xpath="//input[@id='username']")
	WebElement USERNAME;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement PASSWORD;
	
	@FindBy(xpath = "//input[@type='button' and @value='Sign in']")
	WebElement SignIn;
	
	//Initialize this page objects
	
	public NpiSignInPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	// Actions
	
	public String npiSignInPageTitle()
	{
		String title= driver.getTitle();
		return title;
	}
	
	public HomePage SignIn(String userName, String Password)
	{
		USERNAME.sendKeys(userName);
		PASSWORD.sendKeys(Password);
		SignIn.click();
		return new HomePage();
		
	}

}
