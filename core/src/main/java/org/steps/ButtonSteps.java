package org.steps;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.$;

public class ButtonSteps extends LoggerSteps {
    private static final Logger logger = LoggerFactory.getLogger(FormSteps.class);

    public void clickToButton(By qaLocator, String nameOfButton) {
        logger.info(formatButtonLogMessage(nameOfButton));
        $(qaLocator).click();
    }
}
