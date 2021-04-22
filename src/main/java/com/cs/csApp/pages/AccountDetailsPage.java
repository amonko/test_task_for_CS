package com.cs.csApp.pages;

import com.cs.utils.MobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountDetailsPage extends MobilePageObject {

    public AccountDetailsPage (WebDriver driver) { super(driver);}

    @AndroidFindBy(id = "ua.com.cs.ifobs.mobile.android.otpcorp:id/accountDetailChangeNameButton")
    public WebElement changeAccountNameButton;

    @AndroidFindBy(id = "ua.com.cs.ifobs.mobile.android.otpcorp:id/inputDialogContainer")
    public WebElement changeAccountNamePopUp;

    @AndroidFindBy(id = "ua.com.cs.ifobs.mobile.android.otpcorp:id/inputDialogText")
    public WebElement accountNameField;

    @AndroidFindBy(id = "ua.com.cs.ifobs.mobile.android.otpcorp:id/captionLabel")
    public WebElement accountRequisitesLabel;

    @AndroidFindBy(id = "ua.com.cs.ifobs.mobile.android.otpcorp:id/valueLabel")
    public WebElement accountRequisitesDetails;
}
