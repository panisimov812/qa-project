package dataqa.api.page_object;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserApi {

    private static final String USERS_ENDPOINT = "/users";

    /**
     * Выполняет GET-запрос для получения информации о пользователе по его ID.
     *
     * @param userId Идентификатор пользователя, для которого требуется получить информацию.
     * @return Ответ от API, содержащий данные о пользователе.
     */
    public Response getUser(int userId) {
        return given()
                .pathParam("id", userId)
                .when()
                .get(USERS_ENDPOINT + "/{id}");
    }

    /**
     * Выполняет POST-запрос для создания нового пользователя.
     *
     * @param requestBody JSON-строка, содержащая данные нового пользователя, которые будут отправлены в теле запроса.
     * @return Ответ от API, содержащий информацию о созданном пользователе.
     */
    public Response createUser(String requestBody) {
        return given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post(USERS_ENDPOINT);
    }
}