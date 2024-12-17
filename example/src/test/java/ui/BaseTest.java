package ui;

import com.codeborne.selenide.Configuration;
import org.config.ConfigLoader;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(BaseTest.class);

    @BeforeAll
    static void setUp() {
        /**
         * Устанавливаем базовый URL по умолчанию который находится в файле
         * application.properties
         */
        Configuration.browser = ConfigLoader.getOrDefault(
                "chrome.browser",
                "chrome"); // Значение по умолчанию "chrome"
        Configuration.browserSize = ConfigLoader.get("browser.size");

        logger.info("Base URL: {}", Configuration.baseUrl);
        logger.info("Browser: {}", Configuration.browser);
        logger.info("Browser Size: {}", Configuration.browserSize);
    }

    @AfterAll
    static void tearDown() {
        closeWebDriver();
    }
}
