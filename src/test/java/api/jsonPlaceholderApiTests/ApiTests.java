package api.jsonPlaceholderApiTests;

import api.jsonPlaceholderApiTests.steps.UserApiSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ApiTests extends BaseTest {

    UserApiSteps userApiSteps = new UserApiSteps();

    @Test
    @Owner("Имя тестировщика")
    @DisplayName("Проверка получения данных пользователя")
    @Description("Тест проверяет, что запрос к /users/{id} возвращает правильного пользователя")
    void getUserTest() {
        int userId = 1;
        String expectedUsername = "Bret";

        userApiSteps.getUserAndCheckUsername(userId, expectedUsername);
    }

    @Test
    @Owner("Имя тестировщика")
    @DisplayName("Создание нового поста")
    @Description("Тест проверяет, что запрос на создание поста возвращает правильные данные")
    void createPostTest() {
        String requestBody = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";

        userApiSteps.createUserAndCheckResponse(requestBody);
    }
}