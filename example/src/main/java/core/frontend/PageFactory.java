package core.frontend;

import ui.pages.TextBoxPage;

/**
 * Добавляйте методы для создания других страниц
 */
public class PageFactory {

    /**
     * Создает экземпляр TextBoxPage.
     *
     * @return новый экземпляр TextBoxPage
     */
    public static TextBoxPage createTextBoxPage(){
        return new TextBoxPage();
    }
}