package com.entse.pages.actions;

import com.entse.base.Page;
import com.entse.pages.locators.HomePageLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Page {


    public HomePageLocators home;

    public HomePage(){
        this.home = new HomePageLocators();
        PageFactory.initElements(driver, this.home);

    }


    public void goToFlights(){
        home.flightTab.click();
    }

    public void goToHotels(){}

    public void goToFlightAndHotels(){}

    public void bookAFlight(String from, String to, String departing, String returning, int adults, int children){}
}
