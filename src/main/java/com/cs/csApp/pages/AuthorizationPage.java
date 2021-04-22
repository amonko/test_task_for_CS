package com.cs.csApp.pages;

import com.cs.utils.MobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthorizationPage extends MobilePageObject {

    public AuthorizationPage(WebDriver driver) { super(driver);}

    @AndroidFindBy(id = "ua.com.cs.ifobs.mobile.android.otpcorp:id/demoButton")
    public WebElement turnOnDemoButton;
}
