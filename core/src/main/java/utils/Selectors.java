    package utils;

    import org.jetbrains.annotations.Contract;
    import org.jetbrains.annotations.NotNull;
    import org.openqa.selenium.By;
    import org.openqa.selenium.support.ui.Quotes;

    import java.util.Objects;

    public class Selectors {

        static final String NORMALIZE_SPACE_XPATH = "normalize-space(translate(string(.), '\t\n\r\u00a0', '    '))";
        /**
         * Метод для поиска элемента на странице по его уникальному атрибуту id.
         *
         * @param id Значение атрибута id элемента на веб-странице.
         * @return Возвращает объект типа By, который находит элементы по CSS-селектору с использованием id.
         * В CSS-селекторе id указывается через символ решетки (#).
         * Пример использования: <div id="element-id"></div>.
         */
        @Contract("_ -> new")
        public static @NotNull By byID(String id) {
            Objects.requireNonNull(id, "Значение не может быть null");
            return By.cssSelector("#" + id);
        }

        /**
         * Метод для поиска элемента на странице по атрибуту class.
         *
         * @param className Значение атрибута class элемента на веб-странице.
         * @return Возвращает объект типа By, который находит элементы по CSS-селектору с использованием атрибута class.
         * Пример использования: <div class="element-class"></div>.
         */
        @Contract("_ -> new")
        public static @NotNull By byClass(String className) {
            Objects.requireNonNull(className, "Значение не может быть null");
            return By.cssSelector("[class='" + className + "']");
        }

        /**
         * Метод для поиска элемента на странице по атрибуту name.
         *
         * @param nameValue Значение атрибута name элемента на веб-странице.
         * @return Возвращает объект типа By, который используется для поиска элемента по атрибуту name с помощью метода By.name().
         * Пример использования: <input name="element-name" />.
         */
        @Contract("_ -> new")
        public static @NotNull By byName(String nameValue) {
            Objects.requireNonNull(nameValue, "Значение не может быть null");
            return By.name(nameValue);
        }

        /**
         * Метод для поиска элемента на странице с помощью XPath выражения.
         *
         * @param xpathValue XPath выражение, которое идентифицирует элемент на веб-странице.
         * @return Возвращает объект типа By, который используется для поиска элемента по указанному XPath выражению с помощью метода By.xpath().
         * Пример использования: By.xpath("//div[@id='element-id']").
         */
        @Contract("_ -> new")
        public static @NotNull By byXpath(String xpathValue) {
            Objects.requireNonNull(xpathValue, "Значение не может быть null");
            return By.xpath(xpathValue);
        }

        /**
         * @param value Метод принимает строку value, которая представляет значение атрибута
         *              data-testid элемента на веб-странице.
         * @return Возвращается объект By, созданный с помощью метода By.cssSelector(),
         * который использует CSS-селектор. Этот селектор ищет элементы,
         * у которых есть атрибут data-testid с заданным значением value.
         * Пример использования:
         * •	Допустим, у вас есть элемент <div data-testid="submit-button"></div>.
         * •	Вы можете найти этот элемент с помощью метода: driver.findElement(byDataTestId("submit-button")).
         * <p>
         * Это позволяет легко работать с атрибутом data-testid,
         * который часто используется для тестирования, чтобы точно идентифицировать элементы на странице.
         */
        @Contract("_ -> new")
        public static @NotNull By byDataTestId(String value) {
            Objects.requireNonNull(value, "Значение не может быть null");
            return By.cssSelector("[data-testid='" + value + "']");
        }

        /**
         * Метод для поиска элемента на странице по атрибуту data-pagename.
         *
         * @param value Метод принимает строку value, которая представляет значение атрибута
         *              data-pagename элемента на веб-странице.
         * @return Возвращается объект типа By, созданный с помощью метода By.cssSelector().
         * Этот CSS-селектор находит элементы, у которых атрибут data-pagename имеет значение,
         * соответствующее переданной строке value.
         * Пример использования:
         * Если на странице есть элемент, например: <div data-pagename="home-page"></div>,
         * то для его поиска в коде можно использовать:
         * driver.findElement(byDataPageName("home-page"));
         */
        @Contract("_ -> new")
        public static @NotNull By byDataPageName(String value) {
            Objects.requireNonNull(value, "Значение не может быть null");
            return By.cssSelector("[data-pagename='" + value + "']");
        }

        /**
         * Метод для поиска элемента на странице с помощью CSS-селектора.
         *
         * @param cssValue CSS-селектор, который используется для идентификации элемента на веб-странице.
         * @return Возвращает объект типа By, который используется для поиска элемента по CSS-селектору с помощью метода By.cssSelector().
         * Пример использования: <div class="example"></div> можно найти с помощью вызова метода: byCss(".example").
         */
        @Contract("_ -> new")
        public static @NotNull By byCss(String cssValue) {
            Objects.requireNonNull(cssValue, "Значение не может быть null");
            return By.cssSelector(cssValue);
        }

        /**
         * Метод для поиска элемента на странице по атрибуту title.
         *
         * @param titleName Значение атрибута title элемента на веб-странице.
         * @return Возвращает объект типа By, который используется для поиска элемента по атрибуту title с помощью CSS-селектора.
         * Пример использования: <div title="example-title"></div> можно найти с помощью вызова метода: byTitle("example-title").
         */
        @Contract("_ -> new")
        public static @NotNull By byTitle(String titleName) {
            Objects.requireNonNull(titleName, "Значение не может быть null");
            return By.cssSelector("[title='" + titleName + "']");
        }

        /**
         * Метод для поиска элемента на странице, который содержит указанный текст.
         * Использует XPath для поиска текстовых узлов, а затем возвращает родительский элемент,
         * содержащий этот текст. Метод нормализует пробелы в тексте и экранирует специальные символы.
         *
         * @param elementText Текст, который необходимо найти в элементе.
         * @return Возвращает объект типа By, который используется для поиска элемента, содержащего указанный текст.
         * XPath выражение нормализует пробелы и экранирует символы, чтобы избежать ошибок при поиске текста.
         * Пример использования: <div>   Пример текста   </div> можно найти с помощью вызова метода: byText("Пример текста").
         */
        @Contract("_ -> new")
        public static @NotNull By byText(String elementText) {
            Objects.requireNonNull(elementText, "Значение не может быть null");
            return By.xpath(".//*/text()[" + NORMALIZE_SPACE_XPATH + " = " + Quotes.escape(elementText) + "]/parent::*");
        }


    }
