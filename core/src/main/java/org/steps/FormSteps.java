package org.steps;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.$;

/**
 * @author Anisimov Petr
 * Класс содержит общие шаги для работы с формами
 * данный класс является подклассом LoggerSteps
 */
public class FormSteps extends LoggerSteps {
    private static final Logger logger = LoggerFactory.getLogger(FormSteps.class);

    public void fillFormByLocator(String valueForField, By qaLocator, String nameOfField) {
        logger.info(formatFormLogMessage(nameOfField, valueForField));
        $(qaLocator).setValue(valueForField);
    }

}
