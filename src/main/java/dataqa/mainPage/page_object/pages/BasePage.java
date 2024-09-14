package dataqa.mainPage.page_object.pages;

import static com.codeborne.selenide.Selenide.open;

import net.serenitybdd.annotations.Step;

public class BasePage {

    @Step("Открываем страницу /text-box ")
    public void openElements() {
        open("/text-box");
    }
}
