package com.entse.pages.actions;

import com.entse.base.Page;
import com.entse.pages.locators.SignInLocators;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SignInPage extends Page{


    public SignInLocators singinPage;

    public SignInPage () {

        this.singinPage = new SignInLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(factory, this.singinPage);
    }


    public void doLogin(String username, String password){

        singinPage.email.sendKeys(username);
        singinPage.password.sendKeys(password);
        singinPage.signinBtn.click();


    }
}
