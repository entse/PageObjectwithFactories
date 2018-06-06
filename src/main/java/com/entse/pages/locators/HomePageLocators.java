package com.entse.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class HomePageLocators {

    @FindBy(xpath = "//button[@data-lob='flight']")
    public WebElement flightTab;

    @FindBy(xpath = "//input[@id='flight-origin-hp-flight']")
    public WebElement fromCity;

    @FindBy(xpath = "//input[@id='flight-destination-hp-flight']")
    public WebElement toCity;

    @FindBy(xpath = "//input[@id='flight-departing-hp-flight']")
    public WebElement departingField;

    @FindBys({
            @FindBy(xpath = "//label[@for='flight-returning-hp-flight']"),
            @FindBy(xpath = "//input[@id='flight-returning-hp-flight']")})
    public WebElement returningField;

    @FindAll({
            @FindBy(xpath = "//select[@id='flight-adults-hp-flight']"),
            @FindBy(id = "flight-adults-hp-flight")})
    public WebElement adults;

    @FindBy(xpath = "//select[@id='flight-children-hp-flight']")
    public WebElement children;

    @FindBy(xpath = "//form[@id='gcw-flights-form-hp-flight']//button[@type='submit']")
    public WebElement search;

    @FindBy (xpath = "//*[@role='presentation']")
    public List<WebElement> tabCount;


}
