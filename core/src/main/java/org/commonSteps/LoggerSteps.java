package org.commonSteps;
import io.qameta.allure.Step;

/**
 * @author Anisimov Petr
 * Класс содержит обработку шагов для логирования
 */
public class LoggerSteps {

    @Step("Форматируем лог сообщение для поля {0} с значением {1}")
    public String formatFormLogMessage(String nameOfField, String valueForField) {
        return nameOfField != null
                ? String.format("Вводим значение: %s в поле %s ", valueForField, nameOfField)
                : String.format("Вводим значение: %s", valueForField);
    }

    public String formatButtonLogMessage(String nameOfButton) {
        return nameOfButton != null
                ? String.format("Кликаем на кнопку: %s ", nameOfButton)
                : "Кликаем на кнопку";
    }
}