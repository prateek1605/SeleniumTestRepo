package com.test.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.config.PageBase;
import com.test.config.WebUserBaseTest;
import com.test.pageobjects.LoginPageObject;
import com.test.pageobjects.SignInPageObject;

public class LoginPage extends PageBase{

	LoginPageObject loginPageObject = new LoginPageObject();

	public LoginPage(RemoteWebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, loginPageObject);
	}

	public void enterEmail(String text) {
		enterTextOnElement(loginPageObject.getEmail(), text);
	}
	
	public void enterPassword(String text) {
		enterTextOnElement(loginPageObject.getPassword(), text);
	}
	
	public void clickOnLogin() {
		clickOnElement(loginPageObject.getSubmitLogin());
	}
	
}
