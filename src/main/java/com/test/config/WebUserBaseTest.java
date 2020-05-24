package com.test.config;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.test.commons.CommonFunctionsPage;

public class   WebUserBaseTest extends DriverClass {

    public static String browserName = "CHROME";
    public static String environmentUrl = "http://automationpractice.com/index.php";

     

    @BeforeSuite(alwaysRun = true)
    public void createTestData() throws JSONException {
        FrameworkLogger.logStep("Before suite: createTestData start");

       
        FrameworkLogger.logStep("Before suite: createTestData end");
    }


    @BeforeClass(alwaysRun = true)
    public synchronized void setDriver() throws Exception {
        FrameworkLogger.logStep("***********Test class '" + this.getClass().getName() + "'*****Start");
        driver = getDriverForWebBrowser(browserName);
        CommonFunctionsPage.maximizeBrowserScreen(driver);
        driver.get( environmentUrl );
        FrameworkLogger.logStep("***********Test class '" + this.getClass().getName() + "'*****End");
    }

   


    @AfterClass(alwaysRun = true)
    public synchronized void killAllDriverSessions() {
        FrameworkLogger.logStep("***********After class ''" + this.getClass().getName() + "'*****Start");
        try {
            driver.quit();
        } finally {
            driver.quit();
        }
        FrameworkLogger.logStep("***********After class ''" + this.getClass().getName() + "'*****End");
    }

    
    public void waitForPageTitleToLoad(RemoteWebDriver driver,String pageTitle, long duration) {
        try {
            FluentWait<WebDriver> wait = new FluentWait<>((WebDriver) driver).withTimeout(duration, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS);
            wait.until(ExpectedConditions.titleContains(pageTitle));
        } catch (Exception e) {
            FrameworkLogger.logStep("");
        }
    }


}