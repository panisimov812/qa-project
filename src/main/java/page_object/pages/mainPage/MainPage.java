package page_object.pages.mainPage;

import com.codeborne.selenide.SelenideElement;
import utils.Selectors;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class MainPage {

    //Заголовки плашек с главной страницы
    private final By FIRST_CARD_TITLE = Selectors.byText("Elements");
    private final By SECOND_CARD_TITLE = Selectors.byText("Forms");
    private final By THIRD_CARD_TITLE = Selectors.byText("Alerts, Frame & Windows");
    private final By FOURTH_CARD_TITLE = Selectors.byText("Widgets");
    private final By FIFTH_CARD_TITLE = Selectors.byText("Interactions");
    private final By SIXTH_CARD_TITLE = Selectors.byText("Book Store Application");


    // Получить все элементы с классом 'card mt-4 top-card'
    private SelenideElement getCardByIndex(int index) {
        return (SelenideElement) $(".card.mt-4.top-card").getSize();
    }


}
