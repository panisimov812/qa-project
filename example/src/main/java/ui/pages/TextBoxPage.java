package ui.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.steps.ButtonSteps;
import org.steps.FormSteps;
import org.steps.NavigationSteps;
import org.openqa.selenium.By;
import utils.Selectors;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {
    NavigationSteps navigationSteps = new NavigationSteps();
    FormSteps formSteps = new FormSteps();
    ButtonSteps buttonSteps = new ButtonSteps();
    private static final Logger logger = LoggerFactory.getLogger(TextBoxPage.class);


    /**
     * список констант с присвоенными к ним локаторами
     * для дальнейшего их использования в методах
     */
    private final By FULL_NAME_INPUT = Selectors.byID("userName");
    private final By EMAIL_INPUT = Selectors.byID("userEmail");
    private final By CURRENT_ADDRESS_INPUT = Selectors.byID("currentAddress");
    private final By PERMANENT_ADDRESS_INPUT = Selectors.byID("permanentAddress");
    private final By SUBMIT_BUTTON = Selectors.byID("submit");
    private final By COMPLETE_FORM = Selectors.byClass("border col-md-12 col-sm-12");

    /**
     * список названий полей для удобства чтения логов
     */
    String TITLE_FOR_NAME_FIELD = "для ввода имяни и фамилии";
    String TITLE_FOR_EMAIL_FIELD = "для ввода email";
    String TITLE_FOR_CURRENT_ADDRESS_FIELD = "Current Address";
    String TITLE_FOR_PERMANENT_ADDRESS_FIELD = "Permanent Address";
    String TITLE_FOR_SUBMIT_BUTTON = "Submit";

    public void openTextBoxPage() {
        navigationSteps.openPage("/text-box");
    }

    public void fillFullName(String fullNameValues) {
        formSteps.fillFormByLocator(
                fullNameValues,
                FULL_NAME_INPUT,
                TITLE_FOR_NAME_FIELD);
    }

    public void fillEmail(String emailValue) {
        formSteps.fillFormByLocator(
                emailValue,
                EMAIL_INPUT,
                TITLE_FOR_EMAIL_FIELD
        );
    }

    public void fillCurrentAddress(String currentAddressValue) {
        formSteps.fillFormByLocator(
                currentAddressValue,
                CURRENT_ADDRESS_INPUT,
                TITLE_FOR_CURRENT_ADDRESS_FIELD
        );
    }

    public void fillPermanentAddress(String permanentAddressValue) {
        formSteps.fillFormByLocator(
                permanentAddressValue,
                PERMANENT_ADDRESS_INPUT,
                TITLE_FOR_PERMANENT_ADDRESS_FIELD
        );
    }

    public void clickSubmit() {
        buttonSteps.clickToButton(
                SUBMIT_BUTTON,
                TITLE_FOR_SUBMIT_BUTTON);
    }

    public void verifyFormFilled(String fullName, String email, String currentAddress, String permanentAddress) {
        logger.info("Проверка заполненной формы выполнена успешно");
        $(COMPLETE_FORM).shouldHave(
                text(fullName),
                text(email),
                text(currentAddress),
                text(permanentAddress)
        );
    }
}
