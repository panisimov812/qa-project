package org.steps;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * NavigationSteps — шаги для навигации по страницам
 * 	•	FormSteps — шаги для работы с формами
 * 	•	ElementInteractionSteps — шаги для взаимодействия с элементами UI
 */
public class NavigationSteps {
    private static final Logger logger = LoggerFactory.getLogger(NavigationSteps.class);

    /**
     * Открытие страницы по URL
     * @param url URL страницы, которую нужнно открыть
     */
    @Step("Открываем страницу {0}")
    public void openPage(String url){
        logger.info("Открыта страница /text-box");
        Selenide.open(url); //Selenide открывате страницу URL
    }
}
