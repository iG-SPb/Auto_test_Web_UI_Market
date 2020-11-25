package ru.geekbrains.HomeWork6.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.HomeWork6.base.BasePage;

public class ReadNews extends BasePage {
    @FindBy(xpath = "//a[text()='Новости компании']")
    private WebElement mainNews;
    @FindBy(xpath = "(//div[@data-tid='52d2a827'])[1]")
    private WebElement firstNews;
    @FindBy(xpath = "//a[text()='Все новости']")
    private WebElement allNews;
    @FindBy(xpath = "(//div[@data-tid='52d2a827'])[2]")
    private WebElement secondNews;
    @FindBy(xpath = "//span[text()='Показать ещё']/parent::button")
    private WebElement dopNews;

    public ReadNews(WebDriver driver) {
        super(driver);
    }

    @Step("Переход к новостям компании")
    public ReadNews enterMainNews() {
        mainNews.click();
        return this;
    }

    @Step("Чтение первой новости")
    public ReadNews enterFirstNews() {
        firstNews.click();
        return this;
    }

    @Step("Возврат ко всем новостям")
    public ReadNews enterAllNews() {
        allNews.click();
        return this;
    }

    @Step("Чтение второй новости")
    public ReadNews enterSecondNews() {
        secondNews.click();
        return this;
    }
    @Step("Чтение второй новости")
    public ReadNews enterDopNews() {
        dopNews.click();
        return this;
    }
}
