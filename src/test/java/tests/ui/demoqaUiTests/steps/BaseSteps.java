package tests.ui.demoqaUiTests.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import utils.PageUtils;


public class BaseSteps {

    public void openElementPge(){

    }

    @Step("открываем страницу {0} через браузер Chrome")
    public static void openUrlByChrome(String url) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }

 //   @Step("открываем страницу {0} через браузер FireFox")
    public static void openUrlByFireFox(String url) {
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
    }

//    @Step("открываем страницу {0} через браузер Edge")
    public static void openUrlByEdge(String url) {
        WebDriver driver = new EdgeDriver();
        driver.get(url);
    }

 //   @Step("открываем страницу {0} через браузер Safari")
    public static void openUrlBySafari(String url) {
        WebDriver driver = new SafariDriver();
        driver.get(url);
    }

 //   @Step
    public static boolean pageIsLoaded(String pageUrl, int timeout) {
        return PageUtils.isPageLoaded(pageUrl, timeout);
    }



}
