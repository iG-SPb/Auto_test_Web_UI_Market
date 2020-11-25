package ru.geekbrains.HomeWork6.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import ru.geekbrains.HomeWork6.base.BasePage;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Assert that current url equals {baseUrl}")
    public void checkUrl(String baseUrl) {
        assertThat(driver.getCurrentUrl()).isEqualTo(baseUrl);
    }

}
