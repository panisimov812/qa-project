package tests.ui.demoqaUiTests.textBoxTests;

import dataqa.mainPage.page_object.pages.BasePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.ui.demoqaUiTests.BaseTest;
import tests.ui.demoqaUiTests.steps.TextBoxSteps;

public class TextBoxTests extends BaseTest {
    TextBoxSteps textBoxSteps = new TextBoxSteps();
    BasePage basePage = new BasePage();

    @Test
    @DisplayName("Проверяем заполененные поля на странице  /text-box")
    void fillAllForms() {
        String fullName = "Name LastName";
        String email = "email@email.ru";
        String currentAddress = "11000 W TUFTS DR LITTLETON CO 80127-1046 USA";
        String permanentAddress = "687 ROYAL COACHMAN BLVD DILLON CO 80435-8403 USA";

        basePage.openElements();

        textBoxSteps.fillFullName(fullName);
        textBoxSteps.fillEmail(email);
        textBoxSteps.currentAddress(currentAddress);
        textBoxSteps.permanentAddress(permanentAddress);
        textBoxSteps.clickBtn();
        textBoxSteps.completedFormShouldHaveInfo(fullName, email, currentAddress, permanentAddress);
    }

}
