package ui.demoqaUiTests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @Step("переходим на url \"https://demoqa.com\" и подготавливаем браузер")
    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browser = "Firefox";
        Configuration.browserSize = "1920x1080";
    }
}
