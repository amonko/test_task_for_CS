package com.cs.csApp.steps;

import com.cs.csApp.pages.AuthorizationPage;
import net.thucydides.core.annotations.Step;

public class AuthorizationSteps {

    AuthorizationPage authorizationPage;

    @Step
    public void clickTurnOnDemoButton() {
        authorizationPage.element(authorizationPage.turnOnDemoButton).isVisible();
        authorizationPage.element(authorizationPage.turnOnDemoButton).click();
    }
}
