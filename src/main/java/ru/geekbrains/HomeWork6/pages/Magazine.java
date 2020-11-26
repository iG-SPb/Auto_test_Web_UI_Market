package ru.geekbrains.HomeWork6.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.HomeWork6.base.BasePage;

public class Magazine extends BasePage {
    @FindBy(xpath = "//span[text()='Журнал Маркета']")
    private WebElement magazineMarket;
    @FindBy(xpath = "//a[text()='Гаджеты']/parent::div")
    private WebElement gadgetsMenu;
    @FindBy(xpath = "(//button[@aria-label='Показать ещё'])[1]")
    private WebElement dopMenu;
    @FindBy(xpath = "//div[text()='Обзор']")
    private WebElement reviewNews;
    @FindBy(xpath = "//a[text()='Журнал Маркета']")
    private WebElement returnMagazine;

    public Magazine(WebDriver driver) {
        super(driver);
    }

    @Step("Переход к Журналу Маркета")
    public Magazine enterMagazineMarket() {
        magazineMarket.click();
        return this;
    }

    @Step("Открытие раздела Гаджеты")
    public Magazine enterGadgetsMenu() {
        gadgetsMenu.click();
        return this;
    }

    @Step("Вывод дополнительных подразделов")
    public Magazine enterDopMenu() {
        dopMenu.click();
        return this;
    }

    @Step("Чтение обзора")
    public Magazine enterReviewNews() {
        reviewNews.click();
        return this;
    }
    @Step("Возврат к Журналу Маркета")
    public Magazine enterReturnMagazine() {
        returnMagazine.click();
        return this;
    }
}
