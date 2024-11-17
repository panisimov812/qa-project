package org.steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Anisimov Petr
 * Класс содержит обработку шагов для логирования
 */
public class LoggerSteps {

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