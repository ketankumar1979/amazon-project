package com.amazon;

import com.amazon.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
   private DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setup(){
        driverFactory.openBrowser();
        driverFactory.maxiBrowser();
        driverFactory.implicitewait();
    }
    @After
    public void tearDown(){
        driverFactory.closeBrowser();
    }
}
