package com.test.config;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.TestListenerAdapter;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class PageBase extends TestListenerAdapter {
   
    public RemoteWebDriver driver;
 


    public PageBase(RemoteWebDriver driver) {
        this.driver = driver;
       
    }


    public String getTextOnLocator(WebElement locator) {
        String text = "";
        try {
            waitForElementDisplayed(driver, locator, 10, 1);
            text = locator.getText().trim();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return text;
    }

    public void clickOnElement(WebElement element) {
        try {
            waitForElementDisplayed(driver, element, 10, 1);
            element.click();
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    public void enterTextOnElement(WebElement element, String text) {
        try {
            boolean value = waitForElementDisplayed(driver, element, 10, 1);
            if (value) {
                element.sendKeys(text);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean verifyElementPresent(WebElement element) {
        return waitForElementDisplayed(driver, element, 10, 1);
    }


    public static boolean waitForElementDisplayed(WebDriver driver, WebElement element, long timeLimitInSec, long pollingTimeSec) {
        try {
            Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(timeLimitInSec, TimeUnit.SECONDS).pollingEvery(pollingTimeSec, TimeUnit.MILLISECONDS)
                    .ignoring(org.openqa.selenium.NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
            return wait.until(dr -> element.isDisplayed());
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean waitForElementDisplayed(WebDriver driver, By element, long timeLimitInSec, long pollingTimeSec) {
        try {
            Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(timeLimitInSec, TimeUnit.SECONDS).pollingEvery(pollingTimeSec, TimeUnit.MILLISECONDS)
                    .ignoring(org.openqa.selenium.NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
            return wait.until(dr -> driver.findElement(element).isDisplayed());
        } catch (Exception e) {
            return false;
        }
    }

    public void clickOnElementUsingJquery(WebDriver driver, WebElement element) {
        try {
            waitForElementDisplayed(driver, element, 10, 1);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            e.printStackTrace(  );
            
        }
    }


    public String getAttributeValueForElement(WebElement element, String attribute) {
        String value = "";
        try {
            waitForElementDisplayed(driver, element, 10, 1);
            value = element.getAttribute(attribute).trim();
        } catch (Exception e) {
            FrameworkLogger.logStep("Exception attribute not found: " + e);
        }
        return value;
    }  


    public void clickOnElementUsingJquery(WebDriver driver, String cssSelector) {
        try {
            waitForElementNotNul(driver, By.cssSelector(cssSelector), 5, 1);
            ((JavascriptExecutor) driver).executeScript("$(\"" + cssSelector + "\").click();");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    public boolean waitForExpectedAttribute(WebElement element, String attr, String expectedText, long timeLimitInSec, long pollingTimeMS) {
        try {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeLimitInSec, TimeUnit.SECONDS).pollingEvery(pollingTimeMS, TimeUnit.MILLISECONDS)
                    .ignoring(NoSuchElementException.class);
            return wait.until(new Function<WebDriver, Boolean>() {
                @Override
                public Boolean apply(WebDriver webDriver) {
                    waitForElementNotNul(driver, element, 5, 1);
                    return element.getAttribute(attr).contains(expectedText);
                }
            });
        } catch (Exception e) {
            return false;
        }
    }

   
    public boolean waitForElementNotNul(WebDriver driver, By element, long timeLimitInSec, long pollingTimeSec) {
        try {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeLimitInSec, TimeUnit.SECONDS).pollingEvery(pollingTimeSec, TimeUnit.MILLISECONDS)
                    .ignoring(org.openqa.selenium.NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
            return wait.until(dr -> driver.findElement(element) != null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean waitForElementNotNul(WebDriver driver, WebElement element, long timeLimitInSec, long pollingTimeSec) {
        try {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeLimitInSec, TimeUnit.SECONDS).pollingEvery(pollingTimeSec, TimeUnit.MILLISECONDS)
                    .ignoring(org.openqa.selenium.NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
            return wait.until(dr -> element != null);
        } catch (Exception e) {
            return false;
        }
    }

 




}
