package ui.steps;

import core.frontend.PageFactory;
import ui.pages.TextBoxPage;
import io.qameta.allure.Step;

public class TextBoxSteps {
    TextBoxPage textBoxPage = PageFactory.createTextBoxPage();

    @Step("Открываем страницу /textbox")
    public void openTextBoxPage() {
        textBoxPage.open();
    }

    @Step("Заполняем поле 'Full Name' значением {fullName}")
    public void fillFullName(String fullNameValues) {
        textBoxPage.fillFullName(fullNameValues);
    }

    @Step("Заполняем поле 'Email' значением {email}")
    public void fillEmail(String email) {
        textBoxPage.fillEmail(email);
    }

    @Step("Заполняем поле 'Current Address' значением {currentAddress}")
    public void fillCurrentAddress(String currentAddress) {
        textBoxPage.fillCurrentAddress(currentAddress);
    }

    @Step("Заполняем поле 'Permanent Address' значением {permanentAddress}")
    public void fillPermanentAddress(String permanentAddress) {
        textBoxPage.fillPermanentAddress(permanentAddress);
    }

    @Step("Кликаем кнопку Submit")
    public void clickSubmitBtn() {
        textBoxPage.clickSubmit();
    }

    @Step("Проверяем, что форма заполнена с информацией: {fullName}, {email}, {currentAddress}, {permanentAddress}")
    public void verifyFormFilled(String fullName, String email, String currentAddress, String permanentAddress) {
        textBoxPage.verifyFormFilled(fullName, email, currentAddress, permanentAddress);
    }
}
