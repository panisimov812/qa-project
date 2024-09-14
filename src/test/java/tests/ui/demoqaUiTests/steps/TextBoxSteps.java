package tests.ui.demoqaUiTests.steps;

import dataqa.mainPage.page_object.pages.ElementsPage;
import net.serenitybdd.annotations.Step;


public class TextBoxSteps {

    ElementsPage elementsPage = new ElementsPage();

    @Step("Заполняем поле Full Name")
    public void fillFullName(String fullName) {
        elementsPage.fillFullName(fullName);
    }

    @Step("Заполняем поле email")
    public void fillEmail(String email) {
        elementsPage.fillEmail(email);
    }

    @Step("Заполняем поле address")
    public void currentAddress(String currentAddress) {
        elementsPage.currentAddress(currentAddress);
    }

    @Step("Заполняем поле address")
    public void permanentAddress(String permanentAddress) {
        elementsPage.permanentAddress(permanentAddress);
    }

    @Step("Заполняем поле permanent address")
    public void clickBtn() {
        elementsPage.clickSubmitBtn();
    }

    @Step("Проверяем что после заполнения отображается текст - full name({0})," +
            "email({1}), current address ({2}) и permanent address({3})")
    public void completedFormShouldHaveInfo(String fullName, String email, String currentAddress, String permanentAddress) {
        elementsPage.completedFormShouldHaveInfo(fullName, email, currentAddress, permanentAddress);
    }

}
