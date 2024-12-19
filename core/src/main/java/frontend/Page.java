package frontend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.Navigation;

public abstract class Page {
    Navigation navigation = new Navigation();

    protected String url;
    private static final Logger logger = LoggerFactory.getLogger(Page.class);

    public Page(String url) {
        this.url = url;
    }

    public void open() {
        logger.info("Открытие страницы: " + url);
        navigation.openPage(url);
    }
}
