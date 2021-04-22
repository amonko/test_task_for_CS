package com.cs.csApp.steps;

import com.cs.csApp.pages.AccountDetailsPage;
import com.cs.csApp.pages.AccountPage;
import net.thucydides.core.annotations.Step;

public class AccountDetailsSteps {

    AccountDetailsPage accountDetailsPage;
    AccountPage accountPage;

    @Step
    public void verifyChangingAccountNamePopUpIsOpen() {
        accountDetailsPage.element(accountDetailsPage.changeAccountNamePopUp).isVisible();
    }

    @Step
    public void verifyAccountRequisites() {
        accountDetailsPage.element(accountDetailsPage.accountRequisitesLabel).isVisible();
        accountDetailsPage.element(accountDetailsPage.accountRequisitesDetails).isVisible();
    }

    @Step
    public void clickChangeAccountNameButton() {
        accountDetailsPage.element(accountDetailsPage.changeAccountNameButton).click();
    }

    @Step
    public void clickOkButtonForChangingAccountName() {
        accountDetailsPage.element(accountPage.dialogPopUpOkButton).click();
    }

    @Step
    public void enterNewAccountName(String newAccountName) {
        accountDetailsPage.element(accountDetailsPage.accountNameField).click();
        accountDetailsPage.element(accountDetailsPage.accountNameField).clear();
        accountDetailsPage.element(accountDetailsPage.accountNameField).sendKeys(newAccountName);
    }
}
