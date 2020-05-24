package com.test.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageObject {

	@FindBy(css="#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement signInButton;
	
	@FindBy(id="email_create")
	private WebElement emailCreate;
	
	@FindBy(css="#SubmitCreate > span > i")
	private WebElement createAnAccount;
	
	@FindBy(xpath="//label[contains(@class,'top') ]")
	private List<WebElement> title;
	
	@FindBy(id="customer_firstname")
	private WebElement customerFirstName;
	
	@FindBy(id="customer_lastname")
	private WebElement customerLastName;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="firstname")
	private WebElement yourAddressFirstName;
	
	@FindBy(id="lastname")
	private WebElement yourAddressLastName;
	
	@FindBy(id="company")
	private WebElement yourAddressCompany;
	
	@FindBy(id="address1")
	private WebElement yourAddressAddress;
	
	@FindBy(id="city")
	private WebElement yourAddressCity;
	
	@FindBy(xpath="//*[@id='id_state']")
	private WebElement yourAddressState;
	
	@FindBy(id="postcode")
	private WebElement yourAddressPostCode;
	
	@FindBy(xpath="//*[@id='id_country']")
	private WebElement yourAddressCountry;
	
	@FindBy(id="phone_mobile")
	private WebElement yourAddressMobileNo;
	
	@FindBy(id="alias")
	private WebElement yourAddressAlias;
	
	@FindBy(id="submitAccount")
	private WebElement yourAddressRegister;
	
	@FindBy(xpath="//*[@id='create-account_form']/h3")
	private WebElement pageHeading;
	
	@FindBy(xpath="//*[@id='center_column']/h1")
	private WebElement myAccountHeading;
	
	
	
	
	public WebElement getSignInButton() {
		return signInButton;
	}

	public void setSignInButton(WebElement signInButton) {
		this.signInButton = signInButton;
	}

	public WebElement getEmailCreate() {
		return emailCreate;
	}

	public void setEmailCreate(WebElement emailCreate) {
		this.emailCreate = emailCreate;
	}

	public WebElement getCreateAnAccount() {
		return createAnAccount;
	}

	public void setCreateAnAccount(WebElement createAnAccount) {
		this.createAnAccount = createAnAccount;
	}

	public List<WebElement> getTitle() {
		return title;
	}

	public void setTitle(List<WebElement> title) {
		this.title = title;
	}

	public WebElement getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(WebElement customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public WebElement getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(WebElement customerLastName) {
		this.customerLastName = customerLastName;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getYourAddressFirstName() {
		return yourAddressFirstName;
	}

	public void setYourAddressFirstName(WebElement yourAddressFirstName) {
		this.yourAddressFirstName = yourAddressFirstName;
	}

	public WebElement getYourAddressLastName() {
		return yourAddressLastName;
	}

	public void setYourAddressLastName(WebElement yourAddressLastName) {
		this.yourAddressLastName = yourAddressLastName;
	}

	public WebElement getYourAddressCompany() {
		return yourAddressCompany;
	}

	public void setYourAddressCompany(WebElement yourAddressCompany) {
		this.yourAddressCompany = yourAddressCompany;
	}

	public WebElement getYourAddressAddress() {
		return yourAddressAddress;
	}

	public void setYourAddressAddress(WebElement yourAddressAddress) {
		this.yourAddressAddress = yourAddressAddress;
	}

	public WebElement getYourAddressCity() {
		return yourAddressCity;
	}

	public void setYourAddressCity(WebElement yourAddressCity) {
		this.yourAddressCity = yourAddressCity;
	}

	public WebElement getYourAddressState() {
		return yourAddressState;
	}

	public void setYourAddressState(WebElement yourAddressState) {
		this.yourAddressState = yourAddressState;
	}

	public WebElement getYourAddressPostCode() {
		return yourAddressPostCode;
	}

	public void setYourAddressPostCode(WebElement yourAddressPostCode) {
		this.yourAddressPostCode = yourAddressPostCode;
	}

	public WebElement getYourAddressCountry() {
		return yourAddressCountry;
	}

	public void setYourAddressCountry(WebElement yourAddressCountry) {
		this.yourAddressCountry = yourAddressCountry;
	}

	public WebElement getYourAddressMobileNo() {
		return yourAddressMobileNo;
	}

	public void setYourAddressMobileNo(WebElement yourAddressMobileNo) {
		this.yourAddressMobileNo = yourAddressMobileNo;
	}

	public WebElement getYourAddressAlias() {
		return yourAddressAlias;
	}

	public void setYourAddressAlias(WebElement yourAddressAlias) {
		this.yourAddressAlias = yourAddressAlias;
	}

	public WebElement getYourAddressRegister() {
		return yourAddressRegister;
	}

	public void setYourAddressRegister(WebElement yourAddressRegister) {
		this.yourAddressRegister = yourAddressRegister;
	}

	public WebElement getPageHeading() {
		return pageHeading;
	}

	public void setPageHeading(WebElement pageHeading) {
		this.pageHeading = pageHeading;
	}

	public WebElement getMyAccountHeading() {
		return myAccountHeading;
	}

	public void setMyAccountHeading(WebElement myAccountHeading) {
		this.myAccountHeading = myAccountHeading;
	}
	
	
}
