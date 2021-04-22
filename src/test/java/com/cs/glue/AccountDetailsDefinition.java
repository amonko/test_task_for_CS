package com.cs.glue;

import com.cs.csApp.steps.AccountDetailsSteps;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Тогда;
import net.thucydides.core.annotations.Steps;

public class AccountDetailsDefinition {

    @Steps
    AccountDetailsSteps accountDetailsSteps;

    @И("Пользователь проверяет открытие поп-апа для смены названия")
    public void verifyChangingAccountNamePopUpIsOpen() { accountDetailsSteps.verifyChangingAccountNamePopUpIsOpen(); }

    @И("Пользователь вводит вместо текущего названия новое \"([^\"]*)\"")
    public void enterNewAccountName(String newAccountName) { accountDetailsSteps.enterNewAccountName(newAccountName); }

    @И("Пользователь подтверждает изменение названия")
    public void clickOkButtonForChangingAccountName() { accountDetailsSteps.clickOkButtonForChangingAccountName(); }

    @Тогда("Пользователь нажимает Сменить название счета")
    public void verifyCurrentAccountAndCountIsDisplayed() { accountDetailsSteps.clickChangeAccountNameButton(); }

    @Тогда("Пользователь проверяет реквизиты счета")
    public void verifyAccountRequisites() { accountDetailsSteps.verifyAccountRequisites(); }
}
