package ui.pages;

import org.steps.NavigationSteps;
import org.openqa.selenium.By;
import utils.Selectors;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {
    NavigationSteps navigationSteps = new NavigationSteps();

    //поля с сайта
    private final By FULL_NAME_INPUT = Selectors.byID("userName");
    private final By EMAIL_INPUT = Selectors.byID("userEmail");
    private final By CURRENT_ADDRESS_INPUT = Selectors.byID("currentAddress");
    private final By PERMANENT_ADDRESS_INPUT = Selectors.byID("permanentAddress");
    private final By SUBMIT_BUTTON = Selectors.byID("submit");
    private final By COMPLETE_FORM = Selectors.byClass("border col-md-12 col-sm-12");

    public void openTextBoxPage() {
        navigationSteps.openPage("/text-box");
    }

    //методы взаимодействия с полями на сайте
    public void fillFullName(String fullName) {
        $(FULL_NAME_INPUT).setValue(fullName);
    }

    public void fillEmail(String email) {
        $(EMAIL_INPUT).setValue(email);
    }

    public void fillCurrentAddress(String currentAddress) {
        $(CURRENT_ADDRESS_INPUT).setValue(currentAddress);
    }

    public void fillPermanentAddress(String permanentAddress) {
        $(PERMANENT_ADDRESS_INPUT).setValue(permanentAddress);
    }

    public void clickSubmit() {
        $(SUBMIT_BUTTON).click();
    }

    public void verifyFormFilled(String fullName, String email, String currentAddress, String permanentAddress) {
        $(COMPLETE_FORM).shouldHave(
                text(fullName),
                text(email),
                text(currentAddress),
                text(permanentAddress)
        );
    }
}
