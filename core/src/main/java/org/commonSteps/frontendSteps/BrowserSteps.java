package org.commonSteps.frontendSteps;

import com.codeborne.selenide.Selenide;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.Navigation;

public class BrowserSteps   {
    private static final Logger logger = LoggerFactory.getLogger(Navigation.class);

    public void reloadCurrentPage() {
        try {
            logger.info("Успешно перезагрузилась страница");
            Selenide.refresh();
        } catch (Exception e) {
            logger.error("Ошибка перезагрузки страницы");
            throw e;
        }
    }
}
