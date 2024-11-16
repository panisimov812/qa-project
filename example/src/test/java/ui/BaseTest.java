package ui;

import com.codeborne.selenide.Configuration;
import org.config.ConfigLoader;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = ConfigLoader.get("base.url");
        Configuration.browser = ConfigLoader.get("chrome.browser");
        Configuration.browserSize = "1920x1080";
    }
}
