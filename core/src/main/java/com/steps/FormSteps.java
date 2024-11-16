package com.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class FormSteps {

    @Step("Заполняем поле {nameOfField} значением {fullName}")
    public void fillFormByLocator(String fullName, String qaLocator, String nameOfField) {
        nameOfField = "field";
        $(qaLocator).setValue(fullName);
    }
}
