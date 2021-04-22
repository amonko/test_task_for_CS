package com.cs.glue;

import com.cs.csApp.steps.AccountSteps;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import net.thucydides.core.annotations.Steps;

public class AccountDefinitions {

    @Steps
    AccountSteps accountSteps;

    @Когда("Пользователь проверяет открытие демо режима")
    public void verifyDemoIsStarted() {
        accountSteps.verifyDemoIsStarted();
    }

    @И("Пользователь подтверждает открытие демо режима")
    public void clickDemoDialogOkButton() {
        accountSteps.clickDemoDialogOkButton();
    }

    @И("Пользователь проверяет на наличие названия для каждого из текущих счетов")
    public void verifyCurrentAccountNames() { accountSteps.verifyCurrentAccountNames(); }

    @И("Пользователь проверяет на наличие номера для каждого из текущих счетов")
    public void verifyCurrentAccountNoLabels() { accountSteps.verifyCurrentAccountNoLabels(); }

    @И("Пользователь проверяет на наличие баланса для каждого из текущих счетов")
    public void verifyCurrentAccountBalances() { accountSteps.verifyCurrentAccountBalances(); }

    @И("Пользователь проверяет на наличие заголовка Карточные счета и их количеством")
    public void verifyCardAccountAndCountIsDisplayed() { accountSteps.verifyCardAccountAndCountIsDisplayed(); }

    @И("Пользователь делает свайп вверх для отображения элементов внизу")
    public void swipeUpForShowingAllCardAccounts() { accountSteps.swipeUpForShowingAllCardAccounts(); }

    @И("Пользователь проверяет на наличие номера для каждого из карточных счетов")
    public void verifyCardAccountNoLabels() { accountSteps.verifyCardAccountNoLabels(); }

    @И("Пользователь проверяет на наличие баланса для каждого из карточных счетов")
    public void verifyCardAccountBalances() { accountSteps.verifyCardAccountBalances(); }

    @И("Пользователь проверяет на наличие изображения карты для каждого из карточных счетов")
    public void verifyCardAccountImages() { accountSteps.verifyCardAccountImages(); }

    @И("Пользователь открывает детали счета")
    public void clickOnAccountForDetails() { accountSteps.clickOnAccountForDetails(); }

    @Тогда("Пользователь проверяет на наличие заголовка Текущие счета и их количеством")
    public void verifyCurrentAccountAndCountIsDisplayed() { accountSteps.verifyCurrentAccountAndCountIsDisplayed(); }
}
