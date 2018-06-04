package com.entse.testcases;

import com.entse.base.Page;
import com.entse.pages.actions.SignInPage;
import org.testng.annotations.Test;

public class SignInTest {

    @Test
    public void signInTest() {

        Page.initConfiguration();
        SignInPage signInPage = Page.topNav.gotoSignIn();
        signInPage.doLogin("test@gmail.com", "passw12rd");
        Page.quitBrowser();

    }
}
