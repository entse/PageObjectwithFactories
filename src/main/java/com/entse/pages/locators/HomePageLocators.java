package com.entse.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

    @FindBy(xpath = "//button[@data-lob='flight']")
    public WebElement flightTab;

    @FindBy(xpath = "//input[@id='flight-origin-hp-flight']")
    public WebElement fromCity;

    @FindBy(xpath = "//input[@id='flight-destination-hp-flight']")
    public WebElement toCity;

    @FindBy(xpath = "//input[@id='flight-departing-hp-flight']")
    public WebElement departingField;

    @FindBy(xpath = "//input[@id='flight-returning-hp-flight']")
    public WebElement returningField;

    @FindBy(xpath = "//select[@id='flight-adults-hp-flight']")
    public WebElement adults;

    @FindBy(xpath = "//select[@id='flight-children-hp-flight']")
    public WebElement children;

    @FindBy(xpath = "//form[@id='gcw-flights-form-hp-flight']//button[@type='submit']")
    public WebElement search;


}
