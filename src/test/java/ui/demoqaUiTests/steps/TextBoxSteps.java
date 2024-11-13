package ui.demoqaUiTests.steps;

import dataqa.mainPage.page_object.pages.TextBoxPage;
import io.qameta.allure.Step;

public class TextBoxSteps {

    private final TextBoxPage textBoxPage = new TextBoxPage();

    @Step("Открываем страницу /textbox")
    public void openTextBoxPage() {
        textBoxPage.openTextBoxPage();
    }

    @Step("Заполняем поле 'Full Name' значением {fullName}")
    public void fillFullName(String fullName) {
        textBoxPage.fillFullName(fullName);
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
    public void clickSubmit() {
        textBoxPage.clickSubmit();
    }

    @Step("Проверяем, что форма заполнена с информацией: {fullName}, {email}, {currentAddress}, {permanentAddress}")
    public void verifyFormFilled(String fullName, String email, String currentAddress, String permanentAddress) {
        textBoxPage.verifyFormFilled(fullName, email, currentAddress, permanentAddress);
    }
}
