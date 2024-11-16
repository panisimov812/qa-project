package com.steps;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

/**
 * NavigationSteps — шаги для навигации по страницам
 * 	•	FormSteps — шаги для работы с формами
 * 	•	ElementInteractionSteps — шаги для взаимодействия с элементами UI
 */
public class NavigationSteps {

    /**
     * Открытие страницы по URL
     * @param url URL страницы, которую нужнно открыть
     */
    @Step("Открываем страницу {0}")
    public void openPage(String url){
        Selenide.open(url); //Selenide открывате страницу URL
    }
}
