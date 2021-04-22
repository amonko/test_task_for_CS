$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/authorization/Authorization.feature");
formatter.feature({
  "name": "Реализация проверок для тестового задания CS",
  "description": "",
  "keyword": "Функция"
});
formatter.scenario({
  "name": "Проверка всех Текущих и Карточных счетов",
  "description": "",
  "keyword": "Сценарий",
  "tags": [
    {
      "name": "@test_cs"
    }
  ]
});
formatter.step({
  "name": "Пользователь переходит в демо режим для реализации проверок",
  "keyword": "Дано "
});
formatter.match({
  "location": "AuthorizationDefinitions.clickTurnOnDemoButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь проверяет открытие демо режима",
  "keyword": "Когда "
});
formatter.match({
  "location": "AccountDefinitions.verifyDemoIsStarted()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь подтверждает открытие демо режима",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDefinitions.clickDemoDialogOkButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь проверяет на наличие заголовка Текущие счета и их количеством",
  "keyword": "Тогда "
});
formatter.match({
  "location": "AccountDefinitions.verifyCurrentAccountAndCountIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь проверяет на наличие названия для каждого из текущих счетов",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDefinitions.verifyCurrentAccountNames()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь проверяет на наличие номера для каждого из текущих счетов",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDefinitions.verifyCurrentAccountNoLabels()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь проверяет на наличие баланса для каждого из текущих счетов",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDefinitions.verifyCurrentAccountBalances()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь проверяет на наличие заголовка Карточные счета и их количеством",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDefinitions.verifyCardAccountAndCountIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь делает свайп вверх для отображения элементов внизу",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDefinitions.swipeUpForShowingAllCardAccounts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь проверяет на наличие номера для каждого из карточных счетов",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDefinitions.verifyCardAccountNoLabels()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь проверяет на наличие баланса для каждого из карточных счетов",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDefinitions.verifyCardAccountBalances()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь проверяет на наличие изображения карты для каждого из карточных счетов",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDefinitions.verifyCardAccountImages()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Проверка возможности изменения названия",
  "description": "",
  "keyword": "Структура сценария",
  "tags": [
    {
      "name": "@test_cs"
    }
  ]
});
formatter.step({
  "name": "Пользователь переходит в демо режим для реализации проверок",
  "keyword": "Дано "
});
formatter.step({
  "name": "Пользователь проверяет открытие демо режима",
  "keyword": "И "
});
formatter.step({
  "name": "Пользователь подтверждает открытие демо режима",
  "keyword": "И "
});
formatter.step({
  "name": "Пользователь открывает детали счета",
  "keyword": "Когда "
});
formatter.step({
  "name": "Пользователь нажимает Сменить название счета",
  "keyword": "Тогда "
});
formatter.step({
  "name": "Пользователь проверяет открытие поп-апа для смены названия",
  "keyword": "И "
});
formatter.step({
  "name": "Пользователь вводит вместо текущего названия новое \"\u003cnewAccountName\u003e\"",
  "keyword": "И "
});
formatter.step({
  "name": "Пользователь подтверждает изменение названия",
  "keyword": "И "
});
formatter.step({
  "name": "Пользователь проверяет открытие демо режима",
  "keyword": "И "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Примеры",
  "rows": [
    {
      "cells": [
        "newAccountName"
      ]
    },
    {
      "cells": [
        "testName"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Проверка возможности изменения названия",
  "description": "",
  "keyword": "Структура сценария",
  "tags": [
    {
      "name": "@test_cs"
    }
  ]
});
formatter.step({
  "name": "Пользователь переходит в демо режим для реализации проверок",
  "keyword": "Дано "
});
formatter.match({
  "location": "AuthorizationDefinitions.clickTurnOnDemoButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь проверяет открытие демо режима",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDefinitions.verifyDemoIsStarted()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь подтверждает открытие демо режима",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDefinitions.clickDemoDialogOkButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь открывает детали счета",
  "keyword": "Когда "
});
formatter.match({
  "location": "AccountDefinitions.clickOnAccountForDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь нажимает Сменить название счета",
  "keyword": "Тогда "
});
formatter.match({
  "location": "AccountDetailsDefinition.verifyCurrentAccountAndCountIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь проверяет открытие поп-апа для смены названия",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDetailsDefinition.verifyChangingAccountNamePopUpIsOpen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь вводит вместо текущего названия новое \"testName\"",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDetailsDefinition.enterNewAccountName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь подтверждает изменение названия",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDetailsDefinition.clickOkButtonForChangingAccountName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь проверяет открытие демо режима",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDefinitions.verifyDemoIsStarted()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Проверка реквизитов счета из деталей счета",
  "description": "",
  "keyword": "Сценарий",
  "tags": [
    {
      "name": "@test_cs"
    }
  ]
});
formatter.step({
  "name": "Пользователь переходит в демо режим для реализации проверок",
  "keyword": "Дано "
});
formatter.match({
  "location": "AuthorizationDefinitions.clickTurnOnDemoButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь проверяет открытие демо режима",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDefinitions.verifyDemoIsStarted()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь подтверждает открытие демо режима",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDefinitions.clickDemoDialogOkButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь открывает детали счета",
  "keyword": "Когда "
});
formatter.match({
  "location": "AccountDefinitions.clickOnAccountForDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь делает свайп вверх для отображения элементов внизу",
  "keyword": "И "
});
formatter.match({
  "location": "AccountDefinitions.swipeUpForShowingAllCardAccounts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь проверяет реквизиты счета",
  "keyword": "Тогда "
});
formatter.match({
  "location": "AccountDetailsDefinition.verifyAccountRequisites()"
});
formatter.result({
  "status": "passed"
});
});