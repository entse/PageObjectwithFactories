package com.entse.pages.actions;

import com.entse.base.Page;
import com.entse.pages.locators.TopNavigationLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class TopNavigation{



    public TopNavigationLocators topNavigation;

    public TopNavigation (WebDriver driver) {

        this.topNavigation = new TopNavigationLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(factory, this.topNavigation);
    }

    public SignInPage gotoSignIn(){

        topNavigation.account.click();
        topNavigation.signin.click();
        return new SignInPage();
    }

    public void gotoCreateAccount(){    }

    public void gotoMyList(){   }

    public void gotoCustomerSupport(){   }

    public void gotoFeedback(){  }

    public void gotoHome(){}

    public void gotoFlights(){}

    public void gotoHotels(){}
}
