package com.test.SeleniumTestProject;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.test.commons.Constants;
import com.test.config.WebUserBaseTest;
import com.test.pages.LoginPage;
import com.test.pages.MasterPage;
import com.test.pages.SignInPage;

public class LoginTest extends WebUserBaseTest{

	@Test(priority=1,description="Login to app")
	public void doLogin() {
		LoginPage loginPage= new LoginPage(driver);
		SignInPage signInPage= new SignInPage(driver);
		signInPage.clickOnSignInButton();
		loginPage.enterEmail(Constants.EMAIL_ID);
		loginPage.enterPassword(Constants.CUSTOMER_PASSWORD);
		loginPage.clickOnLogin();
		Assert.assertEquals(signInPage.getMyAccountHeading(), Constants.MY_ACCOUNT,"My account heading not present");

	}
	
	@Test(priority=2,description="Selct items and do the payment")
	public void selectItemsAndDoPayment() {
		SoftAssert sa= new SoftAssert();
		
		MasterPage masterPage= new MasterPage(driver);
		
		masterPage.clickOnWomensTab();
		
		masterPage.selectItems(0);
		
		masterPage.switchToFrame();
		
		masterPage.selectNoOfItemsToPurchase(2);
		
		String price=masterPage.getPrice();
		
		System.out.println("  Price:"+price);
		
		masterPage.clickOnAddToCartButton();
		  //driver.switchTo().defaultContent();
		String totalPrice=masterPage.getTotalPrice();
		
		System.out.println(" Total Price:"+totalPrice);
		
		masterPage.clickOnProceedToCheckout();
		
		masterPage.clickOnPaymentPageProceedToCheckout();
		
		masterPage.clickOnAddressPageProceedToCheckout();
		
		masterPage.clickOnAgreeCheckBox();
		
		masterPage.clickOnShippingPageProceedToCheckout();
		
		String paymentPageTotalPrice=masterPage.getPaymentPageTotalPrice();
		
		System.out.println("Payment Page Total Price:"+paymentPageTotalPrice);
		
		sa.assertEquals(totalPrice,paymentPageTotalPrice,"Total price is not corret");
		
		masterPage.selectPaymentGateway(Constants.PAY_BY_WIRE);
		
		masterPage.clickOnConfirmOrder();
		
		sa.assertAll();
	}

}
