package api.jsonPlaceholderApiTests.steps;

import dataqa.api.page_object.UserApi;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

public class UserApiSteps {

    UserApi userApi = new UserApi();

    /**
     * Шаг для получения информации о пользователе и проверки полей.
     *
     * @param userId ID пользователя
     * @param expectedUsername Ожидаемое имя пользователя
     */
    @Step("Проверяем данные пользователя с ID {userId}")
    public void getUserAndCheckUsername(int userId, String expectedUsername) {
        Response response = userApi.getUser(userId);
        response.then().statusCode(200).body("username", equalTo(expectedUsername));
    }

    /**
     * Шаг для создания нового пользователя и проверки ответа.
     *
     * @param requestBody Тело запроса
     */
    @Step("Создаем пользователя и проверяем ответ")
    public void createUserAndCheckResponse(String requestBody) {
        Response response = userApi.createUser(requestBody);
        response.then().statusCode(201).body("title", equalTo("foo"));
    }
}