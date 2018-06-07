package com.entse.testcases;

import com.entse.base.Page;
import com.entse.pages.actions.SignInPage;
import com.entse.utilities.Utilities;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class SignInTest {


    @Test(dataProviderClass = Utilities.class, dataProvider = "dp")
    public void signInTest(Hashtable<String, String> data) {

        if(data.get("runmode").equalsIgnoreCase("N")){
            throw new SkipException("Skipping the test cause the RunMode is set to NO");
        }

        Page.initConfiguration();
        SignInPage signInPage = Page.topNav.gotoSignIn();
        signInPage.doLogin(data.get("username"), data.get("password"));

    }

    @AfterMethod
    public void tearDown(){
        if(Page.driver != null) {
            Page.quitBrowser();
        }
    }
}
