package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Quotes;

public class Selectors {

    static final String NORMALIZE_SPACE_XPATH = "normalize-space(translate(string(.), '\t\n\r\u00a0', '    '))";

    /**
     * Метод для поиска элемента на странице по его уникальному атрибуту id.
     *
     * @param id Значение атрибута id элемента на веб-странице.
     * @return Возвращает объект типа By, который находит элементы по CSS-селектору с использованием id.
     *         В CSS-селекторе id указывается через символ решетки (#).
     *         Пример использования: <div id="element-id"></div>.
     */
    public static By byID(String id) {
        return By.cssSelector("#" + id);
    }

    /**
     * Метод для поиска элемента на странице по атрибуту class.
     *
     * @param className Значение атрибута class элемента на веб-странице.
     * @return Возвращает объект типа By, который находит элементы по CSS-селектору с использованием атрибута class.
     *         Пример использования: <div class="element-class"></div>.
     */
    public static By byClass(String className) {
        return By.cssSelector("[class='" + className + "']");
    }

    /**
     * Метод для поиска элемента на странице по атрибуту name.
     *
     * @param nameValue Значение атрибута name элемента на веб-странице.
     * @return Возвращает объект типа By, который используется для поиска элемента по атрибуту name с помощью метода By.name().
     *         Пример использования: <input name="element-name" />.
     */
    public static By byName(String nameValue) {
        return By.name(nameValue);
    }

    /**
     * Метод для поиска элемента на странице с помощью XPath выражения.
     *
     * @param xpathValue XPath выражение, которое идентифицирует элемент на веб-странице.
     * @return Возвращает объект типа By, который используется для поиска элемента по указанному XPath выражению с помощью метода By.xpath().
     *         Пример использования: By.xpath("//div[@id='element-id']").
     */
    public static By byXpath(String xpathValue){
        return By.xpath(xpathValue);
    }

    /**
     *
     * @param value Метод принимает строку value, которая представляет значение атрибута
     *              data-testid элемента на веб-странице.
     * @return Возвращается объект By, созданный с помощью метода By.cssSelector(),
     *          который использует CSS-селектор. Этот селектор ищет элементы,
     *          у которых есть атрибут data-testid с заданным значением value.
     *  Пример использования:
     * 	•	Допустим, у вас есть элемент <div data-testid="submit-button"></div>.
     * 	•	Вы можете найти этот элемент с помощью метода: driver.findElement(byDataTestId("submit-button")).
     *
     * Это позволяет легко работать с атрибутом data-testid,
     * который часто используется для тестирования, чтобы точно идентифицировать элементы на странице.
     */
    public static By byDataTestId(String value){
        return By.cssSelector("[data-testid='" + value + "']");
    }

    /**
     * Метод для поиска элемента на странице по атрибуту data-pagename.
     *
     * @param value Метод принимает строку value, которая представляет значение атрибута
     *              data-pagename элемента на веб-странице.
     * @return Возвращается объект типа By, созданный с помощью метода By.cssSelector().
     *         Этот CSS-селектор находит элементы, у которых атрибут data-pagename имеет значение,
     *         соответствующее переданной строке value.
     *         Пример использования:
     *         Если на странице есть элемент, например: <div data-pagename="home-page"></div>,
     *         то для его поиска в коде можно использовать:
     *         driver.findElement(byDataPageName("home-page"));
     */
    public static By byDataPageName(String value) {
        return By.cssSelector("[data-pagename='" + value + "']");
    }

    /**
     * Метод для поиска элемента на странице с помощью CSS-селектора.
     *
     * @param css CSS-селектор, который используется для идентификации элемента на веб-странице.
     * @return Возвращает объект типа By, который используется для поиска элемента по CSS-селектору с помощью метода By.cssSelector().
     *         Пример использования: <div class="example"></div> можно найти с помощью вызова метода: byCss(".example").
     */
    public static By byCss(String css) {
        return By.cssSelector(css);
    }

    /**
     * Метод для поиска элемента на странице по атрибуту title.
     *
     * @param name Значение атрибута title элемента на веб-странице.
     * @return Возвращает объект типа By, который используется для поиска элемента по атрибуту title с помощью CSS-селектора.
     *         Пример использования: <div title="example-title"></div> можно найти с помощью вызова метода: byTitle("example-title").
     */
    public static By byTitle(String name) {
        return By.cssSelector("[title='" + name + "']");
    }

    /**
     * Метод для поиска элемента на странице, который содержит указанный текст.
     * Использует XPath для поиска текстовых узлов, а затем возвращает родительский элемент,
     * содержащий этот текст. Метод нормализует пробелы в тексте и экранирует специальные символы.
     *
     * @param elementText Текст, который необходимо найти в элементе.
     * @return Возвращает объект типа By, который используется для поиска элемента, содержащего указанный текст.
     *         XPath выражение нормализует пробелы и экранирует символы, чтобы избежать ошибок при поиске текста.
     *         Пример использования: <div>   Пример текста   </div> можно найти с помощью вызова метода: byText("Пример текста").
     */
    public static By byText(String elementText) {
        return By.xpath(".//*/text()[" + NORMALIZE_SPACE_XPATH + " = " + Quotes.escape(elementText) + "]/parent::*");
    }


}
