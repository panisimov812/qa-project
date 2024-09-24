# README: Тестовый фреймворк на Java

## Введение

Добро пожаловать в тестовый фреймворк на Java! Этот фреймворк предназначен для автоматизации API и UI тестирования с использованием современных инструментов, таких как **Allure**, **Selenide**, **Serenity**, **RestAssured** и **JUnit 5**. Он подходит как для новичков, так и для опытных тестировщиков. Структура фреймворка следует лучшим практикам индустрии, что делает его удобным для масштабирования и интеграции в любой проект.

### Основные особенности:
- **Allure** для детализированных отчетов.
- **Selenide** для автоматизации взаимодействий с веб-элементами.
- **RestAssured** для тестирования API.
- **JUnit 5** для организации и запуска тестов.
- **Serenity** для удобного написания BDD-тестов.

---
### Системные требования
Убедитесь, что на вашем компьютере установлены следующие программы:
- **Java 11** или новее.
- **Maven**.
- **Git**.

### Структура проекта
Проект организован по следующей структуре:
- src/test/java — содержит все тесты и вспомогательные классы.
- api — API-тесты, использующие RestAssured.
- ui — UI-тесты, использующие Selenide.
- steps — шаги для тестов, которые включают действия и проверки.
```bash
src
└── main
    └── java
        └── dataqa
            ├── api
            │   └── page_object
            │       └── UserApi.java  // Класс для взаимодействия с API. 
            │                          // Содержит методы для выполнения HTTP-запросов (GET, POST) для работы с пользователями.
            └── mainPage
                └── page_object
                    ├── pages
                    │   ├── BasePage.java  // Базовый класс для страниц, содержащий общие методы для открытия страниц.
                    │   └── ElementsPage.java  // Класс, представляющий страницу с элементами. 
                    │                               // Содержит методы для взаимодействия с элементами формы и проверки их значений.
                    └── utils
                        └── Selectors.java  // Утилитарный класс для определения селекторов для поиска элементов на страницах по различным атрибутам (id, class, name и т.д.).
└── test
    └── java
        ├── api
        │   └── jsonPlaceholderApiTests
        │       ├── ApiTests.java  // Тестовый класс для выполнения API-тестов. Содержит тестовые методы, которые используют шаги из UserApiSteps.
        │       ├── BaseTest.java  // Базовый класс для настройки окружения для API-тестов (установка базового URI).
        │       └── steps
        │           └── UserApiSteps.java  // Класс с шагами для выполнения действий с API, использующий методы из UserApi.
        └── ui
            └── demoqaUiTests
                ├── textBoxTests
                │   ├── TextBoxTests.java  // Тестовый класс для выполнения UI-тестов на странице с текстовыми полями. Содержит тестовые методы, использующие шаги из TextBoxSteps.
                │   └── steps
                │       └── TextBoxSteps.java  // Класс с шагами для выполнения действий на UI-страницах, использующий методы из ElementsPage.
                └── BaseTest.java  // Базовый класс для настройки окружения для UI-тестов (установка базового URL и конфигурации браузера).
```
## Как начать
1) Запросите доступ к клонированию проекта с репозитория
2) используя команду:
```bash
git clone https://github.com/panisimov812/qa-project.git
```

### Шаг 2: Сборка проекта
Для сборки проекта выполните следующую команду:
```bash
./gradlew build
```

### Шаг 3: Запуск тестов
Перед запуском тестов убедитесь что вы находитесь в дериктории с тестами /qa-project
1) команда pwd выводит полный путь текущей директории,
2) команда ls отображает список файлов и папок в текущей директории.
3) команда cd для смены текущей директории.
4) команда cd .. перемещает вас на один уровень выше в файловой системе

- Для запуска всех тестов в классе, (на скриншоте номер 1) перейдите в класс с тесами и нажмите на зеленый треугольник рядом с именем класса
- Для запуска определенного теста в классе, (на скриншоте номер 2) нажмите на зеленый треугольник рядом с тестом
![img.png](img.png)
3) запуск теста через консоль 

```bash
./gradlew clean test;
```
### Шаг 4: Генерация отчета Allure
После выполнения тестов сгенерируйте отчет Allure:
```bash
./gradlew allureServe
```
Отчет будет доступен в вашем браузере по умолчанию.
![img_1.png](img_1.png)
![img_2.png](img_2.png)