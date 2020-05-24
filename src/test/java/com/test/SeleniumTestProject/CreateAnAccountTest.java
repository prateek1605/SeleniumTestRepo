package com.test.SeleniumTestProject;

import com.test.commons.Constants;
import com.test.config.WebUserBaseTest;
import com.test.pages.SignInPage;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class CreateAnAccountTest extends WebUserBaseTest{

	//For running this test change the email id in constant section
	@Test(description="Create an account")
	public void createAccount() {
		SoftAssert sa = new SoftAssert();
		SignInPage signInPage = new SignInPage(driver);
		signInPage.clickOnSignInButton();
		waitForPageTitleToLoad(driver, driver.getTitle(), 10);
		signInPage.enterEmail(Constants.EMAIL_ID);
		signInPage.clickOnCreateAccount();
		sa.assertEquals(signInPage.getPageHeading(), Constants.PAGE_HEADING,"Page heading is not correct");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		signInPage.selectTitle("Mr.");
	
		signInPage.enterCustomerFirstName(Constants.CUSTOMER_FIRST_NAME);
		
		signInPage.enterCustomerLastName(Constants.CUSTOMER_LAST_NAME);
		
		signInPage.enterCustomerPassword(Constants.CUSTOMER_PASSWORD);

//		signInPage.enterFirstName(Constants.FIRST_NAME);
//	
//		signInPage.enterLastName(Constants.LAST_NAME);
		
		signInPage.enterCompanyName(Constants.COMPANY);
		
		signInPage.enterAddress(Constants.ADDRESS);
		
		signInPage.enterCity(Constants.CITY);
	
		signInPage.selectState(Constants.STATE);
		
		signInPage.enterZipCode(Constants.POSTAL_CODE);

		signInPage.selectCountry(Constants.COUNTRY);
	
		signInPage.enterMobileNo(Constants.MOBILE_NO);

		signInPage.enterAddressAlias(Constants.ALIAS);
		
		signInPage.clickOnCreateAccountButton();
		
		sa.assertEquals(signInPage.getMyAccountHeading(), Constants.MY_ACCOUNT,"My account heading not present");
		
		sa.assertAll();
		
		
	}

}
