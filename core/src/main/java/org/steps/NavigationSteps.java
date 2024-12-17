package org.steps;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.config.ConfigLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * NavigationSteps — шаги для навигации по страницам
 */
public class NavigationSteps extends LoggerSteps {
    private static final Logger logger = LoggerFactory.getLogger(NavigationSteps.class);

    /**
     * Открытие страницы по базовому URL и относительному пути.
     *
     * @param urlKey  Ключ для получения базового URL из конфигурации.
     * @param pageUrl Относительный путь страницы.
     */
    @Step("Открываем страницу {urlKey} с относительным путем {pageUrl}")
    public void openPage(String urlKey, String pageUrl) {
        String fullUrl = buildFullUrl(urlKey, pageUrl);
        try {
            logger.info("Успешно открыта страница {}", fullUrl);
            Selenide.open(fullUrl);
        } catch (Exception e) {
            logger.error("Не удалось открыть страницу {}", fullUrl, e);
            throw e;
        }
    }

    /**
     * Открытие страницы по полному URL из конфигурации.
     *
     * @param urlKey Ключ для получения полного URL из конфигурации.
     */
    @Step("Открываем страницу по ключу {urlKey}")
    public void openPage(String urlKey) {
        String fullUrl = ConfigLoader.get(urlKey);
        try {
            logger.info("Успешно открыта страница {}", fullUrl);
            Selenide.open(fullUrl);
        } catch (Exception e) {
            logger.error("Не удалось открыть страницу {}", fullUrl, e);
            throw e;
        }
    }

    /**
     * Построение полного URL на основе ключа и относительного пути.
     *
     * @param urlKey  Ключ для получения базового URL.
     * @param pageUrlKey Относительный путь страницы.
     * @return Полный URL.
     */
    private String buildFullUrl(String urlKey, String pageUrlKey) {
        String baseUrl = ConfigLoader.get(urlKey);
        String pageUrl = ConfigLoader.get(pageUrlKey);
        if (!baseUrl.endsWith("/") && !pageUrl.startsWith("/")) {
            return baseUrl + "/" + pageUrl;
        }
        return baseUrl + pageUrl;
    }
}