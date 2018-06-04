package com.entse.testcases;

import com.entse.base.Page;
import com.entse.pages.actions.HomePage;
import org.testng.annotations.Test;


public class FlightSearchTest {

    @Test
    public void flightSearchTest() {

        Page.initConfiguration();
        HomePage home = new HomePage();
        home.goToFlights().bookAFlight("Odessa, Ukraine (ODS-Odessa Intl.)", "Paris, France (PAR-All Airports)","23/06/2018", "31/07/2018", "1", "0");
        Page.quitBrowser();
    }
}
