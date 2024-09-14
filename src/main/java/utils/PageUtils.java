package utils;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;

public class PageUtils {

    /**
     * Проверяет, что страница полностью загружена.
     *
     * @param pageUrl  WebDriver, используемый для управления браузером.
     * @param timeoutInSeconds Время ожидания в секундах, по истечении которого метод считает, что страница не загружена.
     * @return Возвращает true, если страница полностью загружена, и false в противном случае.
     */
    public static boolean isPageLoaded(String pageUrl, int timeoutInSeconds) {
        WebDriver driver = new ChromeDriver();

        try {
            // Перейдите на указанный URL
            driver.get(pageUrl);

            // Создайте WebDriverWait с указанным временем ожидания
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));

            // Определите условие для проверки загрузки страницы
            ExpectedCondition<Boolean> pageLoadCondition = driver1 -> {
                JavascriptExecutor js = (JavascriptExecutor) driver1;
                assert js != null;
                return "complete".equals(Objects.requireNonNull(js.executeScript("return document.readyState")).toString());
            };

            // Дождитесь выполнения условия
            return wait.until(pageLoadCondition);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            // Закройте драйвер
            driver.quit();
        }
    }

    // Получить все элементы с классом 'card mt-4 top-card'
    public SelenideElement getElementFromPageByIndex(int index) {
        return (SelenideElement) $(".card.mt-4.top-card").getSize();
    }

}
