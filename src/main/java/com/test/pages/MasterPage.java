package com.test.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.config.PageBase;
import com.test.pageobjects.MasterPageObjects;

public class MasterPage extends PageBase{
	
	MasterPageObjects masterPageObjects= new MasterPageObjects();

	public MasterPage(RemoteWebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, masterPageObjects);
	}

	
	public void clickOnWomensTab() {
		clickOnElement(masterPageObjects.getWomensSectionTab());
	}
	
	public void selectItems(int index) {
		List<WebElement> items=masterPageObjects.getGridViewItemsList();
		List<WebElement> items1=masterPageObjects.getClickOnItems();
		items.get(index).click();
		items1.get(index).click();		
	}
	
	public void selectNoOfItemsToPurchase(int quantity) {
		String s=getAttributeValueForElement(masterPageObjects.getQuantityWanted(), "value");
		System.out.println(s);
		int s1=Integer.valueOf(s);
		if(s1 == quantity-1) {
			clickOnElement(masterPageObjects.getPlusIcon());
			
		}
	}
	
	public String getPrice() {
		return getTextOnLocator(masterPageObjects.getGetPrice());
	}
	
	public void clickOnAddToCartButton() {
		clickOnElement(masterPageObjects.getAddToCartButton());
	}
	
	public String getTotalPrice() {
		return getTextOnLocator(masterPageObjects.getTotalProductPrice());	
	}
	
	public void clickOnProceedToCheckout() {
		clickOnElement(masterPageObjects.getProceedToCheckout());
		
		
	}
	
	public void clickOnPaymentPageProceedToCheckout() {
		clickOnElement(masterPageObjects.getPaymentPageProceedToCheckout());
	}
	
	public void clickOnAddressPageProceedToCheckout() {
		clickOnElement(masterPageObjects.getAddressPageProceedToCheckout());
	}
	
	public void clickOnAgreeCheckBox() {
		clickOnElement(masterPageObjects.getAgreeCheckBox());
	}
	
	public void clickOnShippingPageProceedToCheckout() {
		clickOnElement(masterPageObjects.getShippingPageProceedToCheckout());
	}
	
	public String getPaymentPageTotalPrice() {
		return getTextOnLocator(masterPageObjects.getPaymentPageTotalPrice());
	}
	
	public void selectPaymentGateway(String s) {
		List<WebElement> s1= masterPageObjects.getSelectPaymentGateway();
		for(WebElement gateway:s1) {
			if(getAttributeValueForElement(gateway, "title").contains(s)) {
				gateway.click();
			}
		}
	}
	
	public void clickOnConfirmOrder() {
		clickOnElement(masterPageObjects.getConfirmMyOrder());
	}
	
	public void switchToFrame() {
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		if(size>0) {
			driver.switchTo().frame(0);
		}
	}
	
	public String getShippingCost() {
		return getTextOnLocator(masterPageObjects.getShippingCost());
	}
}
