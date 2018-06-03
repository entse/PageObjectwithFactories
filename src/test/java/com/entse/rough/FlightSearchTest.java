package com.entse.rough;

import com.entse.base.Page;
import com.entse.pages.actions.HomePage;


public class FlightSearchTest {

    public static void main(String[] args) {

        Page.initConfiguration();
        HomePage home = new HomePage();
        home.goToFlights().bookAFlight("Odessa, Ukraine (ODS-Odessa Intl.)", "Paris, France (PAR-All Airports)","23/06/2018", "31/07/2018", "1", "0");
        Page.quitBrowser();
    }
}
