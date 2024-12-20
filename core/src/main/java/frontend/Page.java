package frontend;

import org.commonSteps.frontendSteps.BrowserSteps;
import org.config.ConfigLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.Navigation;

public abstract class Page {
    Navigation navigation = new Navigation();
    BrowserSteps browserSteps = new BrowserSteps();

    protected String url;
    private static final Logger logger = LoggerFactory.getLogger(Page.class);

    public Page(String url) {
        this.url = url;
    }

    public void open() {
        logger.info("Открытие страницы: " + ConfigLoader.get(url));
        navigation.openPage(url);
    }

    public void reloadPage(){
        logger.info("Перезагрузка страницы: " + ConfigLoader.get(url));
        browserSteps.reloadCurrentPage();
    }



}
