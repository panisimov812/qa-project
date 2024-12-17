package ui.demoqa;

import ui.BaseTest;
import ui.steps.TextBoxSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends BaseTest {

    private final TextBoxSteps textBoxSteps = new TextBoxSteps();

    @Test
    @Owner("Имя тестировщика")
    @DisplayName("Проверка заполнения полей на странице /text-box")
    @Description("Заполняем все поля, нажимаем submit, проверяем вывод заполненной информации")
    void checkCompletedForm() {
        String fullName = "Name LastName";
        String email = "email@email.com";
        String currentAddress = "Current Address Example";
        String permanentAddress = "Permanent Address Example";

        textBoxSteps.openTextBoxPage();
        textBoxSteps.fillFullName(fullName);
        textBoxSteps.fillEmail(email);
        textBoxSteps.fillCurrentAddress(currentAddress);
        textBoxSteps.fillPermanentAddress(permanentAddress);
        textBoxSteps.clickSubmitBtn();
        textBoxSteps.verifyFormFilled(fullName, email, currentAddress, permanentAddress);
    }
}
