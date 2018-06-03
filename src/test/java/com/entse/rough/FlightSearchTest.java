package com.entse.rough;

import com.entse.base.Page;
import com.entse.pages.actions.HomePage;


public class FlightSearchTest {

    public static void main(String[] args) {

        Page.initConfiguration();
        HomePage home = new HomePage();
        home.goToFlights();
        Page.quitBrowser();
    }
}
