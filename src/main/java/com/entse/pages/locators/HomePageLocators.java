package com.entse.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

    @FindBy(xpath = "//button[@data-lob='flight']")
    public WebElement flightTab;

}
