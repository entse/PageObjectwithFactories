package com.entse.testcases;

import com.entse.base.Page;
import com.entse.errorcollectors.ErrorCollector;
import com.entse.pages.actions.HomePage;
import com.entse.utilities.Utilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Hashtable;


public class FlightSearchTest {



    @Test(dataProviderClass = Utilities.class, dataProvider = "dp")
    public void flightSearchTest(Hashtable<String, String> data) {


        Page.initConfiguration();
        HomePage home = new HomePage();
        //Assert.assertEquals(home.findTabCount(), 7);
        ErrorCollector.verifyEquals(home.findTabCount(), 6);
//        ErrorCollector.verifyEquals(home.findTabCount(), 7);
//        ErrorCollector.verifyEquals(home.findTabCount(), 8);
        home.goToFlights().bookAFlight(data.get("fromCity"), data.get("toCity"),data.get("departingDate"), data.get("returningDate"), data.get("adults"), data.get("children"));

    }

    @AfterMethod
    public void tearDown(){
        if(Page.driver != null) {
            Page.quitBrowser();
        }
    }
}
