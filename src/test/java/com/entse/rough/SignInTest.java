package com.entse.rough;

import com.entse.base.Page;
import com.entse.pages.actions.SignInPage;

public class SignInTest {

    public static void main(String[] args) {

        Page.initConfiguration();
        SignInPage signInPage = Page.topNav.gotoSignIn();
        signInPage.doLogin("test@gmail.com", "passw12rd");
        Page.quitBrowser();

    }
}
