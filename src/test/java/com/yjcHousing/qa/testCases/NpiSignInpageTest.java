package com.yjcHousing.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.yjcHousing.qa.base.TestBase;
import com.yjcHousing.qa.pages.HomePage;
import com.yjcHousing.qa.pages.NpiSignInPage;

public class NpiSignInpageTest extends TestBase {
	
	NpiSignInPage npiSignInPage;
	HomePage homepage;
	
	public NpiSignInpageTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		
		 npiSignInPage = new NpiSignInPage();
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		
		driver.quit();
		
	}

	@Test(priority=1)
	public void validateSignInPageTitle()
	{
		String title = npiSignInPage.npiSignInPageTitle();
		Assert.assertEquals(title, "::APSHCL::");
		
	}
	
	@Test(priority=2)
	public void signInTest()
	{
		npiSignInPage.SignIn(prop.getProperty("username"), prop.getProperty("password"));
		
	}
}










