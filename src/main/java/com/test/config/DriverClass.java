package com.test.config;



import java.util.HashMap;
import java.util.logging.Level;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.apache.commons.lang3.SystemUtils.IS_OS_MAC;


public class DriverClass {

    public RemoteWebDriver driver;
    public int port;

    public RemoteWebDriver getDriverForWebBrowser(String browserName) {
        switch (browserName) {
            
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                FrameworkLogger.logStep( "WebdriverVersion:" + WebDriverManager.chromedriver().getDownloadedVersion() );

                HashMap<String, Object> chromePrefs = new HashMap<>();

                chromePrefs.put("profile.default_content_settings.popups", 0);
                chromePrefs.put("profile.content_settings.exceptions.automatic_downloads.*.setting", 1);
                chromePrefs.put("download.prompt_for_download", false);

                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setExperimentalOption("prefs", chromePrefs);
                if(IS_OS_MAC) {
                    if (Integer.parseInt( WebDriverManager.chromedriver().getDownloadedVersion().substring( 0, 1 ) ) > 76)
                        chromeOptions.setPageLoadStrategy( PageLoadStrategy.NONE );
                }

                DesiredCapabilities capChrome = DesiredCapabilities.chrome();
                LoggingPreferences logPrefsChrome = new LoggingPreferences();
                logPrefsChrome.enable( LogType.BROWSER, Level.ALL);
                capChrome.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                capChrome.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                capChrome.setCapability( CapabilityType.LOGGING_PREFS,logPrefsChrome );
                ChromeDriverService chromeDriverService = ChromeDriverService.createDefaultService();
                this.port = chromeDriverService.getUrl().getPort();
                driver = new ChromeDriver(chromeDriverService, capChrome);


                FrameworkLogger.logStep("BrowserVersion:" + getBrowserVersion(driver));
                return driver;

            default:
                return driver;
        }
    }

    private static String getBrowserVersion(RemoteWebDriver driver) {
        Capabilities cap = driver.getCapabilities();
        String browserName = cap.getBrowserName().toLowerCase();
        String v = cap.getVersion();
        return browserName + v;
    }
}
