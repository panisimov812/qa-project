package tests.mainPageTests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestBase {

    @BeforeAll
    static void setUp(){
      //    Configuration.baseUrl = "https://demoqa.com";
        Configuration.browser = "chrome"; // Или любой другой браузер
        //Configuration.browser = "firefox"; // Или любой другой браузер
        Configuration.browserSize = "1920x1080"; // Размер окна браузера
        //  Configuration.startMaximized = true; // Запуск браузера в развернутом виде
      //  Configuration.timeout = 10000; // Таймаут ожидания элементов

        step("открывает textbox", () -> {
            open("https://demoqa.com");
            executeJavaScript("$('footer').remove()");
            executeJavaScript("$('#fixedban').remove()");
        });
    }
}
