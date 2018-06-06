package com.entse.testcases;

import com.entse.base.Page;
import com.entse.pages.actions.SignInPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignInTest {

    @BeforeTest
    public void setUp(){
        Page.initConfiguration();
    }

    @Test
    public void signInTest() {

        SignInPage signInPage = Page.topNav.gotoSignIn();
        signInPage.doLogin("test@gmail.com", "passw12rd");

    }

    @AfterTest
    public void tearDown(){
        Page.quitBrowser();
    }
}
