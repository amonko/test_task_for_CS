package com.cs;

import com.cs.controller.AndroidEmulatorController;
import com.cs.controller.AppiumServerController;
import cucumber.api.CucumberOptions;
import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.*;
import org.junit.runner.RunWith;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@Slf4j
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-html-report"},
        glue = {"com.cs.glue"})

public class BaseRunner {

        @BeforeClass
        public static void setUpControllers() {
        new AndroidEmulatorController().startEmulator();
        new AppiumServerController().startAppiumServer();
        }

        @Before
        public void startApp() {
        ((AppiumDriver) ((WebDriverFacade) getDriver()).getProxiedDriver()).activateApp("ua.com.cs.ifobs.mobile.android.otpcorp");
        }

        @After
        public void stopApp() {
        ((AppiumDriver) ((WebDriverFacade) getDriver()).getProxiedDriver()).terminateApp("ua.com.cs.ifobs.mobile.android.otpcorp");
        }

        @AfterClass
        public static void tearDownControllers() {
        log.info("=====================TEAR DOWN================================");
        new AppiumServerController().stopAppiumServer();
        new AndroidEmulatorController().killEmulatorProcess();
        }
}
