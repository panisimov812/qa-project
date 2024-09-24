package ui.demoqaUiTests.steps;

import dataqa.mainPage.page_object.pages.ElementsPage;
import io.qameta.allure.Step;

public class TextBoxSteps {

    ElementsPage elementsPage = new ElementsPage();

    @Step("Заполняем поле Full Name данными ({0})")
    public void fillFullName(String fullName) {
        elementsPage.fillFullName(fullName);
    }

    @Step("Заполняем поле email данными ({0})")
    public void fillEmail(String email) {
        elementsPage.fillEmail(email);
    }

    @Step("Заполняем поле address данными ({0})")
    public void currentAddress(String currentAddress) {
        elementsPage.currentAddress(currentAddress);
    }

    @Step("Заполняем поле permanent address данными ({0})")
    public void permanentAddress(String permanentAddress) {
        elementsPage.permanentAddress(permanentAddress);
    }

    @Step("Кликаем по кнопке 'submit'")
    public void clickBtn() {
        elementsPage.clickSubmitBtn();
    }

    @Step("Проверяем что поле full name содержит ({0}) поле email содержит({1})" +
            " поле current address содержит ({2}) поле permanent содержит address({3})")
    public void completedFormShouldHaveInfo(String fullName, String email, String currentAddress, String permanentAddress) {
        elementsPage.completedFormShouldHaveInfo(fullName, email, currentAddress, permanentAddress);
    }

}
