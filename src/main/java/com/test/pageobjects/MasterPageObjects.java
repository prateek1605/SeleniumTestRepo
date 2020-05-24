package com.test.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPageObjects {

	@FindBy(xpath="//a[contains(@title,'Women')]")
	private WebElement womensSectionTab;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li")
	private List<WebElement> gridViewItemsList;
	
	@FindBy(xpath="//*[@id=\"center_column\"]//a[@class='quick-view']")
	private List<WebElement> clickOnItems;
	
	@FindBy(xpath="//*[@id='quantity_wanted_p']//i[@class='icon-plus']")
	private WebElement plusIcon;
	
	@FindBy(xpath="//*[@id='our_price_display']")
	private WebElement getPrice;
	
	@FindBy(xpath="//*[@id='add_to_cart']/button")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//*[@id='layer_cart']//span[contains(@class,'ajax_block_cart_total')]")
	private WebElement totalProductPrice;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]//a[@title='Proceed to checkout']")
	private WebElement proceedToCheckout;
	
	@FindBy(xpath="//*[@id=\"center_column\"]//a[@title='Proceed to checkout'] ")
	private WebElement paymentPageProceedToCheckout;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
	private WebElement addressPageProceedToCheckout;
	
	@FindBy(xpath="//*[@id='cgv']")
	private WebElement agreeCheckBox;
	
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span")
	private WebElement shippingPageProceedToCheckout;
	
	@FindBy(xpath="//*[@id=\"total_price\"]")
	private WebElement paymentPageTotalPrice;
	
	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]//a")
	private List<WebElement> selectPaymentGateway;
	
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button")
	private WebElement confirmMyOrder;
	
	@FindBy(xpath="//*[@id='quantity_wanted']")
	private WebElement quantityWanted;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]//span[contains(@class,'ajax_cart_shipping_cost')]")
	private WebElement shippingCost;
	
	
	public WebElement getWomensSectionTab() {
		return womensSectionTab;
	}

	public void setWomensSectionTab(WebElement womensSectionTab) {
		this.womensSectionTab = womensSectionTab;
	}

	public List<WebElement> getGridViewItemsList() {
		return gridViewItemsList;
	}

	public void setGridViewItemsList(List<WebElement> gridViewItemsList) {
		this.gridViewItemsList = gridViewItemsList;
	}

	public List<WebElement> getClickOnItems() {
		return clickOnItems;
	}

	public void setClickOnItems(List<WebElement> clickOnItems) {
		this.clickOnItems = clickOnItems;
	}

	public WebElement getPlusIcon() {
		return plusIcon;
	}

	public void setPlusIcon(WebElement plusIcon) {
		this.plusIcon = plusIcon;
	}

	public WebElement getGetPrice() {
		return getPrice;
	}

	public void setGetPrice(WebElement getPrice) {
		this.getPrice = getPrice;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public void setAddToCartButton(WebElement addToCartButton) {
		this.addToCartButton = addToCartButton;
	}

	public WebElement getTotalProductPrice() {
		return totalProductPrice;
	}

	public void setTotalProductPrice(WebElement totalProductPrice) {
		this.totalProductPrice = totalProductPrice;
	}

	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}

	public void setProceedToCheckout(WebElement proceedToCheckout) {
		this.proceedToCheckout = proceedToCheckout;
	}

	public WebElement getPaymentPageProceedToCheckout() {
		return paymentPageProceedToCheckout;
	}

	public void setPaymentPageProceedToCheckout(WebElement paymentPageProceedToCheckout) {
		this.paymentPageProceedToCheckout = paymentPageProceedToCheckout;
	}

	public WebElement getAddressPageProceedToCheckout() {
		return addressPageProceedToCheckout;
	}

	public void setAddressPageProceedToCheckout(WebElement addressPageProceedToCheckout) {
		this.addressPageProceedToCheckout = addressPageProceedToCheckout;
	}

	public WebElement getAgreeCheckBox() {
		return agreeCheckBox;
	}

	public void setAgreeCheckBox(WebElement agreeCheckBox) {
		this.agreeCheckBox = agreeCheckBox;
	}

	public WebElement getShippingPageProceedToCheckout() {
		return shippingPageProceedToCheckout;
	}

	public void setShippingPageProceedToCheckout(WebElement shippingPageProceedToCheckout) {
		this.shippingPageProceedToCheckout = shippingPageProceedToCheckout;
	}

	public WebElement getPaymentPageTotalPrice() {
		return paymentPageTotalPrice;
	}

	public void setPaymentPageTotalPrice(WebElement paymentPageTotalPrice) {
		this.paymentPageTotalPrice = paymentPageTotalPrice;
	}


	public WebElement getConfirmMyOrder() {
		return confirmMyOrder;
	}

	public void setConfirmMyOrder(WebElement confirmMyOrder) {
		this.confirmMyOrder = confirmMyOrder;
	}

	public List<WebElement> getSelectPaymentGateway() {
		return selectPaymentGateway;
	}

	public void setSelectPaymentGateway(List<WebElement> selectPaymentGateway) {
		this.selectPaymentGateway = selectPaymentGateway;
	}

	public WebElement getQuantityWanted() {
		return quantityWanted;
	}

	public void setQuantityWanted(WebElement quantityWanted) {
		this.quantityWanted = quantityWanted;
	}

	public WebElement getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(WebElement shippingCost) {
		this.shippingCost = shippingCost;
	}

	
	
}
