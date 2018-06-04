package com.entse.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInLocators {


    @FindBy(xpath = "//input[@id = 'signin-loginid']")
    public WebElement email;

    @FindBy(xpath = "//input[@id = 'signin-password']")
    public WebElement password;

    @FindBy(xpath = "//button[@id = 'submitButton']")
    public WebElement signinBtn;


}
