package com.entse.rough;

import com.entse.pages.actions.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class FlightSearchTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.expedia.co.in/");

        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.goToFlights();
    }
}
