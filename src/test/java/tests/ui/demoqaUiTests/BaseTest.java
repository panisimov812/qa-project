package tests.ui.demoqaUiTests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {


    @BeforeAll
    static void setUp() {

        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browser = "Firefox";
        Configuration.browserSize = "1920x1080";

    }


}
