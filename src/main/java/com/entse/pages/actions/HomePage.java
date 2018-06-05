package com.entse.pages.actions;

import com.entse.base.Page;
import com.entse.pages.locators.HomePageLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage extends Page {


    public HomePageLocators home;

    public HomePage(){
        this.home = new HomePageLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(factory, this.home);

    }


    public HomePage goToFlights(){
        home.flightTab.click();
        return this;
    }

    public int findTabCount(){

        return home.tabCount.size();
    }

    public void goToHotels(){}

    public void goToFlightAndHotels(){}

    public void bookAFlight(String from, String to, String departing, String returning, String adults, String children){

        home.fromCity.sendKeys(from);
        home.toCity.sendKeys(to);
        home.departingField.sendKeys(departing);
        home.returningField.sendKeys(returning);
        home.adults.sendKeys(adults);
        home.children.sendKeys(children);
        home.search.click();

    }
}
