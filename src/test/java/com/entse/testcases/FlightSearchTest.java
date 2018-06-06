package com.entse.testcases;

import com.entse.base.Page;
import com.entse.errorcollectors.ErrorCollector;
import com.entse.pages.actions.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FlightSearchTest {

    @BeforeTest
    public void setUp(){
        Page.initConfiguration();
    }

    @Test
    public void flightSearchTest() {


        HomePage home = new HomePage();
        //Assert.assertEquals(home.findTabCount(), 7);
        ErrorCollector.verifyEquals(home.findTabCount(), 6);
        ErrorCollector.verifyEquals(home.findTabCount(), 7);
        ErrorCollector.verifyEquals(home.findTabCount(), 8);
        home.goToFlights().bookAFlight("Odessa, Ukraine (ODS-Odessa Intl.)", "Paris, France (PAR-All Airports)","23/06/2018", "31/07/2018", "1", "0");

    }

    @AfterTest
    public void tearDown(){
        Page.quitBrowser();
    }
}
