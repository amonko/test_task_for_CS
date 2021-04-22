package com.cs.csApp.pages;

import com.cs.utils.MobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountPage extends MobilePageObject {

    public AccountPage(WebDriver driver) { super(driver);}

    @AndroidFindBy(id = "ua.com.cs.ifobs.mobile.android.otpcorp:id/dialogTitle")
    public WebElement dialogPopUpTitle;

    @AndroidFindBy(id = "ua.com.cs.ifobs.mobile.android.otpcorp:id/dialogText")
    public WebElement dialogPopUpText;

    @AndroidFindBy(id = "ua.com.cs.ifobs.mobile.android.otpcorp:id/dialogOk")
    public WebElement dialogPopUpOkButton;

    @AndroidFindBy(id = "ua.com.cs.ifobs.mobile.android.otpcorp:id/itemName")
    public List<WebElement> namesOfAccountTypes;

    @AndroidFindBy(id = "ua.com.cs.ifobs.mobile.android.otpcorp:id/itemCount")
    public List<WebElement> countOfAccounts;

    @AndroidFindBy(id = "ua.com.cs.ifobs.mobile.android.otpcorp:id/accountNameLabel")
    public List<WebElement> currentAccountNameLabels;

    @AndroidFindBy(id = "ua.com.cs.ifobs.mobile.android.otpcorp:id/accountNoLabel")
    public List<WebElement> currentAccountNoLabels;

    @AndroidFindBy(id = "ua.com.cs.ifobs.mobile.android.otpcorp:id/balanceAmountView")
    public List<WebElement> currentAccountBalanceLabels;

    @AndroidFindBy(id = "ua.com.cs.ifobs.mobile.android.otpcorp:id/dashboardItemAccountNo")
    public List<WebElement> cardAccountsNoLabels;

    @AndroidFindBy(id = "ua.com.cs.ifobs.mobile.android.otpcorp:id/dashboardItemAmountView")
    public List<WebElement> cardAccountBalanceLabels;

    @AndroidFindBy(id = "ua.com.cs.ifobs.mobile.android.otpcorp:id/imageView8")
    public List<WebElement> cardAccountImages;
}
