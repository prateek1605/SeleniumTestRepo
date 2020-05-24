package com.test.commons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import static org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS;

public class CommonFunctionsPage {
	
	 public RemoteWebDriver driver;

	    public CommonFunctionsPage(RemoteWebDriver driver) {
	        this.driver = driver;
	    }


	    public static boolean waitForElementDisplayed(WebDriver driver, By locator, long timeLimitInSec, long pollingTimeSec) {
	        try {
	            Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(timeLimitInSec, TimeUnit.SECONDS).pollingEvery(pollingTimeSec, TimeUnit.MILLISECONDS)
	                    .ignoring(org.openqa.selenium.NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
	            return wait.until(dr -> driver.findElement(locator).isDisplayed());
	        } catch (Exception e) {
	            return false;
	        }
	    }

	

	    public void clickOnElement(By locator){
	        try {
	            if (waitForElementDisplayed( driver, locator, 10, 1 ))
	                driver.findElement( locator ).click();
	        }
	        catch (Exception e) {
	            e.printStackTrace(  );
	            Assert.fail( "Unable to click on element with locator:  " + locator.toString() );
	        }

	    }

	    public void enterTextOnElement(By locator, String text){
	        try {
	            clickOnElement( locator );
	            driver.findElement( locator ).clear();
	            driver.findElement( locator ).sendKeys( text );
	        }
	        catch (Exception e){
	            e.printStackTrace(  );
	            Assert.fail( "Unable to enter text on element with locator:  "+locator.toString() );
	        }
	    }

	    public String getTextOnElement(By locator){
	        try {
	            if (waitForElementDisplayed( driver, locator, 10, 1 ))
	                return driver.findElement( locator ).getText().trim();
	        }
	        catch (Exception e) {
	            e.printStackTrace(  );
	            Assert.fail( "Unable to fetch text on element with locator:  " + locator.toString() );
	        }
	        return "";
	    }

	 
	   
	    
	    public static void maximizeBrowserScreen(RemoteWebDriver driver) {
	        if (IS_OS_WINDOWS)
	            driver.manage().window().maximize();
	         else
	        	 driver.manage().window().maximize();
	    }

}
