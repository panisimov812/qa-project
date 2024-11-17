package org.steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Anisimov Petr
 * Класс содержит обработку шагов для логирования
 */
public class LoggerSteps {
    private static final Logger logger = LoggerFactory.getLogger(FormSteps.class);

    public String formatFormLogMessage(String nameOfField, String valueForField) {
        return nameOfField != null
                ? String.format("Вводим значение: %s в поле %s ", valueForField, nameOfField)
                : String.format("Вводим значение: %s", valueForField);
    }
}