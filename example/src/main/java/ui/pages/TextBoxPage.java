package ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import utils.Selectors;

import static com.codeborne.selenide.Selenide.open;


public class TextBoxPage {
    //поля с сайта
    private final By FULL_NAME_INPUT = Selectors.byID("userName");
    private final By EMAIL_INPUT = Selectors.byID("userEmail");
    private final By CURRENT_ADDRESS_INPUT = Selectors.byID("currentAddress");
    private final By PERMANENT_ADDRESS_INPUT = Selectors.byID("permanentAddress");
    private final By SUBMIT_BUTTON = Selectors.byID("submit");
    private final By COMPLETE_FORM = Selectors.byClass("border col-md-12 col-sm-12");

    public void openTextBoxPage(){
        open("/text-box");
    }

    //методы взаимодействия с полями на сайте
    public void fillFullName(String fullName) {
        Selenide.$(FULL_NAME_INPUT).setValue(fullName);
    }

    public void fillEmail(String email) {
        Selenide.$(EMAIL_INPUT).setValue(email);
    }

    public void fillCurrentAddress(String currentAddress) {
        Selenide.$(CURRENT_ADDRESS_INPUT).setValue(currentAddress);
    }

    public void fillPermanentAddress(String permanentAddress) {
        Selenide.$(PERMANENT_ADDRESS_INPUT).setValue(permanentAddress);
    }

    public void clickSubmit() {
        Selenide.$(SUBMIT_BUTTON).click();
    }

    public void verifyFormFilled(String fullName, String email, String currentAddress, String permanentAddress) {
        Selenide.$(COMPLETE_FORM).shouldHave(
                Condition.text(fullName),
                Condition.text(email),
                Condition.text(currentAddress),
                Condition.text(permanentAddress)
        );
    }
}
