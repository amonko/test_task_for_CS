package com.cs.csApp.steps;

import com.cs.csApp.pages.AccountPage;
import com.cs.utils.MobilePageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AccountSteps {

    AccountPage accountPage;
    MobilePageObject mobilePageObject;

    @Step
    public void verifyDemoIsStarted() {
        accountPage.element(accountPage.dialogPopUpTitle).isVisible();
        accountPage.element(accountPage.dialogPopUpText).isVisible();
        accountPage.element(accountPage.dialogPopUpOkButton).isVisible();
    }

    @Step
    public void verifyCurrentAccountAndCountIsDisplayed() {
        Assert.assertEquals("Текущие счета", accountPage.namesOfAccountTypes.get(0).getText());
        accountPage.element(accountPage.countOfAccounts.get(0)).isVisible();
    }

    @Step
    public void verifyCurrentAccountNames() {
        // Сравнение общего кол-ва названий счетов в Текущие счета с кол-вом, которое указано в заголовке
        Assert.assertEquals(accountPage.currentAccountNameLabels.size(), getNumberOfAccounts(accountPage.countOfAccounts.get(0)));
    }

    @Step
    public void verifyCurrentAccountNoLabels() {
        // Сравнение общего кол-ва номеров счетов в Текущие счета с кол-вом, которое указано в заголовке
        Assert.assertEquals(accountPage.currentAccountNoLabels.size(), getNumberOfAccounts(accountPage.countOfAccounts.get(0)));
    }

    @Step
    public void verifyCurrentAccountBalances() {
        // Сравнение общего кол-ва номеров балансов в Текущие счета с кол-вом, которое указано в заголовке
        Assert.assertEquals(accountPage.currentAccountBalanceLabels.size(), getNumberOfAccounts(accountPage.countOfAccounts.get(0)));
    }

    @Step
    public void verifyCardAccountAndCountIsDisplayed() {
        Assert.assertEquals("Карточные счета", accountPage.namesOfAccountTypes.get(1).getText());
        accountPage.element(accountPage.countOfAccounts.get(1)).isVisible();
    }

    @Step
    public void verifyCardAccountNoLabels() {
        // Сравнение общего кол-ва номеров счетов в Карточные счета с кол-вом, которое указано в заголовке
        Assert.assertEquals(accountPage.cardAccountsNoLabels.size(), getNumberOfAccounts(accountPage.countOfAccounts.get(1)));
    }

    @Step
    public void verifyCardAccountBalances() {
        // Сравнение общего кол-ва балансов в Карточные счета с кол-вом, которое указано в заголовке
        Assert.assertEquals(accountPage.cardAccountBalanceLabels.size(), getNumberOfAccounts(accountPage.countOfAccounts.get(1)));
    }

    @Step
    public void verifyCardAccountImages() {
        // Сравнение общего кол-ва изображений карт в Карточные счета с кол-вом, которое указано в заголовке
        Assert.assertEquals(accountPage.cardAccountImages.size(), getNumberOfAccounts(accountPage.countOfAccounts.get(1)));
    }

    @Step
    public void clickOnAccountForDetails() {
        accountPage.element(accountPage.currentAccountNameLabels.get(0)).click();
    }

    @Step
    public void clickDemoDialogOkButton() {
        accountPage.element(accountPage.dialogPopUpOkButton).click();
    }

    @Step
    public void swipeUpForShowingAllCardAccounts() {
        mobilePageObject.swipeUp(0.5, 0.8,0.5, 0.2);
    }

    public int getNumberOfAccounts(WebElement element) {
        String number = element.getText().replaceAll("[\\p{Ps}\\p{Pe}]", "");
        return Integer.parseInt(number);
    }
}
