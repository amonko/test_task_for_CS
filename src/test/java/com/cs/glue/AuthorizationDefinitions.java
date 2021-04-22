package com.cs.glue;

import com.cs.csApp.steps.AuthorizationSteps;
import cucumber.api.java.ru.Когда;
import net.thucydides.core.annotations.Steps;

public class AuthorizationDefinitions {

    @Steps
    AuthorizationSteps authorizationSteps;

    @Когда("^Пользователь переходит в демо режим для реализации проверок$")
    public void clickTurnOnDemoButton() {
        authorizationSteps.clickTurnOnDemoButton();
    }
}
