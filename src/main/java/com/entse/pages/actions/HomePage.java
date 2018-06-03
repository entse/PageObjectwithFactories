package com.entse.pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {


    @FindBy(xpath = "//button[@data-lob='flight']")
    public WebElement flightTab;


    public void goToFlights(){
        flightTab.click();
    }

    public void goToHotels(){}

    public void goToFlightAndHotels(){}

    public void bookAFlight(String from, String to, String departing, String returning, int adults, int children){}
}
