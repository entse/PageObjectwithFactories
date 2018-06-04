package com.entse.base;

import com.entse.pages.actions.TopNavigation;
import com.entse.utilities.ExcelReader;
import com.entse.utilities.ExtentMaganer;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Page {

    public static WebDriver driver;
    public static Logger log = Logger.getLogger("devpinoyLogger");
    public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+ "\\src\\test\\resources\\excel\\testdata.xlsx");
    public static WebDriverWait wait;
    public ExtentReports rep = ExtentMaganer.getInstance();
    public static ExtentTest test;
    public WebElement dropdown;
    public static String browser;
    public static TopNavigation topNav;


    public static void initConfiguration(){

        if (Constans.browser.equals("firefox")){
            driver = new FirefoxDriver();
            log.debug("Launching Firefox");
        }else if (Constans.browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
            Map<String, Object> prefs = new HashMap<>();
            prefs.put("profile.default_content_setting_values.notifications", 2);
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", prefs);
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-infobars");

            driver = new ChromeDriver(options);
            log.debug("Launching Chrome");
        } else if (Constans.browser.equals("IE")){
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            log.debug("Launching IE");
        }

        driver.get(Constans.testsiteurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constans.implicitlywait, TimeUnit.SECONDS);
        topNav = new TopNavigation(driver);


    }


    public static void quitBrowser() {
        driver.quit();
    }
}
