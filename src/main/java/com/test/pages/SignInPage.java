package com.test.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.test.config.PageBase;
import com.test.pageobjects.SignInPageObject;

public class SignInPage extends PageBase {

	SignInPageObject signInPageObject = new SignInPageObject();

	public SignInPage(RemoteWebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, signInPageObject);
	}

	public void clickOnSignInButton() {
		
		clickOnElementUsingJquery(driver, signInPageObject.getSignInButton());
	}

	public void enterEmail(String text) {
		enterTextOnElement(signInPageObject.getEmailCreate(), text);
	}

	public void clickOnCreateAccount() {
		clickOnElement(signInPageObject.getCreateAnAccount());
	}

	public void selectTitle(String text) {
		try {
			
			List<WebElement> titleList = signInPageObject.getTitle();
			for (WebElement titles : titleList) {
				waitForElementDisplayed(driver, titles, 20, 2);
				if (titles.getText().contains(text)) {
					titles.click();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enterCustomerFirstName(String text) {
		enterTextOnElement(signInPageObject.getCustomerFirstName(), text);
	}
	
	public void enterCustomerLastName(String text) {
		enterTextOnElement(signInPageObject.getCustomerLastName(), text);
	}
	
	public void enterCustomerPassword(String text) {
		enterTextOnElement(signInPageObject.getPassword(), text);
	}
	
	public void enterFirstName(String text) {
		signInPageObject.getYourAddressFirstName().clear();
		enterTextOnElement(signInPageObject.getYourAddressFirstName(), text);
	}
	
	public void enterLastName(String text) {
		signInPageObject.getYourAddressFirstName().clear();
		enterTextOnElement(signInPageObject.getYourAddressLastName(), text);
	}
	
	public void enterCompanyName(String text) {
		enterTextOnElement(signInPageObject.getYourAddressCompany(), text);
	}
	
	public void enterAddress(String text) {
		enterTextOnElement(signInPageObject.getYourAddressAddress(), text);
	}
	
	public void enterCity(String text) {
		enterTextOnElement(signInPageObject.getYourAddressCity(), text);
	}
	
	public void selectState(String text) {
//		List<WebElement> stateList=signInPageObject.getYourAddressState();
//		for(WebElement states: stateList) {
//			if(states.getText().contains(text)) {
//				Select select = new Select(states);
//				select.selectByVisibleText(text);
//			}
//		}
		Select select = new Select(signInPageObject.getYourAddressState());
		select.selectByVisibleText(text);
	}

	public void enterZipCode(String text) {
		enterTextOnElement(signInPageObject.getYourAddressPostCode(), text);
	}
	
	public void selectCountry(String text) {
		Select select = new Select(signInPageObject.getYourAddressCountry());
		select.selectByVisibleText(text);
	}
	
	public void enterMobileNo(String text) {
		enterTextOnElement(signInPageObject.getYourAddressMobileNo(), text);
	}
	
	public void enterAddressAlias(String text) {
		signInPageObject.getYourAddressAlias().clear();
		enterTextOnElement(signInPageObject.getYourAddressAlias(), text);
	}
	
	public String getPageHeading() {
		return getTextOnLocator(signInPageObject.getPageHeading());
	}
	
	public void clickOnCreateAccountButton() {
		clickOnElement(signInPageObject.getYourAddressRegister());
	}
	
	public String getMyAccountHeading() {
		return getTextOnLocator(signInPageObject.getMyAccountHeading());
	}
}
